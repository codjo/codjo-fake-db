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
import net.codjo.test.common.mock.ResultSetMock;

public class FakeResultSet extends ResultSetMock {
    private static final Number ZERO = 0L;
    private boolean close = false;
    private int lastColumnIndex = 0;
    private Object[][] matrix = {};
    private int rowIndex = 0;
    private Statement statement;


    public FakeResultSet(Object[][] matrix) {
        this(matrix, false);
    }


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


    public boolean absolute(int row) throws SQLException {
        rowIndex = row - 1;
        return isRowIndexValid();
    }


    public void afterLast() throws SQLException {
        rowIndex = matrix.length;
    }


    public void beforeFirst() throws SQLException {
        rowIndex = -1;
    }


    public void cancelRowUpdates() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method cancelRowUpdates() not yet implemented.");
    }


    public void clearWarnings() throws SQLException {
    }


    public void close() throws SQLException {
        matrix = null;
        rowIndex = -1;
        close = true;
    }


    public void deleteRow() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method deleteRow() not yet implemented.");
    }


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


    public boolean first() throws SQLException {
        if (matrix.length <= 0) {
            return false;
        }
        rowIndex = 0;
        return true;
    }


    public Array getArray(int i) throws SQLException {
        return (Array)getObject(i);
    }


    public Array getArray(String colName) throws SQLException {
        return getArray(findColumn(colName));
    }


    public InputStream getAsciiStream(int columnIndex)
          throws SQLException {
        return (InputStream)getObject(columnIndex);
    }


    public InputStream getAsciiStream(String columnName)
          throws SQLException {
        return getAsciiStream(findColumn(columnName));
    }


    public BigDecimal getBigDecimal(int columnIndex, int scale)
          throws SQLException {
        return (BigDecimal)getObject(columnIndex);
    }


    public BigDecimal getBigDecimal(String columnName, int scale)
          throws SQLException {
        return getBigDecimal(findColumn(columnName));
    }


    public BigDecimal getBigDecimal(int columnIndex)
          throws SQLException {
        return (BigDecimal)getObject(columnIndex);
    }


    public BigDecimal getBigDecimal(String columnName)
          throws SQLException {
        return getBigDecimal(findColumn(columnName));
    }


    public InputStream getBinaryStream(int columnIndex)
          throws SQLException {
        return (InputStream)getObject(columnIndex);
    }


    public InputStream getBinaryStream(String columnName)
          throws SQLException {
        return getBinaryStream(findColumn(columnName));
    }


    public Blob getBlob(int i) throws SQLException {
        return (Blob)getObject(i);
    }


    public Blob getBlob(String colName) throws SQLException {
        return getBlob(findColumn(colName));
    }


    public boolean getBoolean(int columnIndex) throws SQLException {
        Boolean val = (Boolean)getObject(columnIndex);
        if (val == null) {
            return false;
        }
        return val;
    }


    public boolean getBoolean(String columnName) throws SQLException {
        return getBoolean(findColumn(columnName));
    }


    public byte getByte(int columnIndex) throws SQLException {
        return (Byte)getObject(columnIndex);
    }


    public byte getByte(String columnName) throws SQLException {
        return getByte(findColumn(columnName));
    }


    public byte[] getBytes(int columnIndex) throws SQLException {
        return (byte[])getObject(columnIndex);
    }


    public byte[] getBytes(String columnName) throws SQLException {
        return getBytes(findColumn(columnName));
    }


    public Reader getCharacterStream(int columnIndex)
          throws SQLException {
        return (Reader)getObject(columnIndex);
    }


    public Reader getCharacterStream(String columnName)
          throws SQLException {
        return getCharacterStream(findColumn(columnName));
    }


    public Clob getClob(int i) throws SQLException {
        return (Clob)getObject(i);
    }


    public Clob getClob(String colName) throws SQLException {
        return getClob(findColumn(colName));
    }


    public int getConcurrency() throws SQLException {
        return getStatement().getResultSetConcurrency();
    }


    public String getCursorName() throws SQLException {
        return null;
    }


    public Date getDate(int columnIndex) throws SQLException {
        return (Date)getObject(columnIndex);
    }


    public Date getDate(String columnName) throws SQLException {
        return getDate(findColumn(columnName));
    }


    public Date getDate(int columnIndex, Calendar cal)
          throws SQLException {
        return getDate(columnIndex);
    }


    public Date getDate(String columnName, Calendar cal)
          throws SQLException {
        return getDate(findColumn(columnName), cal);
    }


    public double getDouble(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).doubleValue();
    }


    public double getDouble(String columnName) throws SQLException {
        return getDouble(findColumn(columnName));
    }


    public int getFetchDirection() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getFetchDirection() not yet implemented.");
    }


    public int getFetchSize() throws SQLException {
        return 0;
    }


    public float getFloat(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).floatValue();
    }


    public float getFloat(String columnName) throws SQLException {
        return getFloat(findColumn(columnName));
    }


    public int getInt(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).intValue();
