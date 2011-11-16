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
import java.sql.Date;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;
/**
 * Simulation du ResultSet.
 *
 * @author $Author: gonnot $
 * @version $Revision: 1.1.1.1 $
 */
public class FakeResultSet implements ResultSet {
    private static final Number ZERO = new Long(0);
    private boolean close = false;
    private int lastColumnIndex = 0;
    private Object[][] matrix = {};
    private int rowIndex = 0;
    private Statement statement;

    /**
     * Constructor for the FakeResultSet object
     *
     * @param matrix Description of Parameter
     */
    public FakeResultSet(Object[][] matrix) {
        this(matrix, false);
    }


    /**
     * Constructeur de FakeResultSet
     *
     * @param matrix
     * @param forceOneNext
     */
    public FakeResultSet(Object[][] matrix, boolean forceOneNext) {
        this.matrix = matrix;
        if (forceOneNext) {
            try {
                next();
            }
            catch (SQLException e) {
                // cas impossible
            }
        }
    }

    /**
     * Description of the Method
     *
     * @param row Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     */
    public boolean absolute(int row) throws SQLException {
        rowIndex = row - 1;
        return isRowIndexValid();
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     */
    public void afterLast() throws SQLException {
        rowIndex = matrix.length;
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     */
    public void beforeFirst() throws SQLException {
        rowIndex = -1;
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public void cancelRowUpdates() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method cancelRowUpdates() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     */
    public void clearWarnings() throws SQLException {}


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     */
    public void close() throws SQLException {
        matrix = null;
        rowIndex = -1;
        close = true;
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public void deleteRow() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method deleteRow() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @param cn Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     */
    public int findColumn(String cn) throws SQLException {
        if (matrix.length == 0 || matrix[0].length == 0) {
            throw new SQLException("Column names has not been set");
        }
        int idx = java.util.Arrays.asList(matrix[0]).indexOf(cn);
        if (idx < 0) {
            throw new SQLException("Unknown column name : " + cn);
        }
        return idx + 1;
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     */
    public boolean first() throws SQLException {
        if (matrix.length <= 0) {
            return false;
        }
        rowIndex = 0;
        return true;
    }


    /**
     * Gets the array attribute of the FakeResultSet object
     *
     * @param i Description of Parameter
     *
     * @return The array value
     *
     * @exception SQLException Description of Exception
     */
    public Array getArray(int i) throws SQLException {
        return (Array)getObject(i);
    }


    /**
     * Gets the array attribute of the FakeResultSet object
     *
     * @param colName Description of Parameter
     *
     * @return The array value
     *
     * @exception SQLException Description of Exception
     */
    public Array getArray(String colName) throws SQLException {
        return getArray(findColumn(colName));
    }


    /**
     * Gets the asciiStream attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The asciiStream value
     *
     * @exception SQLException Description of Exception
     */
    public InputStream getAsciiStream(int columnIndex)
        throws SQLException {
        return (InputStream)getObject(columnIndex);
    }


    /**
     * Gets the asciiStream attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The asciiStream value
     *
     * @exception SQLException Description of Exception
     */
    public InputStream getAsciiStream(String columnName)
        throws SQLException {
        return getAsciiStream(findColumn(columnName));
    }


    /**
     * Gets the bigDecimal attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     * @param scale Description of Parameter
     *
     * @return The bigDecimal value
     *
     * @exception SQLException Description of Exception
     */
    public BigDecimal getBigDecimal(int columnIndex, int scale)
        throws SQLException {
        return (BigDecimal)getObject(columnIndex);
    }


    /**
     * Gets the bigDecimal attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     * @param scale Description of Parameter
     *
     * @return The bigDecimal value
     *
     * @exception SQLException Description of Exception
     */
    public BigDecimal getBigDecimal(String columnName, int scale)
        throws SQLException {
        return getBigDecimal(findColumn(columnName));
    }


    /**
     * Gets the bigDecimal attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The bigDecimal value
     *
     * @exception SQLException Description of Exception
     */
    public BigDecimal getBigDecimal(int columnIndex)
        throws SQLException {
        return (BigDecimal)getObject(columnIndex);
    }


    /**
     * Gets the bigDecimal attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The bigDecimal value
     *
     * @exception SQLException Description of Exception
     */
    public BigDecimal getBigDecimal(String columnName)
        throws SQLException {
        return getBigDecimal(findColumn(columnName));
    }


    /**
     * Gets the binaryStream attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The binaryStream value
     *
     * @exception SQLException Description of Exception
     */
    public InputStream getBinaryStream(int columnIndex)
        throws SQLException {
        return (InputStream)getObject(columnIndex);
    }


    /**
     * Gets the binaryStream attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The binaryStream value
     *
     * @exception SQLException Description of Exception
     */
    public InputStream getBinaryStream(String columnName)
        throws SQLException {
        return getBinaryStream(findColumn(columnName));
    }


    /**
     * Gets the blob attribute of the FakeResultSet object
     *
     * @param i Description of Parameter
     *
     * @return The blob value
     *
     * @exception SQLException Description of Exception
     */
    public Blob getBlob(int i) throws SQLException {
        return (Blob)getObject(i);
    }


    /**
     * Gets the blob attribute of the FakeResultSet object
     *
     * @param colName Description of Parameter
     *
     * @return The blob value
     *
     * @exception SQLException Description of Exception
     */
    public Blob getBlob(String colName) throws SQLException {
        return getBlob(findColumn(colName));
    }


    /**
     * Gets the boolean attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The boolean value
     *
     * @exception SQLException Description of Exception
     */
    public boolean getBoolean(int columnIndex) throws SQLException {
        Boolean val = (Boolean)getObject(columnIndex);
        if (val == null) {
            return false;
        }
        return val.booleanValue();
    }


    /**
     * Gets the boolean attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The boolean value
     *
     * @exception SQLException Description of Exception
     */
    public boolean getBoolean(String columnName) throws SQLException {
        return getBoolean(findColumn(columnName));
    }


    /**
     * Gets the byte attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The byte value
     *
     * @exception SQLException Description of Exception
     */
    public byte getByte(int columnIndex) throws SQLException {
        return ((Byte)getObject(columnIndex)).byteValue();
    }


    /**
     * Gets the byte attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The byte value
     *
     * @exception SQLException Description of Exception
     */
    public byte getByte(String columnName) throws SQLException {
        return getByte(findColumn(columnName));
    }


    /**
     * Gets the bytes attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The bytes value
     *
     * @exception SQLException Description of Exception
     */
    public byte[] getBytes(int columnIndex) throws SQLException {
        return (byte[])getObject(columnIndex);
    }


    /**
     * Gets the bytes attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The bytes value
     *
     * @exception SQLException Description of Exception
     */
    public byte[] getBytes(String columnName) throws SQLException {
        return getBytes(findColumn(columnName));
    }


    /**
     * Gets the characterStream attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The characterStream value
     *
     * @exception SQLException Description of Exception
     */
    public Reader getCharacterStream(int columnIndex)
        throws SQLException {
        return (Reader)getObject(columnIndex);
    }


    /**
     * Gets the characterStream attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The characterStream value
     *
     * @exception SQLException Description of Exception
     */
    public Reader getCharacterStream(String columnName)
        throws SQLException {
        return getCharacterStream(findColumn(columnName));
    }


    /**
     * Gets the clob attribute of the FakeResultSet object
     *
     * @param i Description of Parameter
     *
     * @return The clob value
     *
     * @exception SQLException Description of Exception
     */
    public Clob getClob(int i) throws SQLException {
        return (Clob)getObject(i);
    }


    /**
     * Gets the clob attribute of the FakeResultSet object
     *
     * @param colName Description of Parameter
     *
     * @return The clob value
     *
     * @exception SQLException Description of Exception
     */
    public Clob getClob(String colName) throws SQLException {
        return getClob(findColumn(colName));
    }


    /**
     * Gets the concurrency attribute of the FakeResultSet object
     *
     * @return The concurrency value
     *
     * @exception SQLException Description of Exception
     */
    public int getConcurrency() throws SQLException {
        return getStatement().getResultSetConcurrency();
    }


    /**
     * Gets the cursorName attribute of the FakeResultSet object
     *
     * @return The cursorName value
     *
     * @exception SQLException Description of Exception
     */
    public String getCursorName() throws SQLException {
        return null;
    }


    /**
     * Gets the date attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The date value
     *
     * @exception SQLException Description of Exception
     */
    public Date getDate(int columnIndex) throws SQLException {
        return (Date)getObject(columnIndex);
    }


    /**
     * Gets the date attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The date value
     *
     * @exception SQLException Description of Exception
     */
    public Date getDate(String columnName) throws SQLException {
        return getDate(findColumn(columnName));
    }


    /**
     * Gets the date attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     * @param cal Description of Parameter
     *
     * @return The date value
     *
     * @exception SQLException Description of Exception
     */
    public Date getDate(int columnIndex, Calendar cal)
        throws SQLException {
        return getDate(columnIndex);
    }


    /**
     * Gets the date attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     * @param cal Description of Parameter
     *
     * @return The date value
     *
     * @exception SQLException Description of Exception
     */
    public Date getDate(String columnName, Calendar cal)
        throws SQLException {
        return getDate(findColumn(columnName), cal);
    }


    /**
     * Gets the double attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The double value
     *
     * @exception SQLException Description of Exception
     */
    public double getDouble(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).doubleValue();
    }


    /**
     * Gets the double attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The double value
     *
     * @exception SQLException Description of Exception
     */
    public double getDouble(String columnName) throws SQLException {
        return getDouble(findColumn(columnName));
    }


    /**
     * Gets the fetchDirection attribute of the FakeResultSet object
     *
     * @return The fetchDirection value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getFetchDirection() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getFetchDirection() not yet implemented.");
    }


    /**
     * Gets the fetchSize attribute of the FakeResultSet object
     *
     * @return The fetchSize value
     *
     * @exception SQLException Description of Exception
     */
    public int getFetchSize() throws SQLException {
        return 0;
    }


    /**
     * Gets the float attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The float value
     *
     * @exception SQLException Description of Exception
     */
    public float getFloat(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).floatValue();
    }


    /**
     * Gets the float attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The float value
     *
     * @exception SQLException Description of Exception
     */
    public float getFloat(String columnName) throws SQLException {
        return getFloat(findColumn(columnName));
    }


    /**
     * Gets the int attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The int value
     *
     * @exception SQLException Description of Exception
     */
    public int getInt(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).intValue();
//		return (getNumber(columnIndex)).intValue();
    }


    /**
     * Gets the int attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The int value
     *
     * @exception SQLException Description of Exception
     */
    public int getInt(String columnName) throws SQLException {
        return getInt(findColumn(columnName));
    }


    /**
     * Gets the long attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The long value
     *
     * @exception SQLException Description of Exception
     */
    public long getLong(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).longValue();
    }


    /**
     * Gets the long attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The long value
     *
     * @exception SQLException Description of Exception
     */
    public long getLong(String columnName) throws SQLException {
        return getLong(findColumn(columnName));
    }


    /**
     * Gets the metaData attribute of the FakeResultSet object
     *
     * @return The metaData value
     *
     * @exception SQLException Description of Exception
     */
    public ResultSetMetaData getMetaData() throws SQLException {
        return new FakeResultSetMetaData(matrix);
    }


    /**
     * Gets the object attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The object value
     *
     * @exception SQLException Description of Exception
     */
    public Object getObject(int columnIndex) throws SQLException {
        checkRowIndex();
        checkColumnIndex(columnIndex);
        lastColumnIndex = columnIndex;
        return matrix[rowIndex][columnIndex - 1];
    }


    /**
     * Gets the object attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The object value
     *
     * @exception SQLException Description of Exception
     */
    public Object getObject(String columnName) throws SQLException {
        return getObject(findColumn(columnName));
    }


    /**
     * Gets the object attribute of the FakeResultSet object
     *
     * @param i Description of Parameter
     * @param map Description of Parameter
     *
     * @return The object value
     *
     * @exception SQLException Description of Exception
     */
    public Object getObject(int i, Map map) throws SQLException {
        return getObject(i);
    }


    /**
     * Gets the object attribute of the FakeResultSet object
     *
     * @param colName Description of Parameter
     * @param map Description of Parameter
     *
     * @return The object value
     *
     * @exception SQLException Description of Exception
     */
    public Object getObject(String colName, Map map)
        throws SQLException {
        return getObject(findColumn(colName), map);
    }


    /**
     * Gets the ref attribute of the FakeResultSet object
     *
     * @param i Description of Parameter
     *
     * @return The ref value
     *
     * @exception SQLException Description of Exception
     */
    public Ref getRef(int i) throws SQLException {
        return (Ref)getObject(i);
    }


    /**
     * Gets the ref attribute of the FakeResultSet object
     *
     * @param colName Description of Parameter
     *
     * @return The ref value
     *
     * @exception SQLException Description of Exception
     */
    public Ref getRef(String colName) throws SQLException {
        return getRef(findColumn(colName));
    }


    /**
     * Gets the row attribute of the FakeResultSet object
     *
     * @return The row value
     *
     * @exception SQLException Description of Exception
     */
    public int getRow() throws SQLException {
        return rowIndex + 1;
    }


    /**
     * Gets the short attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The short value
     *
     * @exception SQLException Description of Exception
     */
    public short getShort(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).shortValue();
    }


