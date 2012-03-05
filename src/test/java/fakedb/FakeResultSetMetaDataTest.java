/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import junit.framework.TestCase;

public class FakeResultSetMetaDataTest extends TestCase {
    public void test_getColumnName() throws Exception {
        Object[][] matrix = {
              {"COL_A", "COL_B"},
              {"01", "02"}
        };
        ResultSetMetaData rs = new FakeResultSetMetaData(matrix).getStub();
        assertEquals(rs.getColumnName(1), "COL_A");
        assertEquals(rs.getColumnName(2), "COL_B");
    }


    public void test_getColumnName_noColName() throws Exception {
        Object[][] matrix = {
              {},
              {"01", "02"}
        };
        ResultSetMetaData metaData = new FakeResultSetMetaData(matrix).getStub();
        try {
            metaData.getColumnName(1);
        }
        catch (SQLException ex) {
        }
    }


    public void test_getColumnCount() throws Exception {
        Object[][] matrix = {
              {"COL_A", "COL_B"},
              {"01", "02"}
        };
        ResultSetMetaData rs = new FakeResultSetMetaData(matrix).getStub();
        assertEquals(rs.getColumnCount(), 2);
    }


    public void test_getColumnCount_EmptyResultSet()
          throws Exception {
        Object[][] matrix = {};
        ResultSetMetaData rs = new FakeResultSetMetaData(matrix).getStub();
        assertEquals(rs.getColumnCount(), 0);
    }


    public void test_getColumnName_badIndex() throws Exception {
        Object[][] matrix = {
              {"COL_A", "COL_B"},
              {"01", "02"}
        };
        ResultSetMetaData rs = new FakeResultSetMetaData(matrix).getStub();
        try {
            rs.getColumnName(3);
            fail("Column does not exist");
        }
        catch (SQLException ex) {
        }
    }


    public void test_unsupportedOperation() throws Exception {
        ResultSetMetaData rs = new FakeResultSetMetaData(null).getStub();
        try {
            rs.isAutoIncrement(0);
            fail("Unsupported Method");
        }
        catch (UnsupportedOperationException ex) {
        }
    }
}