//		return (getNumber(columnIndex)).intValue();
    }


    public int getInt(String columnName) throws SQLException {
        return getInt(findColumn(columnName));
    }


    public long getLong(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).longValue();
    }


    public long getLong(String columnName) throws SQLException {
        return getLong(findColumn(columnName));
    }


    public ResultSetMetaData getMetaData() throws SQLException {
        return new FakeResultSetMetaData(matrix).getStub();
    }


    public Object getObject(int columnIndex) throws SQLException {
        checkRowIndex();
        checkColumnIndex(columnIndex);
        lastColumnIndex = columnIndex;
        return matrix[rowIndex][columnIndex - 1];
    }


    public Object getObject(String columnName) throws SQLException {
        return getObject(findColumn(columnName));
    }


    public Object getObject(int i, Map map) throws SQLException {
        return getObject(i);
    }


    public Object getObject(String colName, Map map)
          throws SQLException {
        return getObject(findColumn(colName), map);
    }


    public Ref getRef(int i) throws SQLException {
        return (Ref)getObject(i);
    }


    public Ref getRef(String colName) throws SQLException {
        return getRef(findColumn(colName));
    }


    public int getRow() throws SQLException {
        return rowIndex + 1;
    }


    public short getShort(int columnIndex) throws SQLException {
        return (getNumber(columnIndex)).shortValue();
    }


    public short getShort(String columnName) throws SQLException {
        return getShort(findColumn(columnName));
    }


    public Statement getStatement() throws SQLException {
        return statement;
    }


    public String getString(int columnIndex) throws SQLException {
        return (String)getObject(columnIndex);
    }


    public String getString(String columnName) throws SQLException {
        return getString(findColumn(columnName));
    }


    public Time getTime(int columnIndex) throws SQLException {
        return (Time)getObject(columnIndex);
    }


    public Time getTime(String columnName) throws SQLException {
        return getTime(findColumn(columnName));
    }


    public Time getTime(int columnIndex, Calendar cal)
          throws SQLException {
        return getTime(columnIndex);
    }


    public Time getTime(String columnName, Calendar cal)
          throws SQLException {
        return getTime(findColumn(columnName), cal);
    }


    public Timestamp getTimestamp(int columnIndex)
          throws SQLException {
        return (Timestamp)getObject(columnIndex);
    }


    public Timestamp getTimestamp(String columnName)
          throws SQLException {
        return getTimestamp(findColumn(columnName));
    }


    public Timestamp getTimestamp(int columnIndex, Calendar cal)
          throws SQLException {
        return getTimestamp(columnIndex);
    }


    public Timestamp getTimestamp(String columnName, Calendar cal)
          throws SQLException {
        return getTimestamp(findColumn(columnName), cal);
    }


    public URL getURL(int columnIndex) throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.getURL not yet implemented.");
    }


    public URL getURL(String columnName) throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.getURL not yet implemented.");
    }


    public void updateRef(int columnIndex, Ref x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.updateRef not yet implemented.");
    }


    public void updateRef(String columnName, Ref x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.updateRef not yet implemented.");
    }


    public void updateBlob(int columnIndex, Blob x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.updateBlob not yet implemented.");
    }


    public void updateBlob(String columnName, Blob x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.updateBlob not yet implemented.");
    }


    public void updateClob(int columnIndex, Clob x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.updateClob not yet implemented.");
    }


    public void updateClob(String columnName, Clob x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.updateClob not yet implemented.");
    }


    public void updateArray(int columnIndex, Array x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.updateArray not yet implemented.");
    }


    public void updateArray(String columnName, Array x)
          throws SQLException {
        throw new UnsupportedOperationException("FakeResultSet.updateArray not yet implemented.");
    }


    public int getType() throws SQLException {
        return getStatement().getResultSetType();
    }


    public InputStream getUnicodeStream(int columnIndex)
          throws SQLException {
        return (InputStream)getObject(columnIndex);
    }


    public InputStream getUnicodeStream(String columnName)
          throws SQLException {
        return getUnicodeStream(findColumn(columnName));
    }


    public SQLWarning getWarnings() throws SQLException {
        return null;
    }


    public void insertRow() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method insertRow() not yet implemented.");
    }


    public boolean isAfterLast() throws SQLException {
        return rowIndex > matrix.length;
    }


    public boolean isBeforeFirst() throws SQLException {
        return rowIndex > 0;
    }


    public boolean isFirst() throws SQLException {
        return rowIndex == 0;
    }


    public boolean isLast() throws SQLException {
        return rowIndex == matrix.length - 1;
    }


    public boolean last() throws SQLException {
        if (matrix.length <= 0) {
            return false;
        }
        rowIndex = matrix.length - 1;
        return true;
    }


    public void moveToCurrentRow() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method moveToCurrentRow() not yet implemented.");
    }


    public void moveToInsertRow() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method moveToInsertRow() not yet implemented.");
    }


    public boolean next() throws SQLException {
        rowIndex++;
        return (rowIndex < matrix.length);
    }


    public boolean previous() throws SQLException {
        rowIndex--;
        return isRowIndexValid();
    }


    public void refreshRow() throws SQLException {
    }


    public boolean relative(int rows) throws SQLException {
        rowIndex += rows;
        return isRowIndexValid();
    }


    public boolean rowDeleted() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method rowDeleted() not yet implemented.");
    }


    public boolean rowInserted() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method rowInserted() not yet implemented.");
    }


    public boolean rowUpdated() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method rowUpdated() not yet implemented.");
    }


    public void setFetchDirection(int direction) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setFetchDirection() not yet implemented.");
    }


    public void setFetchSize(int rows) throws SQLException {
    }


    public void updateAsciiStream(int columnIndex, InputStream x, int length)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateAsciiStream(String columnName, InputStream x, int length)
          throws SQLException {
        updateAsciiStream(findColumn(columnName), x, length);
    }


    public void updateBigDecimal(int columnIndex, BigDecimal x)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateBigDecimal(String columnName, BigDecimal x)
          throws SQLException {
        updateBigDecimal(findColumn(columnName), x);
    }


    public void updateBinaryStream(int columnIndex, InputStream x, int length)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateBinaryStream(String columnName, InputStream x, int length)
          throws SQLException {
        updateBinaryStream(findColumn(columnName), x, length);
    }


    public void updateBoolean(int columnIndex, boolean x)
          throws SQLException {
        updateObject(columnIndex, Boolean.valueOf(x));
    }


    public void updateBoolean(String columnName, boolean x)
          throws SQLException {
        updateBoolean(findColumn(columnName), x);
    }


    public void updateByte(int columnIndex, byte x)
          throws SQLException {
        updateObject(columnIndex, new Byte(x));
    }


    public void updateByte(String columnName, byte x)
          throws SQLException {
        updateByte(findColumn(columnName), x);
    }


    public void updateBytes(int columnIndex, byte[] x)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateBytes(String columnName, byte[] x)
          throws SQLException {
        updateBytes(findColumn(columnName), x);
    }


    public void updateCharacterStream(int columnIndex, Reader x, int length)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateCharacterStream(String columnName, Reader reader, int length)
          throws SQLException {
        updateCharacterStream(findColumn(columnName), reader, length);
    }


    public void updateDate(int columnIndex, Date x)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateDate(String columnName, Date x)
          throws SQLException {
        updateDate(findColumn(columnName), x);
    }


    public void updateDouble(int columnIndex, double x)
          throws SQLException {
        updateObject(columnIndex, new Double(x));
    }


    public void updateDouble(String columnName, double x)
          throws SQLException {
        updateDouble(findColumn(columnName), x);
    }


    public void updateFloat(int columnIndex, float x)
          throws SQLException {
        updateObject(columnIndex, new Float(x));
    }


    public void updateFloat(String columnName, float x)
          throws SQLException {
        updateFloat(findColumn(columnName), x);
    }


    public void updateInt(int columnIndex, int x)
          throws SQLException {
        updateObject(columnIndex, new Integer(x));
    }


    public void updateInt(String columnName, int x)
          throws SQLException {
        updateInt(findColumn(columnName), x);
    }


    public void updateLong(int columnIndex, long x)
          throws SQLException {
        updateObject(columnIndex, new Long(x));
    }


    public void updateLong(String columnName, long x)
          throws SQLException {
        updateLong(findColumn(columnName), x);
    }


    public void updateNull(int columnIndex) throws SQLException {
        updateObject(columnIndex, null);
    }


    public void updateNull(String columnName) throws SQLException {
        updateNull(findColumn(columnName));
    }


    public void updateObject(int columnIndex, Object x, int scale)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateObject(int columnIndex, Object x)
          throws SQLException {
        checkRowIndex();
        checkColumnIndex(columnIndex);
        matrix[rowIndex][columnIndex - 1] = x;
    }


    public void updateObject(String columnName, Object x, int scale)
          throws SQLException {
        updateObject(findColumn(columnName), x, scale);
    }


    public void updateObject(String columnName, Object x)
          throws SQLException {
        updateObject(findColumn(columnName), x);
    }


    public void updateRow() throws SQLException {
    }


    public void updateShort(int columnIndex, short x)
          throws SQLException {
        updateObject(columnIndex, new Short(x));
    }


    public void updateShort(String columnName, short x)
          throws SQLException {
        updateShort(findColumn(columnName), x);
    }


    public void updateString(int columnIndex, String x)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateString(String columnName, String x)
          throws SQLException {
        updateString(findColumn(columnName), x);
    }


    public void updateTime(int columnIndex, Time x)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateTime(String columnName, Time x)
          throws SQLException {
        updateTime(findColumn(columnName), x);
    }


    public void updateTimestamp(int columnIndex, Timestamp x)
          throws SQLException {
        updateObject(columnIndex, x);
    }


    public void updateTimestamp(String columnName, Timestamp x)
          throws SQLException {
        updateTimestamp(findColumn(columnName), x);
    }


    public boolean wasNull() throws SQLException {
        return getObject(lastColumnIndex) == null;
    }


    void setStatement(Statement stmt) {
        this.statement = stmt;
    }


    private void checkColumnIndex(int columnIndex)
          throws SQLException {
        if (columnIndex < 1 || columnIndex > matrix[rowIndex].length) {
            throw new SQLException("Bad ColumnIndex : " + columnIndex);
        }
    }


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


    private Number getNumber(int columnIndex) throws SQLException {
        Object val = getObject(columnIndex);
        if (val == null) {
            val = ZERO;
        }
        return (Number)val;
    }


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
