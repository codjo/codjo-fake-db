/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

class FakeResultSetMetaData implements ResultSetMetaData {
    private Object[][] matrix = {};


    FakeResultSetMetaData(Object[][] matrix) throws SQLException {
        this.matrix = matrix;
    }


    public int getColumnCount() throws SQLException {
        if (matrix.length == 0) {
            return 0;
        }
        if (matrix.length == 1) {
            return matrix[0].length;
        }
        return matrix[1].length;
    }


    public boolean isAutoIncrement(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isAutoIncrement() not yet implemented.");
    }


    public boolean isCaseSensitive(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isCaseSensitive() not yet implemented.");
    }


    public boolean isSearchable(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isSearchable() not yet implemented.");
    }


    public boolean isCurrency(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isCurrency() not yet implemented.");
    }


    public int isNullable(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isNullable() not yet implemented.");
    }


    public boolean isSigned(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isSigned() not yet implemented.");
    }


    public int getColumnDisplaySize(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getColumnDisplaySize() not yet implemented.");
    }


    public String getColumnLabel(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getColumnLabel() not yet implemented.");
    }


    public String getColumnName(int column) throws SQLException {
        if (matrix.length == 0
            || (matrix.length > 1 && matrix[0].length != matrix[1].length)) {
            throw new SQLException("Column Name has not been set");
        }
        if (matrix[0].length < column) {
            throw new SQLException("Column index is out of bound");
        }
        return (String)matrix[0][column - 1];
    }


    public String getSchemaName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getSchemaName() not yet implemented.");
    }


    public int getPrecision(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getPrecision() not yet implemented.");
    }


    public int getScale(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getScale() not yet implemented.");
    }


    public String getTableName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTableName() not yet implemented.");
    }


    public String getCatalogName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getCatalogName() not yet implemented.");
    }


    public int getColumnType(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getColumnType() not yet implemented.");
    }


    public String getColumnTypeName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getColumnTypeName() not yet implemented.");
    }


    public boolean isReadOnly(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isReadOnly() not yet implemented.");
    }


    public boolean isWritable(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isWritable() not yet implemented.");
    }


    public boolean isDefinitelyWritable(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isDefinitelyWritable() not yet implemented.");
    }


    public String getColumnClassName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getColumnClassName() not yet implemented.");
    }
}
