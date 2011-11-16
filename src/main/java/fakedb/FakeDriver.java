/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Stack;
/**
 * Classe Driver.
 *
 * @author boris
 * @version $Revision: 1.4 $
 */
public class FakeDriver implements java.sql.Driver {
    public static final Object[][] EMPTY = {};
    public static final String NO_CONSTRAINT = "";
    public static final Object[][] RESULT_ONE = {
          {},
          {new java.math.BigDecimal(1)}
    };
    private static final FakeDriver instance;


    static {
        instance = new FakeDriver();
        try {
            DriverManager.registerDriver(instance);
        }
        catch (SQLException e) {
            error("Unable to register the FakeDriver", e);
        }
    }


    private Stack<String> constraints = new java.util.Stack<String>();
    private Stack<FakeResultSet> resultSets = new java.util.Stack<FakeResultSet>();
    private Stack<String> updateConstraints = new java.util.Stack<String>();


    FakeDriver() {
    }


    public static FakeDriver getDriver() {
        return instance;
    }


    public boolean acceptsURL(String url) throws SQLException {
        return url.startsWith("jdbc:fakeDriver");
    }


    public Connection connect(String url, Properties info)
          throws SQLException {
        if (acceptsURL(url)) {
            return new FakeConnection();
        }
        else {
            return null;
        }
    }


    public int getMajorVersion() {
        return 0;
    }


    public int getMinorVersion() {
        return 0;
    }


    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[]{};
    }


    public boolean isUpdateConstraintEmpty() {
        return updateConstraints.isEmpty();
    }


    public boolean hasMoreQuery() {
        boolean hasMoreQuery = !isUpdateConstraintEmpty() || !isResultSetConstraintEmpty();
        if (hasMoreQuery) {
            spoolQueryNotUsed();
        }
        return hasMoreQuery;
    }


    public void spoolQueryNotUsed() {
        infoLN("Query en update :");
        for (String query : updateConstraints) {
            infoLN("\tquery = " + query);
        }
        infoLN("Query avec ResultSet :");
        for (String query : constraints) {
            infoLN("\tquery = " + query);
        }
    }


    private boolean isResultSetConstraintEmpty() {
        return resultSets.isEmpty();
    }


    public boolean jdbcCompliant() {
        return false;
    }


    public void pushResultSet(Object[][] matrix) {
        pushResultSet(new FakeResultSet(matrix));
    }


    public void pushResultSet(Object[][] matrix, String constraint) {
        pushResultSet(new FakeResultSet(matrix), constraint);
    }


    public void pushUpdateConstraint(String constraint) {
        updateConstraints.push(constraint.trim());
    }


    public void resetFakes() {
        constraints.clear();
        resultSets.clear();
        updateConstraints.clear();
    }


    void checkUpdateConstraint(String query) throws BadQueryException {
        info("checkUpdateConstraint for : >" + query + "< ");
        if (updateConstraints.isEmpty()) {
            infoLN("NOK (no more constraint)");
            throw new BadQueryException(null, query);
        }
        String constraint = updateConstraints.pop();
        //noinspection StringEquality
        if (constraint != NO_CONSTRAINT && !query.trim().equals(constraint)) {
            infoLN("NOK (Bad query)");
            updateConstraints.push(constraint);
            throw new BadQueryException(constraint, query);
        }
        infoLN("OK");
    }


    FakeResultSet popResultSet(String query) throws SQLException {
        info("Return ResultSet for >" + query + "< ");
        if (resultSets.isEmpty()) {
            infoLN("NOK (no more ResultSet)");
            throw new SQLException("No more ResultSet available for this query" + " >"
                                   + query + "<");
        }
        FakeResultSet rs = resultSets.pop();
        String expected = constraints.pop();
        //noinspection StringEquality
        if (expected != NO_CONSTRAINT && !expected.equals(query.trim())) {
            infoLN("NOK (BadQuery)");
            resultSets.push(rs);
            constraints.push(expected);
            throw new BadQueryException(expected, query);
        }
        infoLN("OK");
        return rs;
    }


    void pushResultSet(FakeResultSet rs) {
        pushResultSet(rs, NO_CONSTRAINT);
    }


    void pushResultSet(FakeResultSet rs, String queryConstraint) {
        resultSets.push(rs);
        constraints.push(queryConstraint.trim());
    }


    private void info(String msg) {
        //noinspection UseOfSystemOutOrSystemErr
        System.out.print(msg);
    }


    private void infoLN(String msg) {
        //noinspection UseOfSystemOutOrSystemErr
        System.out.println(msg);
    }


    private static void error(String msg, Exception error) {
        //noinspection UseOfSystemOutOrSystemErr
        System.err.println(msg);
        //noinspection CallToPrintStackTrace
        error.printStackTrace();
    }
}
