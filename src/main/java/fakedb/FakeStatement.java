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
import java.sql.CallableStatement;
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
/**
 * Description of the Class
 *
 * @author boris
 * @version $Revision: 1.1.1.1 $
 */
@SuppressWarnings({"MethodParameterNamingConvention"
      })
class FakeStatement implements CallableStatement {
    private Connection connection;
    private String[] parameters;
    private String prepareQuery;


    /**
     * Constructor for the FakeStatement object
     */
    FakeStatement() {
    }


    /**
     * Constructor for the FakeStatement object
     *
     * @param query Description of Parameter
     */
    FakeStatement(String query) {
        prepareQuery = query;

        int paramNb = 0;
        for (int i = 0; i != -1;) {
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


    /**
     * Adds a feature to the Batch attribute of the FakeStatement object
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void addBatch() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method addBatch() not yet implemented.");
    }


    /**
     * Adds a feature to the Batch attribute of the FakeStatement object
     *
     * @param sql The feature to be added to the Batch attribute
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void addBatch(String sql) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method addBatch() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void cancel() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method cancel() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void clearBatch() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method clearBatch() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @throws SQLException Description of Exception
     */
    public void clearParameters() throws SQLException {
        for (int i = 0; i < parameters.length; i++) {
            parameters[i] = null;
        }
    }


    /**
     * Description of the Method
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void clearWarnings() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method clearWarnings() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @throws SQLException Description of Exception
     */
    public void close() throws SQLException {
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public boolean execute() throws SQLException {
        checkUpdateConstraint(builtQuery());
        return true;
    }


    /**
     * Description of the Method
     *
     * @param sql Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public boolean execute(String sql) throws SQLException {
        checkUpdateConstraint(sql);
        return true;
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public int[] executeBatch() throws SQLException {
        return new int[]{};
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public ResultSet executeQuery() throws SQLException {
        return popResultSet(builtQuery());
    }


    /**
     * Description of the Method
     *
     * @param sql Description of Parameterqueryqueryquery
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public ResultSet executeQuery(String sql) throws SQLException {
        return popResultSet(sql);
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public int executeUpdate() throws SQLException {
        checkUpdateConstraint(builtQuery());
        return 1;
    }


    /**
     * Description of the Method
     *
     * @param sql Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public int executeUpdate(String sql) throws SQLException {
        checkUpdateConstraint(sql);
        return 1;
    }


    /**
     * Gets the array attribute of the FakeStatement object
     *
     * @param i Description of Parameter
     *
     * @return The array value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Array getArray(int i) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getArray() not yet implemented.");
    }


    /**
     * Gets the bigDecimal attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     * @param scale          Description of Parameter
     *
     * @return The bigDecimal value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public BigDecimal getBigDecimal(int parameterIndex, int scale)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBigDecimal() not yet implemented.");
    }


    /**
     * Gets the bigDecimal attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The bigDecimal value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public BigDecimal getBigDecimal(int parameterIndex)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBigDecimal() not yet implemented.");
    }


    /**
     * Gets the blob attribute of the FakeStatement object
     *
     * @param i Description of Parameter
     *
     * @return The blob value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Blob getBlob(int i) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBlob() not yet implemented.");
    }


    /**
     * Gets the boolean attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The boolean value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public boolean getBoolean(int parameterIndex)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBoolean() not yet implemented.");
    }


    /**
     * Gets the byte attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The byte value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public byte getByte(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getByte() not yet implemented.");
    }


    /**
     * Gets the bytes attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The bytes value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public byte[] getBytes(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBytes() not yet implemented.");
    }


    /**
     * Gets the clob attribute of the FakeStatement object
     *
     * @param i Description of Parameter
     *
     * @return The clob value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Clob getClob(int i) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getClob() not yet implemented.");
    }


    /**
     * Gets the connection attribute of the FakeStatement object
     *
     * @return The connection value
     *
     * @throws SQLException Description of Exception
     */
    public Connection getConnection() throws SQLException {
        return connection;
    }


    public boolean getMoreResults(int current) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getMoreResults not yet implemented.");
    }


    public ResultSet getGeneratedKeys() throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getGeneratedKeys not yet implemented.");
    }


    public int executeUpdate(String sql, int autoGeneratedKeys)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.executeUpdate not yet implemented.");
    }


