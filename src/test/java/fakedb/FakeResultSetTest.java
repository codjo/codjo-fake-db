/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.ResultSet;
import java.sql.SQLException;
import junit.framework.TestCase;

public class FakeResultSetTest extends TestCase {

    public void test_getObject_ByIndex() throws Exception {
        Object[][] matrix = {
              {},
              {"01", "02"},
              {"11", "12"}
        };
        FakeResultSet rs = new FakeResultSet(matrix);

        rs.next();
        assertEquals(rs.getObject(1), "01");
        assertEquals(rs.getObject(2), "02");
        rs.next();
        assertEquals(rs.getObject(1), "11");
        assertEquals(rs.getObject(2), "12");
    }


    public void test_getMetaData() throws Exception {
        Object[][] matrix = {
              {},
              {"01", "02"},
              {"11", "12"}
        };
        FakeResultSet rs = new FakeResultSet(matrix);

        assertNotNull(rs.getMetaData());
    }


    public void test_getString() throws Exception {
        Object[][] matrix = {
              {},
              {"01"}
        };
        FakeResultSet rs = new FakeResultSet(matrix);
        rs.next();
        assertEquals(rs.getString(1), "01");
    }


    public void test_getDate() throws Exception {
        Object[][] matrix = {
              {},
              {java.sql.Date.valueOf("2001-03-18")}
        };
        FakeResultSet rs = new FakeResultSet(matrix);
        rs.next();
        assertEquals(rs.getDate(1), java.sql.Date.valueOf("2001-03-18"));
    }


    public void test_getInteger() throws Exception {
        Object[][] matrix = {
              {},
              {new Integer(1), null}
        };
        FakeResultSet rs = new FakeResultSet(matrix);
        rs.next();
        assertEquals(rs.getInt(1), 1);
    }


    public void test_next_NotCalled() throws Exception {
        Object[][] matrix = {
              {"ANOMALY", "ANOMALY_LOG"},
              {new Integer(0), null}
        };
        ResultSet rs = new FakeResultSet(matrix);
        try {
            rs.getObject("ANOMALY");
            fail("Next n'est pas appele, mais aucune erreur ne le signal");
        }
        catch (SQLException e) {
        }
    }


    public void test_update() throws Exception {
        Object[][] matrix = {
              {},
              {null, null}
        };
        FakeResultSet rs = new FakeResultSet(matrix);
        rs.next();
        Integer anInt = new Integer(5);
        rs.updateObject(1, anInt);
        assertEquals(rs.getInt(1), 5);
    }


    public void test_wasNull() throws Exception {
        Object[][] matrix = {
              {},
              {new Integer(1), null}
        };
        FakeResultSet rs = new FakeResultSet(matrix);
        rs.next();
        assertEquals(rs.getInt(1), 1);
        assertTrue("Not null", rs.wasNull() == false);
        assertEquals("Null Value", rs.getInt(2), 0);
        assertEquals("Null Value", rs.getFloat(2), 0., 0.);
        assertTrue("Was null", rs.wasNull() == true);
    }


    public void test_getObject_ByName() throws Exception {
        Object[][] matrix = {
              {"COL_A", "COL_B"},
              {"01", "02"},
              {"11", "12"}
        };
        FakeResultSet rs = new FakeResultSet(matrix);

        rs.next();
        assertEquals(rs.getObject("COL_A"), "01");
        assertEquals(rs.getObject("COL_B"), "02");
    }


    public void test_findColumn() throws Exception {
        Object[][] matrix = {
              {"COL_A", "COL_B"},
              {"01", "02"},
              {"11", "12"}
        };
        FakeResultSet rs = new FakeResultSet(matrix);

        assertEquals(rs.findColumn("COL_A"), 1);
        assertEquals(rs.findColumn("COL_B"), 2);
    }


    public void test_getObject_BadIndex() throws Exception {
        Object[][] matrix = {
              {},
              {"01", "02"}
        };
        FakeResultSet rs = new FakeResultSet(matrix);

        rs.next();
        try {
            rs.getObject(-1);
            fail("Index must be positive");
        }
        catch (SQLException e) {
        }
        try {
            rs.getObject(3);
            fail("Column does not exist");
        }
        catch (SQLException e) {
        }
    }


    public void test_next() throws Exception {
        Object[][] matrix = {
              {},
              {"01", "02"}
        };
        FakeResultSet rs = new FakeResultSet(matrix);

        assertTrue("first row", rs.next());
        assertTrue("no more row", rs.next() == false);
    }


    public void test_next_NoResult() throws Exception {
        Object[][] matrix = {};
        FakeResultSet rs = new FakeResultSet(matrix);

        assertTrue(rs.next() == false);
    }


    protected void setUp() {
    }


    protected void tearDown() {
    }
}
