/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.SQLException;
import junit.framework.TestCase;

public class FakeResultSetMetaDataTest extends TestCase {
    public void test_getColumnName() throws Exception {
        Object[][] matrix = {
              {"COL_A", "COL_B"},
              {"01", "02"}
        };
        FakeResultSetMetaData rs = new FakeResultSetMetaData(matrix);
        assertEquals(rs.getColumnName(1), "COL_A");
        assertEquals(rs.getColumnName(2), "COL_B");
    }


    public void test_getColumnName_noColName() throws Exception {
        Object[][] matrix = {
              {},
              {"01", "02"}
        };
        FakeResultSetMetaData metaData = new FakeResultSetMetaData(matrix);
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
        FakeResultSetMetaData rs = new FakeResultSetMetaData(matrix);
        assertEquals(rs.getColumnCount(), 2);
    }


    public void test_getColumnCount_EmptyResultSet()
          throws Exception {
        Object[][] matrix = {};
        FakeResultSetMetaData rs = new FakeResultSetMetaData(matrix);
        assertEquals(rs.getColumnCount(), 0);
    }


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
        catch (SQLException ex) {
        }
    }
}