    /**
     * Gets the short attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The short value
     *
     * @exception SQLException Description of Exception
     */
    public short getShort(String columnName) throws SQLException {
        return getShort(findColumn(columnName));
    }


    /**
     * Gets the statement attribute of the FakeResultSet object
     *
     * @return The statement value
     *
     * @exception SQLException Description of Exception
     */
    public Statement getStatement() throws SQLException {
        return statement;
    }


    /**
     * Gets the string attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The string value
     *
     * @exception SQLException Description of Exception
     */
    public String getString(int columnIndex) throws SQLException {
        return (String)getObject(columnIndex);
    }


    /**
     * Gets the string attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The string value
     *
     * @exception SQLException Description of Exception
     */
    public String getString(String columnName) throws SQLException {
        return getString(findColumn(columnName));
    }


    /**
     * Gets the time attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The time value
     *
     * @exception SQLException Description of Exception
     */
    public Time getTime(int columnIndex) throws SQLException {
        return (Time)getObject(columnIndex);
    }


    /**
     * Gets the time attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The time value
     *
     * @exception SQLException Description of Exception
     */
    public Time getTime(String columnName) throws SQLException {
        return getTime(findColumn(columnName));
    }


    /**
     * Gets the time attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     * @param cal Description of Parameter
     *
     * @return The time value
     *
     * @exception SQLException Description of Exception
     */
    public Time getTime(int columnIndex, Calendar cal)
        throws SQLException {
        return getTime(columnIndex);
    }


