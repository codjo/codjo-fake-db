/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ParameterMetaData;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;
import net.codjo.test.common.mock.CallableStatementMock;

@SuppressWarnings({"MethodParameterNamingConvention"})
class FakeStatement extends CallableStatementMock {
    private Connection connection;
    private String[] parameters;
    private String prepareQuery;


    FakeStatement() {
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


    public void addBatch() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method addBatch() not yet implemented.");
    }


    public void addBatch(String sql) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method addBatch() not yet implemented.");
    }


    public void cancel() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method cancel() not yet implemented.");
    }


    public void clearBatch() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method clearBatch() not yet implemented.");
    }


    public void clearParameters() throws SQLException {
        for (int i = 0; i < parameters.length; i++) {
            parameters[i] = null;
        }
    }


    public void clearWarnings() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method clearWarnings() not yet implemented.");
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


    public Array getArray(int i) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getArray() not yet implemented.");
    }


    public BigDecimal getBigDecimal(int parameterIndex, int scale) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBigDecimal() not yet implemented.");
    }


    public BigDecimal getBigDecimal(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBigDecimal() not yet implemented.");
    }


    public Blob getBlob(int i) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBlob() not yet implemented.");
    }


    public boolean getBoolean(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBoolean() not yet implemented.");
    }


    public byte getByte(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getByte() not yet implemented.");
    }


    public byte[] getBytes(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBytes() not yet implemented.");
    }


    public Clob getClob(int i) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getClob() not yet implemented.");
    }


    public Connection getConnection() throws SQLException {
        return connection;
    }


    public boolean getMoreResults(int current) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getMoreResults not yet implemented.");
    }


    public ResultSet getGeneratedKeys() throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getGeneratedKeys not yet implemented.");
    }


    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.executeUpdate not yet implemented.");
    }


    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.executeUpdate not yet implemented.");
    }


    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.executeUpdate not yet implemented.");
    }


    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.execute not yet implemented.");
    }


    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.execute not yet implemented.");
    }


    public boolean execute(String sql, String[] columnNames) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.execute not yet implemented.");
    }


    public int getResultSetHoldability() throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getResultSetHoldability not yet implemented.");
    }


    public Date getDate(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDate() not yet implemented.");
    }


    public Date getDate(int parameterIndex, Calendar cal) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDate() not yet implemented.");
    }


    public double getDouble(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDouble() not yet implemented.");
    }


    public int getFetchDirection() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getFetchDirection() not yet implemented.");
    }


    public int getFetchSize() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getFetchSize() not yet implemented.");
    }


    public float getFloat(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getFloat() not yet implemented.");
    }


    public int getInt(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getInt() not yet implemented.");
    }


    public long getLong(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getLong() not yet implemented.");
    }


    public int getMaxFieldSize() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxFieldSize() not yet implemented.");
    }


    public int getMaxRows() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxRows() not yet implemented.");
    }


    public ResultSetMetaData getMetaData() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMetaData() not yet implemented.");
    }


    public boolean getMoreResults() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMoreResults() not yet implemented.");
    }


    public Object getObject(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getObject() not yet implemented.");
    }


    public Object getObject(int i, Map map) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getObject() not yet implemented.");
    }


    public int getQueryTimeout() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getQueryTimeout() not yet implemented.");
    }


    public Ref getRef(int i) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getRef() not yet implemented.");
    }


    public ResultSet getResultSet() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getResultSet() not yet implemented.");
    }


    public int getResultSetConcurrency() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getResultSetConcurrency() not yet implemented.");
    }


    public int getResultSetType() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getResultSetType() not yet implemented.");
    }


    public short getShort(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getShort() not yet implemented.");
    }


    public String getString(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getString() not yet implemented.");
    }


    public Time getTime(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTime() not yet implemented.");
    }


    public Time getTime(int parameterIndex, Calendar cal) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTime() not yet implemented.");
    }


    public Timestamp getTimestamp(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTimestamp() not yet implemented.");
    }


    public Timestamp getTimestamp(int parameterIndex, Calendar cal) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTimestamp() not yet implemented.");
    }


    public int getUpdateCount() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getUpdateCount() not yet implemented.");
    }


    public SQLWarning getWarnings() throws SQLException {
        return null;
    }


    public void registerOutParameter(int parameterIndex, int sqlType) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method registerOutParameter() not yet implemented.");
    }


    public void registerOutParameter(int parameterIndex, int sqlType, int scale) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method registerOutParameter() not yet implemented.");
    }


    public void registerOutParameter(int paramIndex, int sqlType, String typeName) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method registerOutParameter() not yet implemented.");
    }


    public void registerOutParameter(String parameterName, int sqlType) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.registerOutParameter not yet implemented.");
    }


    public void registerOutParameter(String parameterName, int sqlType, int scale) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.registerOutParameter not yet implemented.");
    }


    public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.registerOutParameter not yet implemented.");
    }


    public URL getURL(int parameterIndex) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getURL not yet implemented.");
    }


    public void setURL(String parameterName, URL val) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setURL not yet implemented.");
    }


    public void setNull(String parameterName, int sqlType) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setNull not yet implemented.");
    }


    public void setBoolean(String parameterName, boolean x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setBoolean not yet implemented.");
    }


    public void setByte(String parameterName, byte x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setByte not yet implemented.");
    }


    public void setShort(String parameterName, short x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setShort not yet implemented.");
    }


    public void setInt(String parameterName, int x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setInt not yet implemented.");
    }


    public void setLong(String parameterName, long x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setLong not yet implemented.");
    }


    public void setFloat(String parameterName, float x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setFloat not yet implemented.");
    }


    public void setDouble(String parameterName, double x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setDouble not yet implemented.");
    }


    public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setBigDecimal not yet implemented.");
    }


    public void setString(String parameterName, String x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setString not yet implemented.");
    }


    public void setBytes(String parameterName, byte[] x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setBytes not yet implemented.");
    }


    public void setDate(String parameterName, Date x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setDate not yet implemented.");
    }


    public void setTime(String parameterName, Time x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setTime not yet implemented.");
    }


    public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setTimestamp not yet implemented.");
    }


    public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setAsciiStream not yet implemented.");
    }


    public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setBinaryStream not yet implemented.");
    }


    public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setObject not yet implemented.");
    }


    public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setObject not yet implemented.");
    }


    public void setObject(String parameterName, Object x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setObject not yet implemented.");
    }


    public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setCharacterStream not yet implemented.");
    }


    public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setDate not yet implemented.");
    }


    public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setTime not yet implemented.");
    }


    public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setTimestamp not yet implemented.");
    }


    public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setNull not yet implemented.");
    }


    public String getString(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getString not yet implemented.");
    }


    public boolean getBoolean(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getBoolean not yet implemented.");
    }


    public byte getByte(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getByte not yet implemented.");
    }


    public short getShort(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getShort not yet implemented.");
    }


    public int getInt(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getInt not yet implemented.");
    }


    public long getLong(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getLong not yet implemented.");
    }


    public float getFloat(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getFloat not yet implemented.");
    }


    public double getDouble(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getDouble not yet implemented.");
    }


    public byte[] getBytes(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getBytes not yet implemented.");
    }


    public Date getDate(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getDate not yet implemented.");
    }


    public Time getTime(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getTime not yet implemented.");
    }


    public Timestamp getTimestamp(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getTimestamp not yet implemented.");
    }


    public Object getObject(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getObject not yet implemented.");
    }


    public BigDecimal getBigDecimal(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getBigDecimal not yet implemented.");
    }


    public Object getObject(String parameterName, Map map) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getObject not yet implemented.");
    }


    public Ref getRef(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getRef not yet implemented.");
    }


    public Blob getBlob(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getBlob not yet implemented.");
    }


    public Clob getClob(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getClob not yet implemented.");
    }


    public Array getArray(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getArray not yet implemented.");
    }


    public Date getDate(String parameterName, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getDate not yet implemented.");
    }


    public Time getTime(String parameterName, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getTime not yet implemented.");
    }


    public Timestamp getTimestamp(String parameterName, Calendar cal) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getTimestamp not yet implemented.");
    }


    public URL getURL(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getURL not yet implemented.");
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


    public void setCursorName(String name) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setCursorName() not yet implemented.");
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


    public void setEscapeProcessing(boolean enable) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setEscapeProcessing() not yet implemented.");
    }


    public void setFetchDirection(int direction) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setFetchDirection() not yet implemented.");
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


    public void setMaxFieldSize(int max) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setMaxFieldSize() not yet implemented.");
    }


    public void setMaxRows(int max) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setMaxRows() not yet implemented.");
    }


    public void setNull(int parameterIndex, int sqlType) throws SQLException {
        setValue(parameterIndex, "null(sqlType=" + sqlType + ")");
    }


    public void setNull(int paramIndex, int sqlType, String typeName) throws SQLException {
        setNull(paramIndex, sqlType);
    }


    public void setURL(int parameterIndex, URL x) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setURL not yet implemented.");
    }


    public ParameterMetaData getParameterMetaData() throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getParameterMetaData not yet implemented.");
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


    public void setQueryTimeout(int seconds) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setQueryTimeout() not yet implemented.");
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


    public boolean wasNull() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method wasNull() not yet implemented.");
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
