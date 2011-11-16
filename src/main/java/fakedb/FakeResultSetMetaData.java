/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 * Description of the Class
 *
 * @author $Author: GONNOT $
 * @version $Revision: 1.2 $
 */
class FakeResultSetMetaData implements ResultSetMetaData {
    private Object[][] matrix = {};

    /**
     * Constructeur de FakeResultSetMetaData
     *
     * @param m Description of Parameter
     *
     * @exception SQLException Description of Exception
     */
    public FakeResultSetMetaData(Object[][] m) throws SQLException {
        this.matrix = m;
    }

    /**
     * Retourne l attribut columnCount de l object FakeResultSetMetaData
     *
     * @return La valeur de columnCount
     *
     * @exception SQLException Description of Exception
     */
    public int getColumnCount() throws SQLException {
        if (matrix.length == 0) {
            return 0;
        }
        if (matrix.length == 1) {
            return matrix[0].length;
        }
        return matrix[1].length;
    }


    /**
     * Retourne l attribut autoIncrement de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de autoIncrement
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isAutoIncrement(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isAutoIncrement() not yet implemented.");
    }


    /**
     * Retourne l attribut caseSensitive de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de caseSensitive
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isCaseSensitive(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isCaseSensitive() not yet implemented.");
    }


    /**
     * Retourne l attribut searchable de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de searchable
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isSearchable(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isSearchable() not yet implemented.");
    }


    /**
     * Retourne l attribut currency de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de currency
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isCurrency(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isCurrency() not yet implemented.");
    }


    /**
     * Retourne l attribut nullable de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de nullable
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int isNullable(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isNullable() not yet implemented.");
    }


    /**
     * Retourne l attribut signed de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de signed
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isSigned(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isSigned() not yet implemented.");
    }


    /**
     * Retourne l attribut columnDisplaySize de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de columnDisplaySize
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getColumnDisplaySize(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getColumnDisplaySize() not yet implemented.");
    }


    /**
     * Retourne l attribut columnLabel de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de columnLabel
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getColumnLabel(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getColumnLabel() not yet implemented.");
    }


    /**
     * Retourne l attribut columnName de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de columnName
     *
     * @exception SQLException Description of Exception
     */
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


    /**
     * Retourne l attribut schemaName de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de schemaName
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getSchemaName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getSchemaName() not yet implemented.");
    }


    /**
     * Retourne l attribut precision de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de precision
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getPrecision(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getPrecision() not yet implemented.");
    }


    /**
     * Retourne l attribut scale de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de scale
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getScale(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getScale() not yet implemented.");
    }


    /**
     * Retourne l attribut tableName de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de tableName
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getTableName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getTableName() not yet implemented.");
    }


    /**
     * Retourne l attribut catalogName de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de catalogName
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getCatalogName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getCatalogName() not yet implemented.");
    }


    /**
     * Retourne l attribut columnType de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de columnType
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getColumnType(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getColumnType() not yet implemented.");
    }


    /**
     * Retourne l attribut columnTypeName de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de columnTypeName
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getColumnTypeName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getColumnTypeName() not yet implemented.");
    }


    /**
     * Retourne l attribut readOnly de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de readOnly
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isReadOnly(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isReadOnly() not yet implemented.");
    }


    /**
     * Retourne l attribut writable de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de writable
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isWritable(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isWritable() not yet implemented.");
    }


    /**
     * Retourne l attribut definitelyWritable de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de definitelyWritable
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isDefinitelyWritable(int column)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isDefinitelyWritable() not yet implemented.");
    }


    /**
     * Retourne l attribut columnClassName de l object FakeResultSetMetaData
     *
     * @param column Description of Parameter
     *
     * @return La valeur de columnClassName
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getColumnClassName(int column) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getColumnClassName() not yet implemented.");
    }
}