    /**
     * Gets the time attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     * @param cal Description of Parameter
     *
     * @return The time value
     *
     * @exception SQLException Description of Exception
     */
    public Time getTime(String columnName, Calendar cal)
        throws SQLException {
        return getTime(findColumn(columnName), cal);
    }


    /**
     * Gets the timestamp attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The timestamp value
     *
     * @exception SQLException Description of Exception
     */
    public Timestamp getTimestamp(int columnIndex)
        throws SQLException {
        return (Timestamp)getObject(columnIndex);
    }


    /**
     * Gets the timestamp attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The timestamp value
     *
     * @exception SQLException Description of Exception
     */
    public Timestamp getTimestamp(String columnName)
        throws SQLException {
        return getTimestamp(findColumn(columnName));
    }


    /**
     * Gets the timestamp attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     * @param cal Description of Parameter
     *
     * @return The timestamp value
     *
     * @exception SQLException Description of Exception
     */
    public Timestamp getTimestamp(int columnIndex, Calendar cal)
        throws SQLException {
        return getTimestamp(columnIndex);
    }


    /**
     * Gets the timestamp attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     * @param cal Description of Parameter
     *
     * @return The timestamp value
     *
     * @exception SQLException Description of Exception
     */
    public Timestamp getTimestamp(String columnName, Calendar cal)
        throws SQLException {
        return getTimestamp(findColumn(columnName), cal);
    }