    public int executeUpdate(String sql, int[] columnIndexes)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.executeUpdate not yet implemented.");
    }


    public int executeUpdate(String sql, String[] columnNames)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.executeUpdate not yet implemented.");
    }


    public boolean execute(String sql, int autoGeneratedKeys)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.execute not yet implemented.");
    }


    public boolean execute(String sql, int[] columnIndexes)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.execute not yet implemented.");
    }


    public boolean execute(String sql, String[] columnNames)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.execute not yet implemented.");
    }


    public int getResultSetHoldability() throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getResultSetHoldability not yet implemented.");
    }


    /**
     * Gets the date attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The date value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Date getDate(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDate() not yet implemented.");
    }


    /**
     * Gets the date attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     * @param cal            Description of Parameter
     *
     * @return The date value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Date getDate(int parameterIndex, Calendar cal)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDate() not yet implemented.");
    }


    /**
     * Gets the double attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The double value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public double getDouble(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDouble() not yet implemented.");
    }


    /**
     * Gets the fetchDirection attribute of the FakeStatement object
     *
     * @return The fetchDirection value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getFetchDirection() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getFetchDirection() not yet implemented.");
    }


    /**
     * Gets the fetchSize attribute of the FakeStatement object
     *
     * @return The fetchSize value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getFetchSize() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getFetchSize() not yet implemented.");
    }


    /**
     * Gets the float attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The float value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public float getFloat(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getFloat() not yet implemented.");
    }


    /**
     * Gets the int attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The int value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getInt(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getInt() not yet implemented.");
    }


    /**
     * Gets the long attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The long value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public long getLong(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getLong() not yet implemented.");
    }


    /**
     * Gets the maxFieldSize attribute of the FakeStatement object
     *
     * @return The maxFieldSize value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getMaxFieldSize() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxFieldSize() not yet implemented.");
    }


    /**
     * Gets the maxRows attribute of the FakeStatement object
     *
     * @return The maxRows value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getMaxRows() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxRows() not yet implemented.");
    }


    /**
     * Gets the metaData attribute of the FakeStatement object
     *
     * @return The metaData value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public ResultSetMetaData getMetaData() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMetaData() not yet implemented.");
    }


    /**
     * Gets the moreResults attribute of the FakeStatement object
     *
     * @return The moreResults value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public boolean getMoreResults() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMoreResults() not yet implemented.");
    }


    /**
     * Gets the object attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The object value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Object getObject(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getObject() not yet implemented.");
    }


    /**
     * Gets the object attribute of the FakeStatement object
     *
     * @param i   Description of Parameter
     * @param map Description of Parameter
     *
     * @return The object value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Object getObject(int i, Map map) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getObject() not yet implemented.");
    }


    /**
     * Gets the queryTimeout attribute of the FakeStatement object
     *
     * @return The queryTimeout value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getQueryTimeout() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getQueryTimeout() not yet implemented.");
    }


    /**
     * Gets the ref attribute of the FakeStatement object
     *
     * @param i Description of Parameter
     *
     * @return The ref value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Ref getRef(int i) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getRef() not yet implemented.");
    }


    /**
     * Gets the resultSet attribute of the FakeStatement object
     *
     * @return The resultSet value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public ResultSet getResultSet() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getResultSet() not yet implemented.");
    }


    /**
     * Gets the resultSetConcurrency attribute of the FakeStatement object
     *
     * @return The resultSetConcurrency value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getResultSetConcurrency() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
              "Method getResultSetConcurrency() not yet implemented.");
    }


    /**
     * Gets the resultSetType attribute of the FakeStatement object
     *
     * @return The resultSetType value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getResultSetType() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getResultSetType() not yet implemented.");
    }


    /**
     * Gets the short attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The short value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public short getShort(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getShort() not yet implemented.");
    }


    /**
     * Gets the string attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The string value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public String getString(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getString() not yet implemented.");
    }


    /**
     * Gets the time attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The time value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Time getTime(int parameterIndex) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTime() not yet implemented.");
    }


    /**
     * Gets the time attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     * @param cal            Description of Parameter
     *
     * @return The time value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Time getTime(int parameterIndex, Calendar cal)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTime() not yet implemented.");
    }


    /**
     * Gets the timestamp attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     *
     * @return The timestamp value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Timestamp getTimestamp(int parameterIndex)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTimestamp() not yet implemented.");
    }


    /**
     * Gets the timestamp attribute of the FakeStatement object
     *
     * @param parameterIndex Description of Parameter
     * @param cal            Description of Parameter
     *
     * @return The timestamp value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public Timestamp getTimestamp(int parameterIndex, Calendar cal)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTimestamp() not yet implemented.");
    }


    /**
     * Gets the updateCount attribute of the FakeStatement object
     *
     * @return The updateCount value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getUpdateCount() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getUpdateCount() not yet implemented.");
    }


    /**
     * Gets the warnings attribute of the FakeStatement object
     *
     * @return The warnings value
     *
     * @throws SQLException Description of Exception
     */
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }


    /**
     * Description of the Method
     *
     * @param parameterIndex Description of Parameter
     * @param sqlType        Description of Parameter
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void registerOutParameter(int parameterIndex, int sqlType)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException(
              "Method registerOutParameter() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @param parameterIndex Description of Parameter
     * @param sqlType        Description of Parameter
     * @param scale          Description of Parameter
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void registerOutParameter(int parameterIndex, int sqlType, int scale)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException(
              "Method registerOutParameter() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @param paramIndex Description of Parameter
     * @param sqlType    Description of Parameter
     * @param typeName   Description of Parameter
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void registerOutParameter(int paramIndex, int sqlType, String typeName)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException(
              "Method registerOutParameter() not yet implemented.");
    }


    public void registerOutParameter(String parameterName, int sqlType)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.registerOutParameter not yet implemented.");
    }


    public void registerOutParameter(String parameterName, int sqlType, int scale)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.registerOutParameter not yet implemented.");
    }


    public void registerOutParameter(String parameterName, int sqlType, String typeName)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.registerOutParameter not yet implemented.");
    }


    public URL getURL(int parameterIndex) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getURL not yet implemented.");
    }


    public void setURL(String parameterName, URL val)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setURL not yet implemented.");
    }


    public void setNull(String parameterName, int sqlType)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setNull not yet implemented.");
    }


    public void setBoolean(String parameterName, boolean x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setBoolean not yet implemented.");
    }


    public void setByte(String parameterName, byte x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setByte not yet implemented.");
    }


    public void setShort(String parameterName, short x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setShort not yet implemented.");
    }


    public void setInt(String parameterName, int x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setInt not yet implemented.");
    }


    public void setLong(String parameterName, long x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setLong not yet implemented.");
    }


    public void setFloat(String parameterName, float x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setFloat not yet implemented.");
    }


    public void setDouble(String parameterName, double x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setDouble not yet implemented.");
    }


    public void setBigDecimal(String parameterName, BigDecimal x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setBigDecimal not yet implemented.");
    }


    public void setString(String parameterName, String x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setString not yet implemented.");
    }


    public void setBytes(String parameterName, byte[] x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setBytes not yet implemented.");
    }


    public void setDate(String parameterName, Date x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setDate not yet implemented.");
    }


    public void setTime(String parameterName, Time x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setTime not yet implemented.");
    }


    public void setTimestamp(String parameterName, Timestamp x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setTimestamp not yet implemented.");
    }


    public void setAsciiStream(String parameterName, InputStream x, int length)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setAsciiStream not yet implemented.");
    }


    public void setBinaryStream(String parameterName, InputStream x, int length)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setBinaryStream not yet implemented.");
    }


    public void setObject(String parameterName, Object x, int targetSqlType, int scale)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setObject not yet implemented.");
    }


    public void setObject(String parameterName, Object x, int targetSqlType)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setObject not yet implemented.");
    }


    public void setObject(String parameterName, Object x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setObject not yet implemented.");
    }


    public void setCharacterStream(String parameterName, Reader reader, int length)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setCharacterStream not yet implemented.");
    }


    public void setDate(String parameterName, Date x, Calendar cal)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setDate not yet implemented.");
    }


    public void setTime(String parameterName, Time x, Calendar cal)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setTime not yet implemented.");
    }


    public void setTimestamp(String parameterName, Timestamp x, Calendar cal)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setTimestamp not yet implemented.");
    }


    public void setNull(String parameterName, int sqlType, String typeName)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setNull not yet implemented.");
    }


    public String getString(String parameterName)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getString not yet implemented.");
    }


    public boolean getBoolean(String parameterName)
          throws SQLException {
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


    public double getDouble(String parameterName)
          throws SQLException {
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


    public Timestamp getTimestamp(String parameterName)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getTimestamp not yet implemented.");
    }


    public Object getObject(String parameterName)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getObject not yet implemented.");
    }


    public BigDecimal getBigDecimal(String parameterName)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getBigDecimal not yet implemented.");
    }


    public Object getObject(String parameterName, Map map)
          throws SQLException {
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


    public Date getDate(String parameterName, Calendar cal)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getDate not yet implemented.");
    }


    public Time getTime(String parameterName, Calendar cal)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getTime not yet implemented.");
    }


    public Timestamp getTimestamp(String parameterName, Calendar cal)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getTimestamp not yet implemented.");
    }


    public URL getURL(String parameterName) throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getURL not yet implemented.");
    }


    /**
     * Sets the array attribute of the FakeStatement object
     *
     * @param i The new array value
     * @param x The new array value
     *
     * @throws SQLException Description of Exception
     */
    public void setArray(int i, Array x) throws SQLException {
        setValue(i, "" + x);
    }


    /**
     * Sets the asciiStream attribute of the FakeStatement object
     *
     * @param parameterIndex The new asciiStream value
     * @param x              The new asciiStream value
     * @param length         The new asciiStream value
     *
     * @throws SQLException Description of Exception
     */
    public void setAsciiStream(int parameterIndex, InputStream x, int length)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the bigDecimal attribute of the FakeStatement object
     *
     * @param parameterIndex The new bigDecimal value
     * @param x              The new bigDecimal value
     *
     * @throws SQLException Description of Exception
     */
    public void setBigDecimal(int parameterIndex, BigDecimal x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the binaryStream attribute of the FakeStatement object
     *
     * @param parameterIndex The new binaryStream value
     * @param x              The new binaryStream value
     * @param length         The new binaryStream value
     *
     * @throws SQLException Description of Exception
     */
    public void setBinaryStream(int parameterIndex, InputStream x, int length)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the blob attribute of the FakeStatement object
     *
     * @param i The new blob value
     * @param x The new blob value
     *
     * @throws SQLException Description of Exception
     */
    public void setBlob(int i, Blob x) throws SQLException {
        setValue(i, "" + x);
    }


    /**
     * Sets the boolean attribute of the FakeStatement object
     *
     * @param parameterIndex The new boolean value
     * @param x              The new boolean value
     *
     * @throws SQLException Description of Exception
     */
    public void setBoolean(int parameterIndex, boolean x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the byte attribute of the FakeStatement object
     *
     * @param parameterIndex The new byte value
     * @param x              The new byte value
     *
     * @throws SQLException Description of Exception
     */
    public void setByte(int parameterIndex, byte x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the bytes attribute of the FakeStatement object
     *
     * @param parameterIndex The new bytes value
     * @param x              The new bytes value
     *
     * @throws SQLException Description of Exception
     */
    public void setBytes(int parameterIndex, byte[] x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the characterStream attribute of the FakeStatement object
     *
     * @param parameterIndex The new characterStream value
     * @param reader         The new characterStream value
     * @param length         The new characterStream value
     *
     * @throws SQLException Description of Exception
     */
    public void setCharacterStream(int parameterIndex, Reader reader, int length)
          throws SQLException {
        setValue(parameterIndex, "" + reader);
    }


    /**
     * Sets the clob attribute of the FakeStatement object
     *
     * @param i The new clob value
     * @param x The new clob value
     *
     * @throws SQLException Description of Exception
     */
    public void setClob(int i, Clob x) throws SQLException {
        setValue(i, "" + x);
    }


    /**
     * Sets the Connection attribute of the FakeStatement object
     *
     * @param con The new Connection value
     *
     * @throws SQLException Description of Exception
     */
    public void setConnection(Connection con) throws SQLException {
        this.connection = con;
    }


    /**
     * Sets the cursorName attribute of the FakeStatement object
     *
     * @param name The new cursorName value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void setCursorName(String name) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setCursorName() not yet implemented.");
    }


    /**
     * Sets the date attribute of the FakeStatement object
     *
     * @param parameterIndex The new date value
     * @param x              The new date value
     *
     * @throws SQLException Description of Exception
     */
    public void setDate(int parameterIndex, Date x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the date attribute of the FakeStatement object
     *
     * @param parameterIndex The new date value
     * @param x              The new date value
     * @param cal            The new date value
     *
     * @throws SQLException Description of Exception
     */
    public void setDate(int parameterIndex, Date x, Calendar cal)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the double attribute of the FakeStatement object
     *
     * @param parameterIndex The new double value
     * @param x              The new double value
     *
     * @throws SQLException Description of Exception
     */
    public void setDouble(int parameterIndex, double x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the escapeProcessing attribute of the FakeStatement object
     *
     * @param enable The new escapeProcessing value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void setEscapeProcessing(boolean enable)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException(
              "Method setEscapeProcessing() not yet implemented.");
    }


    /**
     * Sets the fetchDirection attribute of the FakeStatement object
     *
     * @param direction The new fetchDirection value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void setFetchDirection(int direction) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setFetchDirection() not yet implemented.");
    }


    /**
     * Sets the fetchSize attribute of the FakeStatement object
     *
     * @param rows The new fetchSize value
     *
     * @throws SQLException Description of Exception
     */
    public void setFetchSize(int rows) throws SQLException {
    }


    /**
     * Sets the float attribute of the FakeStatement object
     *
     * @param parameterIndex The new float value
     * @param x              The new float value
     *
     * @throws SQLException Description of Exception
     */
    public void setFloat(int parameterIndex, float x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the int attribute of the FakeStatement object
     *
     * @param parameterIndex The new int value
     * @param x              The new int value
     *
     * @throws SQLException Description of Exception
     */
    public void setInt(int parameterIndex, int x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the long attribute of the FakeStatement object
     *
     * @param parameterIndex The new long value
     * @param x              The new long value
     *
     * @throws SQLException Description of Exception
     */
    public void setLong(int parameterIndex, long x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the maxFieldSize attribute of the FakeStatement object
     *
     * @param max The new maxFieldSize value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void setMaxFieldSize(int max) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setMaxFieldSize() not yet implemented.");
    }


    /**
     * Sets the maxRows attribute of the FakeStatement object
     *
     * @param max The new maxRows value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void setMaxRows(int max) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setMaxRows() not yet implemented.");
    }


    /**
     * Sets the null attribute of the FakeStatement object
     *
     * @param parameterIndex The new null value
     * @param sqlType        The new null value
     *
     * @throws SQLException Description of Exception
     */
    public void setNull(int parameterIndex, int sqlType)
          throws SQLException {
        setValue(parameterIndex, "null(sqlType=" + sqlType + ")");
    }


    /**
     * Sets the null attribute of the FakeStatement object
     *
     * @param paramIndex The new null value
     * @param sqlType    The new null value
     * @param typeName   The new null value
     *
     * @throws SQLException Description of Exception
     */
    public void setNull(int paramIndex, int sqlType, String typeName)
          throws SQLException {
        setNull(paramIndex, sqlType);
    }


    public void setURL(int parameterIndex, URL x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.setURL not yet implemented.");
    }


    public ParameterMetaData getParameterMetaData()
          throws SQLException {
        throw new UnsupportedOperationException("FakeStatement.getParameterMetaData not yet implemented.");
    }

//    public ParameterMetaData getParameterMetaData()
//        throws SQLException {
//        throw new UnsupportedOperationException(
//            "FakeStatement.getParameterMetaData not yet implemented.");


    //    }
    /**
     * Sets the object attribute of the FakeStatement object
     *
     * @param parameterIndex The new object value
     * @param x              The new object value
     * @param targetSqlType  The new object value
     * @param scale          The new object value
     *
     * @throws SQLException Description of Exception
     */
    public void setObject(int parameterIndex, Object x, int targetSqlType, int scale)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the object attribute of the FakeStatement object
     *
     * @param parameterIndex The new object value
     * @param x              The new object value
     * @param targetSqlType  The new object value
     *
     * @throws SQLException Description of Exception
     */
    public void setObject(int parameterIndex, Object x, int targetSqlType)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the object attribute of the FakeStatement object
     *
     * @param parameterIndex The new object value
     * @param x              The new object value
     *
     * @throws SQLException Description of Exception
     */
    public void setObject(int parameterIndex, Object x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the queryTimeout attribute of the FakeStatement object
     *
     * @param seconds The new queryTimeout value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void setQueryTimeout(int seconds) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setQueryTimeout() not yet implemented.");
    }


    /**
     * Sets the ref attribute of the FakeStatement object
     *
     * @param i The new ref value
     * @param x The new ref value
     *
     * @throws SQLException Description of Exception
     */
    public void setRef(int i, Ref x) throws SQLException {
        setValue(i, "" + x);
    }


    /**
     * Sets the short attribute of the FakeStatement object
     *
     * @param parameterIndex The new short value
     * @param x              The new short value
     *
     * @throws SQLException Description of Exception
     */
    public void setShort(int parameterIndex, short x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the string attribute of the FakeStatement object
     *
     * @param parameterIndex The new string value
     * @param x              The new string value
     *
     * @throws SQLException Description of Exception
     */
    public void setString(int parameterIndex, String x)
          throws SQLException {
        setValue(parameterIndex, x);
    }


    /**
     * Sets the time attribute of the FakeStatement object
     *
     * @param parameterIndex The new time value
     * @param x              The new time value
     *
     * @throws SQLException Description of Exception
     */
    public void setTime(int parameterIndex, Time x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the time attribute of the FakeStatement object
     *
     * @param parameterIndex The new time value
     * @param x              The new time value
     * @param cal            The new time value
     *
     * @throws SQLException Description of Exception
     */
    public void setTime(int parameterIndex, Time x, Calendar cal)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the timestamp attribute of the FakeStatement object
     *
     * @param parameterIndex The new timestamp value
     * @param x              The new timestamp value
     *
     * @throws SQLException Description of Exception
     */
    public void setTimestamp(int parameterIndex, Timestamp x)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the timestamp attribute of the FakeStatement object
     *
     * @param parameterIndex The new timestamp value
     * @param x              The new timestamp value
     * @param cal            The new timestamp value
     *
     * @throws SQLException Description of Exception
     */
    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Sets the unicodeStream attribute of the FakeStatement object
     *
     * @param parameterIndex The new unicodeStream value
     * @param x              The new unicodeStream value
     * @param length         The new unicodeStream value
     *
     * @throws SQLException Description of Exception
     */
    public void setUnicodeStream(int parameterIndex, InputStream x, int length)
          throws SQLException {
        setValue(parameterIndex, "" + x);
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public boolean wasNull() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method wasNull() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
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


    /**
     * Overview.
     *
     * @param query Description of Parameter
     *
     * @throws SQLException Description of Exception
     */
    private void checkUpdateConstraint(String query)
          throws SQLException {
        FakeDriver.getDriver().checkUpdateConstraint(query);
    }


    /**
     * Description of the Method
     *
     * @param query Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    private ResultSet popResultSet(String query) throws SQLException {
        FakeResultSet rs = FakeDriver.getDriver().popResultSet(query);
        rs.setStatement(this);
        return rs;
    }


    /**
     * Constructor for the setValue object
     *
     * @param parameterIndex Description of Parameter
     * @param val            Description of Parameter
     *
     * @throws IllegalArgumentException TODO
     */
    private void setValue(int parameterIndex, String val) {
        if (val == null) {
            throw new IllegalArgumentException("setXXX(i, null) est interdit");
        }
        parameters[parameterIndex - 1] = val;
    }
}
