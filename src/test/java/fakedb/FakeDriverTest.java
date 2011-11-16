/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.Connection;
import java.sql.DriverManager;
import junit.framework.TestCase;
/**
 * Description of the Class
 *
 * @author boris
 */
public class FakeDriverTest extends TestCase {
    public void testRegister() throws Exception {
        Class.forName("fakedb.FakeDriver");

        assertTrue(DriverManager.getDriver("jdbc:fakeDriver") instanceof fakedb.FakeDriver);
    }


    public void test_acceptsURL() throws Exception {
        fakedb.FakeDriver driver = new fakedb.FakeDriver();

        assertTrue(driver.acceptsURL("jdbc:fakeDriver"));
        assertTrue(driver.acceptsURL("jdbc:fakeDriver:MaBase/dd"));
        assertFalse(driver.acceptsURL("jdbc:sybase"));
    }


    public void test_getConnection() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:fakeDriver");
        assertNotNull(con);
    }


    public void test_autoTrim() throws Exception {
        FakeDriver.getDriver().pushUpdateConstraint("toto");

        FakeDriver.getDriver().checkUpdateConstraint(" toto");
    }


    public void test_autoTrim2() throws Exception {
        FakeDriver.getDriver().pushUpdateConstraint(" toto");

        FakeDriver.getDriver().checkUpdateConstraint("toto");
    }


    public void test_resetFakes() throws Exception {
        FakeDriver.getDriver().pushUpdateConstraint("toto");

        FakeDriver.getDriver().resetFakes();

        try {
            FakeDriver.getDriver().checkUpdateConstraint(" toto");
            fail();
        }
        catch (BadQueryException ex) {
            ; // Ok
        }
    }
}