    public URL getURL(int columnIndex) throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.getURL not yet implemented.");
    }


    public URL getURL(String columnName) throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.getURL not yet implemented.");
    }


    public void updateRef(int columnIndex, Ref x)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.updateRef not yet implemented.");
    }


    public void updateRef(String columnName, Ref x)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.updateRef not yet implemented.");
    }


    public void updateBlob(int columnIndex, Blob x)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.updateBlob not yet implemented.");
    }


    public void updateBlob(String columnName, Blob x)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.updateBlob not yet implemented.");
    }


    public void updateClob(int columnIndex, Clob x)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.updateClob not yet implemented.");
    }


    public void updateClob(String columnName, Clob x)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.updateClob not yet implemented.");
    }


    public void updateArray(int columnIndex, Array x)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.updateArray not yet implemented.");
    }


    public void updateArray(String columnName, Array x)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeResultSet.updateArray not yet implemented.");
    }


    /**
     * Gets the type attribute of the FakeResultSet object
     *
     * @return The type value
     *
     * @exception SQLException Description of Exception
     */
    public int getType() throws SQLException {
        return getStatement().getResultSetType();
    }


    /**
     * Gets the unicodeStream attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The unicodeStream value
     *
     * @exception SQLException Description of Exception
     */
    public InputStream getUnicodeStream(int columnIndex)
        throws SQLException {
        return (InputStream)getObject(columnIndex);
    }


    /**
     * Gets the unicodeStream attribute of the FakeResultSet object
     *
     * @param columnName Description of Parameter
     *
     * @return The unicodeStream value
     *
     * @exception SQLException Description of Exception
     */
    public InputStream getUnicodeStream(String columnName)
        throws SQLException {
        return getUnicodeStream(findColumn(columnName));
    }


    /**
     * Gets the warnings attribute of the FakeResultSet object
     *
     * @return The warnings value
     *
     * @exception SQLException Description of Exception
     */
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public void insertRow() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method insertRow() not yet implemented.");
    }


    /**
     * Gets the afterLast attribute of the FakeResultSet object
     *
     * @return The afterLast value
     *
     * @exception SQLException Description of Exception
     */
    public boolean isAfterLast() throws SQLException {
        return rowIndex > matrix.length;
    }


    /**
     * Gets the beforeFirst attribute of the FakeResultSet object
     *
     * @return The beforeFirst value
     *
     * @exception SQLException Description of Exception
     */
    public boolean isBeforeFirst() throws SQLException {
        return rowIndex > 0;
    }


    /**
     * Gets the first attribute of the FakeResultSet object
     *
     * @return The first value
     *
     * @exception SQLException Description of Exception
     */
    public boolean isFirst() throws SQLException {
        return rowIndex == 0;
    }


    /**
     * Gets the last attribute of the FakeResultSet object
     *
     * @return The last value
     *
     * @exception SQLException Description of Exception
     */
    public boolean isLast() throws SQLException {
        return rowIndex == matrix.length - 1;
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     */
    public boolean last() throws SQLException {
        if (matrix.length <= 0) {
            return false;
        }
        rowIndex = matrix.length - 1;
        return true;
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public void moveToCurrentRow() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method moveToCurrentRow() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public void moveToInsertRow() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method moveToInsertRow() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     */
    public boolean next() throws SQLException {
        rowIndex++;
        return (rowIndex < matrix.length);
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     */
    public boolean previous() throws SQLException {
        rowIndex--;
        return isRowIndexValid();
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     */
    public void refreshRow() throws SQLException {}


    /**
     * Description of the Method
     *
     * @param rows Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     */
    public boolean relative(int rows) throws SQLException {
        rowIndex += rows;
        return isRowIndexValid();
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean rowDeleted() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method rowDeleted() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean rowInserted() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method rowInserted() not yet implemented.");
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean rowUpdated() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method rowUpdated() not yet implemented.");
    }


    /**
     * Sets the fetchDirection attribute of the FakeResultSet object
     *
     * @param direction The new fetchDirection value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public void setFetchDirection(int direction) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method setFetchDirection() not yet implemented.");
    }


    /**
     * Sets the fetchSize attribute of the FakeResultSet object
     *
     * @param rows The new fetchSize value
     *
     * @exception SQLException Description of Exception
     */
    public void setFetchSize(int rows) throws SQLException {}


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     * @param length Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateAsciiStream(int columnIndex, InputStream x, int length)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     * @param length Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateAsciiStream(String columnName, InputStream x, int length)
        throws SQLException {
        updateAsciiStream(findColumn(columnName), x, length);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateBigDecimal(int columnIndex, BigDecimal x)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateBigDecimal(String columnName, BigDecimal x)
        throws SQLException {
        updateBigDecimal(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     * @param length Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateBinaryStream(int columnIndex, InputStream x, int length)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     * @param length Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateBinaryStream(String columnName, InputStream x, int length)
        throws SQLException {
        updateBinaryStream(findColumn(columnName), x, length);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateBoolean(int columnIndex, boolean x)
        throws SQLException {
        updateObject(columnIndex, new Boolean(x));
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateBoolean(String columnName, boolean x)
        throws SQLException {
        updateBoolean(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateByte(int columnIndex, byte x)
        throws SQLException {
        updateObject(columnIndex, new Byte(x));
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateByte(String columnName, byte x)
        throws SQLException {
        updateByte(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateBytes(int columnIndex, byte[] x)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateBytes(String columnName, byte[] x)
        throws SQLException {
        updateBytes(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     * @param length Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateCharacterStream(int columnIndex, Reader x, int length)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param reader Description of Parameter
     * @param length Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateCharacterStream(String columnName, Reader reader, int length)
        throws SQLException {
        updateCharacterStream(findColumn(columnName), reader, length);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateDate(int columnIndex, Date x)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateDate(String columnName, Date x)
        throws SQLException {
        updateDate(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateDouble(int columnIndex, double x)
        throws SQLException {
        updateObject(columnIndex, new Double(x));
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateDouble(String columnName, double x)
        throws SQLException {
        updateDouble(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateFloat(int columnIndex, float x)
        throws SQLException {
        updateObject(columnIndex, new Float(x));
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateFloat(String columnName, float x)
        throws SQLException {
        updateFloat(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateInt(int columnIndex, int x)
        throws SQLException {
        updateObject(columnIndex, new Integer(x));
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateInt(String columnName, int x)
        throws SQLException {
        updateInt(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateLong(int columnIndex, long x)
        throws SQLException {
        updateObject(columnIndex, new Long(x));
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateLong(String columnName, long x)
        throws SQLException {
        updateLong(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateNull(int columnIndex) throws SQLException {
        updateObject(columnIndex, null);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateNull(String columnName) throws SQLException {
        updateNull(findColumn(columnName));
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     * @param scale Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateObject(int columnIndex, Object x, int scale)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateObject(int columnIndex, Object x)
        throws SQLException {
        checkRowIndex();
        checkColumnIndex(columnIndex);
        matrix[rowIndex][columnIndex - 1] = x;
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     * @param scale Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateObject(String columnName, Object x, int scale)
        throws SQLException {
        updateObject(findColumn(columnName), x, scale);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateObject(String columnName, Object x)
        throws SQLException {
        updateObject(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     */
    public void updateRow() throws SQLException {}


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateShort(int columnIndex, short x)
        throws SQLException {
        updateObject(columnIndex, new Short(x));
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateShort(String columnName, short x)
        throws SQLException {
        updateShort(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateString(int columnIndex, String x)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateString(String columnName, String x)
        throws SQLException {
        updateString(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateTime(int columnIndex, Time x)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateTime(String columnName, Time x)
        throws SQLException {
        updateTime(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateTimestamp(int columnIndex, Timestamp x)
        throws SQLException {
        updateObject(columnIndex, x);
    }


    /**
     * Description of the Method
     *
     * @param columnName Description of Parameter
     * @param x Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public void updateTimestamp(String columnName, Timestamp x)
        throws SQLException {
        updateTimestamp(findColumn(columnName), x);
    }


    /**
     * Description of the Method
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     */
    public boolean wasNull() throws SQLException {
        return getObject(lastColumnIndex) == null;
    }


    /**
     * Sets the statement attribute of the FakeResultSet object
     *
     * @param stmt The new statement value
     */
    void setStatement(Statement stmt) {
        this.statement = stmt;
    }


    /**
     * Description of the Method
     *
     * @param columnIndex Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    private void checkColumnIndex(int columnIndex)
        throws SQLException {
        if (columnIndex < 1 || columnIndex > matrix[rowIndex].length) {
            throw new SQLException("Bad ColumnIndex : " + columnIndex);
        }
    }


    /**
     * Description of the Method
     *
     * @exception SQLException Description of Exception
     */
    private void checkRowIndex() throws SQLException {
        if (close) {
            throw new SQLException("ResultSet is closed");
        }
        if (rowIndex <= 0) {
            throw new SQLException("Method next() must be called before to fetch result");
        }
        if (rowIndex >= matrix.length) {
            throw new SQLException("No more Row");
        }
    }


    /**
     * Gets the number attribute of the FakeResultSet object
     *
     * @param columnIndex Description of Parameter
     *
     * @return The number value
     *
     * @exception SQLException Description of Exception
     */
    private Number getNumber(int columnIndex) throws SQLException {
        Object val = getObject(columnIndex);
        if (val == null) {
            val = ZERO;
        }
        return (Number)val;
    }


    /**
     * Gets the rowIndexValid attribute of the FakeResultSet object
     *
     * @return The rowIndexValid value
     *
     * @exception SQLException Description of Exception
     */
    private boolean isRowIndexValid() throws SQLException {
        if (close) {
            throw new SQLException("ResultSet is closed");
        }
        if (rowIndex < 0 || rowIndex >= matrix.length) {
            return false;
        }
        return true;
    }
}
