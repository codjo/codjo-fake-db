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
import junit.framework.TestCase;
/**
 *
 */
public class FakeConnectionTest extends TestCase {
    public void test_createStatement() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        Statement stmt = con.createStatement();
        assertEquals(stmt.getConnection(), con);
    }


    public void test_getMetaData() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        DatabaseMetaData stmt = con.getMetaData();
        assertNotNull(stmt);
    }


    @Override
    protected void setUp() throws ClassNotFoundException {
        Class.forName("fakedb.FakeDriver");
    }
}
