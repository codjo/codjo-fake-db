Framework codjo.net
===================

This library is part of the [framework codjo.net](http://codjo.net) effort.

## Description

This library is used to mock a JDBC driver for testing purpose.

## Example

### Mock a select query

    // Mock Query
    FakeDriver.getDriver().pushResultSet(new FakeResultSet(new Object[][]{{"period A"}, {"period B"}}),
                                         "select PERIOD from AP_PERIOD where ID = 11");

    // Production code
    Connection con = DriverManager.getConnection("jdbc:fakeDriver");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("select * from AP_PERIOD where ID = 11");
    rs.next // returns true
    rs.getString(1) // returns "period A"

### Mock an update query

tbd
