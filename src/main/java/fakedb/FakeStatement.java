/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import net.codjo.test.common.mock.ProxyDelegatorFactory;

@SuppressWarnings({"MethodParameterNamingConvention", "UnusedParameters"})
class FakeStatement {
    private Connection connection;
    private String[] parameters;
    private String prepareQuery;


    FakeStatement() {
    }


    public CallableStatement getStub() {
        return ProxyDelegatorFactory.getProxy(this, CallableStatement.class);
    }


    FakeStatement(String query) {
        prepareQuery = query;

        int paramNb = 0;
        for (int i = 0; i != -1; ) {
            i = query.indexOf("?", i);
            if (i != -1) {
                i++;
                paramNb++;
            }
        }
        if (paramNb > 0) {
            parameters = new String[paramNb];
        }
    }


    public void clearParameters() throws SQLException {
        for (int i = 0; i < parameters.length; i++) {
            parameters[i] = null;
        }
    }


    public void close() throws SQLException {
    }


    public boolean execute() throws SQLException {
        checkUpdateConstraint(builtQuery());
        return true;
    }


    public boolean execute(String sql) throws SQLException {
        checkUpdateConstraint(sql);
        return true;
    }


    public int[] executeBatch() throws SQLException {
        return new int[]{};
    }


    public ResultSet executeQuery() throws SQLException {
        return popResultSet(builtQuery());
    }


    public ResultSet executeQuery(String sql) throws SQLException {
        return popResultSet(sql);
    }


    public int executeUpdate() throws SQLException {
        checkUpdateConstraint(builtQuery());
        return 1;
    }


    public int executeUpdate(String sql) throws SQLException {
        checkUpdateConstraint(sql);
        return 1;
    }


    public Connection getConnection() throws SQLException {
        return connection;
    }


    public SQLWarning getWarnings() throws SQLException {
        return null;
    }


    public void setArray(int i, Array x) throws SQLException {
        setValue(i, "" + x);
    }


    public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setBlob(int i, Blob x) throws SQLException {
        setValue(i, "" + x);
    }


    public void setBoolean(int parameterIndex, boolean x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setByte(int parameterIndex, byte x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setBytes(int parameterIndex, byte[] x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
        setValue(parameterIndex, "" + reader);
    }


    public void setClob(int i, Clob x) throws SQLException {
        setValue(i, "" + x);
    }


    public void setConnection(Connection con) throws SQLException {
        this.connection = con;
    }


    public void setDate(int parameterIndex, Date x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setDouble(int parameterIndex, double x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setFetchSize(int rows) throws SQLException {
    }


    public void setFloat(int parameterIndex, float x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setInt(int parameterIndex, int x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setLong(int parameterIndex, long x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setNull(int parameterIndex, int sqlType) throws SQLException {
        setValue(parameterIndex, "null(sqlType=" + sqlType + ")");
    }


    public void setNull(int paramIndex, int sqlType, String typeName) throws SQLException {
        setNull(paramIndex, sqlType);
    }


    public void setObject(int parameterIndex, Object x, int targetSqlType, int scale) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setObject(int parameterIndex, Object x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setRef(int i, Ref x) throws SQLException {
        setValue(i, "" + x);
    }


    public void setShort(int parameterIndex, short x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setString(int parameterIndex, String x) throws SQLException {
        setValue(parameterIndex, x);
    }


    public void setTime(int parameterIndex, Time x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    private String builtQuery() throws SQLException {
        if (parameters == null) {
            return prepareQuery;
        }
        StringBuffer builtQuery = new StringBuffer(prepareQuery);
        for (int i = 0; i < parameters.length; i++) {
            if (parameters[i] == null) {
                throw new SQLException("Parameter " + (i + 1) + " has not been set");
            }
            int idx = builtQuery.toString().indexOf("?");
            builtQuery.replace(idx, idx + 1, parameters[i]);
        }
        return builtQuery.toString();
    }


    private void checkUpdateConstraint(String query) throws SQLException {
        FakeDriver.getDriver().checkUpdateConstraint(query);
    }


    private ResultSet popResultSet(String query) throws SQLException {
        FakeResultSet rs = FakeDriver.getDriver().popResultSet(query);
        rs.setStatement(this.getStub());
        return rs.getStub();
    }


    private void setValue(int parameterIndex, String val) {
        if (val == null) {
            throw new IllegalArgumentException("setXXX(i, null) est interdit");
        }
        parameters[parameterIndex - 1] = val;
    }
}
