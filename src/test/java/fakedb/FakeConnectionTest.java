/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Classe Test de FakeConnection
 *
 * @author boris
 * @version $Revision: 1.2 $
 */
public class FakeConnectionTest extends TestCase {
    /**
     * Constructor for the FakeConnectionTest object
     *
     * @param Name Description of Parameter
     */
    public FakeConnectionTest(String Name) {
        super(Name);
    }

    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_createStatement() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        Statement stmt = con.createStatement();
        assertEquals(stmt.getConnection(), con);
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
        return new TestSuite(FakeConnectionTest.class);
    }
}
