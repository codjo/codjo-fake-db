/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Classe Test de FakeConnection
 *
 * @author boris
 * @version $Revision: 1.1.1.1 $
 */
public class FakeStatementTest extends TestCase {
    /**
     * Constructor for the FakeStatementTest object
     *
     * @param Name Description of Parameter
     */
    public FakeStatementTest(String Name) {
        super(Name);
    }

    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_executeQuery() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        Statement stmt = con.createStatement();

        Object[][] matrix = {
                {},
                {"200011"}
            };
        FakeDriver.getDriver().pushResultSet(new FakeResultSet(matrix),
            "select PERIOD from AP_PERIOD where ID = 11");

        ResultSet rs = stmt.executeQuery("select PERIOD from AP_PERIOD where ID = 11");
        rs.next();
        assertEquals(rs.getString(1), "200011");
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_executeUpdate() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        FakeDriver.getDriver().pushUpdateConstraint(FakeDriver.NO_CONSTRAINT);
        Statement stmt = con.createStatement();
        stmt.executeUpdate("insert into AP_PERIOD (PERIOD) values (BOBO)");
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_executeUpdate_BadQuery() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        Statement stmt = con.createStatement();

        FakeDriver.getDriver().pushUpdateConstraint("cc");
        FakeDriver.getDriver().pushUpdateConstraint("bb");
        FakeDriver.getDriver().pushUpdateConstraint("aa");

        stmt.executeUpdate("aa");
        stmt.executeUpdate("bb");
        try {
            stmt.executeUpdate("aa");
            fail("Query Update has been constrained");
        }
        catch (BadQueryException e) {}
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_executeQuery_BadQuery() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        Statement stmt = con.createStatement();

        Object[][] matrix = {
                {},
                {"200011"}
            };
        FakeDriver.getDriver().pushResultSet(new FakeResultSet(matrix),
            "select PERIOD from AP_PERIOD where ID = 11");

        try {
            stmt.executeQuery("select * from AP_PERIOD");
            fail("Mauvaise requete");
        }
        catch (BadQueryException e) {}
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_executeQuery_PreparedStatement()
        throws Exception {
        Object[][] matrix = {
                {},
                {"200011"}
            };
        FakeDriver.getDriver().pushResultSet(new FakeResultSet(matrix),
            "select * from TABLE where ID = 11 and NAME = toto");

        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        PreparedStatement stmt =
            con.prepareStatement("select * from TABLE where ID = ? and NAME = ?");

        stmt.setInt(1, 11);
        stmt.setString(2, "toto");
        ResultSet rs = stmt.executeQuery();
        rs.next();
        assertEquals(rs.getString(1), "200011");
    }


    public void test_executeQuery_PreparedStatement_bug()
        throws Exception {
        Object[][] matrix = {
                {},
                {"200011"}
            };
        FakeDriver.getDriver().pushResultSet(new FakeResultSet(matrix),
            "select PERIOD,DAY_NUMBER from AP_VALUATION_PERIOD where VALUATION_PERIOD_CODE=null(sqlType=12)");

        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        PreparedStatement stmt =
            con.prepareStatement(
                "select PERIOD,DAY_NUMBER from AP_VALUATION_PERIOD where VALUATION_PERIOD_CODE=?");

        stmt.setNull(1, Types.VARCHAR);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        assertEquals(rs.getString(1), "200011");
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_executeQuery_PreparedStatement_NoParameter()
        throws Exception {
        Object[][] matrix = {
                {},
                {"200011"}
            };
        FakeDriver.getDriver().pushResultSet(new FakeResultSet(matrix),
            "select * from TABLE");

        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        PreparedStatement stmt = con.prepareStatement("select * from TABLE");

        ResultSet rs = stmt.executeQuery();
        rs.next();
        assertEquals(rs.getString(1), "200011");
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_getMetaData() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        DatabaseMetaData stmt = con.getMetaData();
        assertNotNull(stmt);
    }


    /**
     * The JUnit setup method
     *
     * @exception ClassNotFoundException Description of Exception
     */
    protected void setUp() throws ClassNotFoundException {
        Class.forName("fakedb.FakeDriver");
    }


    /**
     * The teardown method for JUnit
     */
    protected void tearDown() {}


    /**
     * A unit test suite for JUnit
     *
     * @return The test suite
     */
    public static Test suite() {
        return new TestSuite(FakeStatementTest.class);
    }
}
