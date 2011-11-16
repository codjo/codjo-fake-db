/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.SQLException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * Description of the Class
 *
 * @author boris
 * @version $Revision: 1.1.1.1 $
 */
public class FakeResultSetMetaDataTest extends TestCase {
    /**
     * Constructor for the FakeResultSetMetaDataTest object
     *
     * @param Name Description of Parameter
     */
    public FakeResultSetMetaDataTest(String Name) {
        super(Name);
    }

    /**
     * A unit test suite for JUnit
     *
     * @return The test suite
     */
    public static Test suite() {
        return new TestSuite(FakeResultSetMetaDataTest.class);
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_getColumnName() throws Exception {
        Object[][] matrix = {
                {"COL_A", "COL_B"},
                {"01", "02"}
            };
        FakeResultSetMetaData rs = new FakeResultSetMetaData(matrix);
        assertEquals(rs.getColumnName(1), "COL_A");
        assertEquals(rs.getColumnName(2), "COL_B");
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_getColumnName_noColName() throws Exception {
        Object[][] matrix = {
                {},
                {"01", "02"}
            };
        FakeResultSetMetaData d = new FakeResultSetMetaData(matrix);
        try {
            d.getColumnName(1);
        }
        catch (SQLException ex) {}
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_getColumnCount() throws Exception {
        Object[][] matrix = {
                {"COL_A", "COL_B"},
                {"01", "02"}
            };
        FakeResultSetMetaData rs = new FakeResultSetMetaData(matrix);
        assertEquals(rs.getColumnCount(), 2);
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_getColumnCount_EmptyResultSet()
        throws Exception {
        Object[][] matrix = {};
        FakeResultSetMetaData rs = new FakeResultSetMetaData(matrix);
        assertEquals(rs.getColumnCount(), 0);
    }


    /**
     * A unit test for JUnit
     *
     * @exception Exception Description of Exception
     */
    public void test_getColumnName_badIndex() throws Exception {
        Object[][] matrix = {
                {"COL_A", "COL_B"},
                {"01", "02"}
            };
        FakeResultSetMetaData rs = new FakeResultSetMetaData(matrix);
        try {
            rs.getColumnName(3);
            fail("Column does not exist");
        }
        catch (SQLException ex) {}
    }


    /**
     * The JUnit setup method
     */
    protected void setUp() {}


    /**
     * The teardown method for JUnit
     */
    protected void tearDown() {}
}
