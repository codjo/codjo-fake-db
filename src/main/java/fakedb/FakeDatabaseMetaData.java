/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
/**
 * Overview. TODO a faire ici aussi
 *
 * @author $Author: coteg $
 * @version $Revision: 1.4 $
 */
class FakeDatabaseMetaData implements DatabaseMetaData {
    /**
     * Constructor for the FakeDatabaseMetaData object
     */
    FakeDatabaseMetaData() {}

    /**
     * Gets the URL attribute of the FakeDatabaseMetaData object
     *
     * @return The URL value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getURL() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getURL() not yet implemented.");
    }


    /**
     * Gets the UserName attribute of the FakeDatabaseMetaData object
     *
     * @return The UserName value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getUserName() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getUserName() not yet implemented.");
    }


    /**
     * Gets the ReadOnly attribute of the FakeDatabaseMetaData object
     *
     * @return The ReadOnly value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isReadOnly() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isReadOnly() not yet implemented.");
    }


    /**
     * Gets the DatabaseProductName attribute of the FakeDatabaseMetaData object
     *
     * @return The DatabaseProductName value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getDatabaseProductName() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getDatabaseProductName() not yet implemented.");
    }


    /**
     * Gets the DatabaseProductVersion attribute of the FakeDatabaseMetaData object
     *
     * @return The DatabaseProductVersion value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getDatabaseProductVersion() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getDatabaseProductVersion() not yet implemented.");
    }


    /**
     * Gets the DriverName attribute of the FakeDatabaseMetaData object
     *
     * @return The DriverName value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getDriverName() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getDriverName() not yet implemented.");
    }


    /**
     * Gets the DriverVersion attribute of the FakeDatabaseMetaData object
     *
     * @return The DriverVersion value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getDriverVersion() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getDriverVersion() not yet implemented.");
    }


    /**
     * Gets the DriverMajorVersion attribute of the FakeDatabaseMetaData object
     *
     * @return The DriverMajorVersion value
     *
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getDriverMajorVersion() {
        throw new java.lang.UnsupportedOperationException(
            "Method getDriverMajorVersion() not yet implemented.");
    }


    /**
     * Gets the DriverMinorVersion attribute of the FakeDatabaseMetaData object
     *
     * @return The DriverMinorVersion value
     *
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getDriverMinorVersion() {
        throw new java.lang.UnsupportedOperationException(
            "Method getDriverMinorVersion() not yet implemented.");
    }


    /**
     * Gets the IdentifierQuoteString attribute of the FakeDatabaseMetaData object
     *
     * @return The IdentifierQuoteString value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getIdentifierQuoteString() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getIdentifierQuoteString() not yet implemented.");
    }


    /**
     * Gets the SQLKeywords attribute of the FakeDatabaseMetaData object
     *
     * @return The SQLKeywords value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getSQLKeywords() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getSQLKeywords() not yet implemented.");
    }


    /**
     * Gets the NumericFunctions attribute of the FakeDatabaseMetaData object
     *
     * @return The NumericFunctions value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getNumericFunctions() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getNumericFunctions() not yet implemented.");
    }


    /**
     * Gets the StringFunctions attribute of the FakeDatabaseMetaData object
     *
     * @return The StringFunctions value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getStringFunctions() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getStringFunctions() not yet implemented.");
    }


    /**
     * Gets the SystemFunctions attribute of the FakeDatabaseMetaData object
     *
     * @return The SystemFunctions value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getSystemFunctions() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getSystemFunctions() not yet implemented.");
    }


    /**
     * Gets the TimeDateFunctions attribute of the FakeDatabaseMetaData object
     *
     * @return The TimeDateFunctions value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getTimeDateFunctions() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getTimeDateFunctions() not yet implemented.");
    }


    /**
     * Gets the SearchStringEscape attribute of the FakeDatabaseMetaData object
     *
     * @return The SearchStringEscape value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getSearchStringEscape() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getSearchStringEscape() not yet implemented.");
    }


    /**
     * Gets the ExtraNameCharacters attribute of the FakeDatabaseMetaData object
     *
     * @return The ExtraNameCharacters value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getExtraNameCharacters() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getExtraNameCharacters() not yet implemented.");
    }


    /**
     * Gets the SchemaTerm attribute of the FakeDatabaseMetaData object
     *
     * @return The SchemaTerm value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getSchemaTerm() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getSchemaTerm() not yet implemented.");
    }


    /**
     * Gets the ProcedureTerm attribute of the FakeDatabaseMetaData object
     *
     * @return The ProcedureTerm value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getProcedureTerm() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getProcedureTerm() not yet implemented.");
    }


    /**
     * Gets the CatalogTerm attribute of the FakeDatabaseMetaData object
     *
     * @return The CatalogTerm value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getCatalogTerm() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getCatalogTerm() not yet implemented.");
    }


    /**
     * Gets the CatalogAtStart attribute of the FakeDatabaseMetaData object
     *
     * @return The CatalogAtStart value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean isCatalogAtStart() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method isCatalogAtStart() not yet implemented.");
    }


    /**
     * Gets the CatalogSeparator attribute of the FakeDatabaseMetaData object
     *
     * @return The CatalogSeparator value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public String getCatalogSeparator() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getCatalogSeparator() not yet implemented.");
    }


    /**
     * Gets the MaxBinaryLiteralLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxBinaryLiteralLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxBinaryLiteralLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxBinaryLiteralLength() not yet implemented.");
    }


    /**
     * Gets the MaxCharLiteralLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxCharLiteralLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxCharLiteralLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxCharLiteralLength() not yet implemented.");
    }


    /**
     * Gets the MaxColumnNameLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxColumnNameLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxColumnNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxColumnNameLength() not yet implemented.");
    }


    /**
     * Gets the MaxColumnsInGroupBy attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxColumnsInGroupBy value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxColumnsInGroupBy() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxColumnsInGroupBy() not yet implemented.");
    }


    /**
     * Gets the MaxColumnsInIndex attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxColumnsInIndex value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxColumnsInIndex() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxColumnsInIndex() not yet implemented.");
    }


    /**
     * Gets the MaxColumnsInOrderBy attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxColumnsInOrderBy value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxColumnsInOrderBy() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxColumnsInOrderBy() not yet implemented.");
    }


    /**
     * Gets the MaxColumnsInSelect attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxColumnsInSelect value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxColumnsInSelect() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxColumnsInSelect() not yet implemented.");
    }


    /**
     * Gets the MaxColumnsInTable attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxColumnsInTable value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxColumnsInTable() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxColumnsInTable() not yet implemented.");
    }


    /**
     * Gets the MaxConnections attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxConnections value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxConnections() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxConnections() not yet implemented.");
    }


    /**
     * Gets the MaxCursorNameLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxCursorNameLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxCursorNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxCursorNameLength() not yet implemented.");
    }


    /**
     * Gets the MaxIndexLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxIndexLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxIndexLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxIndexLength() not yet implemented.");
    }


    /**
     * Gets the MaxSchemaNameLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxSchemaNameLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxSchemaNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxSchemaNameLength() not yet implemented.");
    }


    /**
     * Gets the MaxProcedureNameLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxProcedureNameLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxProcedureNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxProcedureNameLength() not yet implemented.");
    }


    /**
     * Gets the MaxCatalogNameLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxCatalogNameLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxCatalogNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxCatalogNameLength() not yet implemented.");
    }


    /**
     * Gets the MaxRowSize attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxRowSize value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxRowSize() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxRowSize() not yet implemented.");
    }


    /**
     * Gets the MaxStatementLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxStatementLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxStatementLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxStatementLength() not yet implemented.");
    }


    /**
     * Gets the MaxStatements attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxStatements value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxStatements() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxStatements() not yet implemented.");
    }


    /**
     * Gets the MaxTableNameLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxTableNameLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxTableNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxTableNameLength() not yet implemented.");
    }


    /**
     * Gets the MaxTablesInSelect attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxTablesInSelect value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxTablesInSelect() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxTablesInSelect() not yet implemented.");
    }


    /**
     * Gets the MaxUserNameLength attribute of the FakeDatabaseMetaData object
     *
     * @return The MaxUserNameLength value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getMaxUserNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getMaxUserNameLength() not yet implemented.");
    }


    /**
     * Gets the DefaultTransactionIsolation attribute of the FakeDatabaseMetaData object
     *
     * @return The DefaultTransactionIsolation value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public int getDefaultTransactionIsolation() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getDefaultTransactionIsolation() not yet implemented.");
    }


    /**
     * Gets the Procedures attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schemaPattern Description of Parameter
     * @param procedureNamePattern Description of Parameter
     *
     * @return The Procedures value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getProcedures(String catalog, String schemaPattern,
        String procedureNamePattern) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getProcedures() not yet implemented.");
    }


    /**
     * Gets the ProcedureColumns attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schemaPattern Description of Parameter
     * @param procedureNamePattern Description of Parameter
     * @param columnNamePattern Description of Parameter
     *
     * @return The ProcedureColumns value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getProcedureColumns(String catalog, String schemaPattern,
        String procedureNamePattern, String columnNamePattern)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getProcedureColumns() not yet implemented.");
    }


    public ResultSet getTables(String catalog, String schemaPattern,
        String tableNamePattern, String[] types) throws SQLException {
        String query =
            "FakeDatabaseMetaData.getTables(" + catalog + ", " + schemaPattern + ", "
            + tableNamePattern + ", " + Arrays.asList(types).toString() + ")";
        return popResultSet(query);
    }


    /**
     * Gets the Schemas attribute of the FakeDatabaseMetaData object
     *
     * @return The Schemas value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getSchemas() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getSchemas() not yet implemented.");
    }


    /**
     * Gets the Catalogs attribute of the FakeDatabaseMetaData object
     *
     * @return The Catalogs value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getCatalogs() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getCatalogs() not yet implemented.");
    }


    /**
     * Gets the TableTypes attribute of the FakeDatabaseMetaData object
     *
     * @return The TableTypes value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getTableTypes() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getTableTypes() not yet implemented.");
    }


    /**
     * Gets the Columns attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schemaPattern Description of Parameter
     * @param tableNamePattern Description of Parameter
     * @param columnNamePattern Description of Parameter
     *
     * @return The Columns value
     *
     * @exception SQLException Description of Exception
     */
    public ResultSet getColumns(String catalog, String schemaPattern,
        String tableNamePattern, String columnNamePattern)
        throws SQLException {
        String query =
            "FakeDatabaseMetaData.getColumns(" + catalog + ", " + schemaPattern + ", "
            + tableNamePattern + ", " + columnNamePattern + ")";
        return popResultSet(query);
    }


    /**
     * Gets the ColumnPrivileges attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schema Description of Parameter
     * @param table Description of Parameter
     * @param columnNamePattern Description of Parameter
     *
     * @return The ColumnPrivileges value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getColumnPrivileges(String catalog, String schema, String table,
        String columnNamePattern) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getColumnPrivileges() not yet implemented.");
    }


    /**
     * Gets the TablePrivileges attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schemaPattern Description of Parameter
     * @param tableNamePattern Description of Parameter
     *
     * @return The TablePrivileges value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getTablePrivileges(String catalog, String schemaPattern,
        String tableNamePattern) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getTablePrivileges() not yet implemented.");
    }


    /**
     * Gets the BestRowIdentifier attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schema Description of Parameter
     * @param table Description of Parameter
     * @param scope Description of Parameter
     * @param nullable Description of Parameter
     *
     * @return The BestRowIdentifier value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getBestRowIdentifier(String catalog, String schema, String table,
        int scope, boolean nullable) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getBestRowIdentifier() not yet implemented.");
    }


    /**
     * Gets the VersionColumns attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schema Description of Parameter
     * @param table Description of Parameter
     *
     * @return The VersionColumns value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getVersionColumns(String catalog, String schema, String table)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getVersionColumns() not yet implemented.");
    }


    /**
     * Gets the PrimaryKeys attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schema Description of Parameter
     * @param table Description of Parameter
     *
     * @return The PrimaryKeys value
     *
     * @exception SQLException Description of Exception
     */
    public ResultSet getPrimaryKeys(String catalog, String schema, String table)
        throws SQLException {
        String query =
            "FakeDatabaseMetaData.getPrimaryKeys(" + catalog + ", " + schema + ", "
            + table + ")";
        return popResultSet(query);
    }


    public ResultSet getImportedKeys(String catalog, String schema, String table)
        throws SQLException {
        String query =
            "FakeDatabaseMetaData.getImportedKeys(" + catalog + ", " + schema + ", "
            + table + ")";
        return popResultSet(query);
    }


    public ResultSet getExportedKeys(String catalog, String schema, String table)
        throws SQLException {
        String query =
            "FakeDatabaseMetaData.getExportedKeys(" + catalog + ", " + schema + ", "
            + table + ")";
        return popResultSet(query);
    }


    /**
     * Gets the CrossReference attribute of the FakeDatabaseMetaData object
     *
     * @param primaryCatalog Description of Parameter
     * @param primarySchema Description of Parameter
     * @param primaryTable Description of Parameter
     * @param foreignCatalog Description of Parameter
     * @param foreignSchema Description of Parameter
     * @param foreignTable Description of Parameter
     *
     * @return The CrossReference value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getCrossReference(String primaryCatalog, String primarySchema,
        String primaryTable, String foreignCatalog, String foreignSchema,
        String foreignTable) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getCrossReference() not yet implemented.");
    }


    /**
     * Gets the TypeInfo attribute of the FakeDatabaseMetaData object
     *
     * @return The TypeInfo value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getTypeInfo() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getTypeInfo() not yet implemented.");
    }


    /**
     * Gets the IndexInfo attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schema Description of Parameter
     * @param table Description of Parameter
     * @param unique Description of Parameter
     * @param approximate Description of Parameter
     *
     * @return The IndexInfo value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getIndexInfo(String catalog, String schema, String table,
        boolean unique, boolean approximate) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getIndexInfo() not yet implemented.");
    }


    /**
     * Gets the UDTs attribute of the FakeDatabaseMetaData object
     *
     * @param catalog Description of Parameter
     * @param schemaPattern Description of Parameter
     * @param typeNamePattern Description of Parameter
     * @param types Description of Parameter
     *
     * @return The UDTs value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public ResultSet getUDTs(String catalog, String schemaPattern,
        String typeNamePattern, int[] types) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getUDTs() not yet implemented.");
    }


    /**
     * Gets the Connection attribute of the FakeDatabaseMetaData object
     *
     * @return The Connection value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public Connection getConnection() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method getConnection() not yet implemented.");
    }


    public boolean supportsSavepoints() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.supportsSavepoints not yet implemented.");
    }


    public boolean supportsNamedParameters() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.supportsNamedParameters not yet implemented.");
    }


    public boolean supportsMultipleOpenResults() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.supportsMultipleOpenResults not yet implemented.");
    }


    public boolean supportsGetGeneratedKeys() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.supportsGetGeneratedKeys not yet implemented.");
    }


    public ResultSet getSuperTypes(String catalog, String schemaPattern,
        String typeNamePattern) throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.getSuperTypes not yet implemented.");
    }


    public ResultSet getSuperTables(String catalog, String schemaPattern,
        String tableNamePattern) throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.getSuperTables not yet implemented.");
    }


    public ResultSet getAttributes(String catalog, String schemaPattern,
        String typeNamePattern, String attributeNamePattern)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.getAttributes not yet implemented.");
    }


    public boolean supportsResultSetHoldability(int holdability)
        throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.supportsResultSetHoldability not yet implemented.");
    }


    public int getResultSetHoldability() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.getResultSetHoldability not yet implemented.");
    }


    public int getDatabaseMajorVersion() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.getDatabaseMajorVersion not yet implemented.");
    }


    public int getDatabaseMinorVersion() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.getDatabaseMinorVersion not yet implemented.");
    }


    public int getJDBCMajorVersion() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.getJDBCMajorVersion not yet implemented.");
    }


    public int getJDBCMinorVersion() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.getJDBCMinorVersion not yet implemented.");
    }


    public int getSQLStateType() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.getSQLStateType not yet implemented.");
    }


    public boolean locatorsUpdateCopy() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.locatorsUpdateCopy not yet implemented.");
    }


    public boolean supportsStatementPooling() throws SQLException {
        throw new UnsupportedOperationException(
            "FakeDatabaseMetaData.supportsStatementPooling not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean allProceduresAreCallable() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method allProceduresAreCallable() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean allTablesAreSelectable() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method allTablesAreSelectable() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean nullsAreSortedHigh() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method nullsAreSortedHigh() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean nullsAreSortedLow() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method nullsAreSortedLow() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean nullsAreSortedAtStart() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method nullsAreSortedAtStart() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean nullsAreSortedAtEnd() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method nullsAreSortedAtEnd() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean usesLocalFiles() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method usesLocalFiles() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean usesLocalFilePerTable() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method usesLocalFilePerTable() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsMixedCaseIdentifiers()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsMixedCaseIdentifiers() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean storesUpperCaseIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method storesUpperCaseIdentifiers() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean storesLowerCaseIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method storesLowerCaseIdentifiers() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean storesMixedCaseIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method storesMixedCaseIdentifiers() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsMixedCaseQuotedIdentifiers()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsMixedCaseQuotedIdentifiers() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean storesUpperCaseQuotedIdentifiers()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method storesUpperCaseQuotedIdentifiers() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean storesLowerCaseQuotedIdentifiers()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method storesLowerCaseQuotedIdentifiers() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean storesMixedCaseQuotedIdentifiers()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method storesMixedCaseQuotedIdentifiers() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsAlterTableWithAddColumn()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsAlterTableWithAddColumn() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsAlterTableWithDropColumn()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsAlterTableWithDropColumn() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsColumnAliasing() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsColumnAliasing() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean nullPlusNonNullIsNull() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method nullPlusNonNullIsNull() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsConvert() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsConvert() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param fromType Description of Parameter
     * @param toType Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsConvert(int fromType, int toType)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsConvert() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsTableCorrelationNames()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsTableCorrelationNames() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsDifferentTableCorrelationNames()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsDifferentTableCorrelationNames() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsExpressionsInOrderBy()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsExpressionsInOrderBy() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsOrderByUnrelated() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsOrderByUnrelated() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsGroupBy() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsGroupBy() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsGroupByUnrelated() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsGroupByUnrelated() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsGroupByBeyondSelect() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsGroupByBeyondSelect() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsLikeEscapeClause() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsLikeEscapeClause() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsMultipleResultSets() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsMultipleResultSets() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsMultipleTransactions()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsMultipleTransactions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsNonNullableColumns() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsNonNullableColumns() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsMinimumSQLGrammar() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsMinimumSQLGrammar() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsCoreSQLGrammar() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsCoreSQLGrammar() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsExtendedSQLGrammar() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsExtendedSQLGrammar() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsANSI92EntryLevelSQL() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsANSI92EntryLevelSQL() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsANSI92IntermediateSQL()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsANSI92IntermediateSQL() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsANSI92FullSQL() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsANSI92FullSQL() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsIntegrityEnhancementFacility()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsIntegrityEnhancementFacility() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsOuterJoins() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsOuterJoins() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsFullOuterJoins() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsFullOuterJoins() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsLimitedOuterJoins() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsLimitedOuterJoins() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSchemasInDataManipulation()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSchemasInDataManipulation() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSchemasInProcedureCalls()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSchemasInProcedureCalls() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSchemasInTableDefinitions()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSchemasInTableDefinitions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSchemasInIndexDefinitions()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSchemasInIndexDefinitions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSchemasInPrivilegeDefinitions()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSchemasInPrivilegeDefinitions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsCatalogsInDataManipulation()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsCatalogsInDataManipulation() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsCatalogsInProcedureCalls()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsCatalogsInProcedureCalls() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsCatalogsInTableDefinitions()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsCatalogsInTableDefinitions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsCatalogsInIndexDefinitions()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsCatalogsInIndexDefinitions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsCatalogsInPrivilegeDefinitions()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsCatalogsInPrivilegeDefinitions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsPositionedDelete() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsPositionedDelete() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsPositionedUpdate() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsPositionedUpdate() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSelectForUpdate() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSelectForUpdate() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsStoredProcedures() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsStoredProcedures() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSubqueriesInComparisons()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSubqueriesInComparisons() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSubqueriesInExists() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSubqueriesInExists() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSubqueriesInIns() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSubqueriesInIns() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsSubqueriesInQuantifieds()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsSubqueriesInQuantifieds() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsCorrelatedSubqueries()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsCorrelatedSubqueries() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsUnion() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsUnion() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsUnionAll() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsUnionAll() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsOpenCursorsAcrossCommit()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsOpenCursorsAcrossCommit() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsOpenCursorsAcrossRollback()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsOpenCursorsAcrossRollback() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsOpenStatementsAcrossCommit()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsOpenStatementsAcrossCommit() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsOpenStatementsAcrossRollback()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsOpenStatementsAcrossRollback() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method doesMaxRowSizeIncludeBlobs() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsTransactions() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsTransactions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param level Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsTransactionIsolationLevel(int level)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsTransactionIsolationLevel() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsDataDefinitionAndDataManipulationTransactions()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsDataDefinitionAndDataManipulationTransactions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsDataManipulationTransactionsOnly()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsDataManipulationTransactionsOnly() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean dataDefinitionCausesTransactionCommit()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method dataDefinitionCausesTransactionCommit() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean dataDefinitionIgnoredInTransactions()
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method dataDefinitionIgnoredInTransactions() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsResultSetType(int type)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsResultSetType() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     * @param concurrency Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsResultSetConcurrency(int type, int concurrency)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsResultSetConcurrency() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean ownUpdatesAreVisible(int type)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method ownUpdatesAreVisible() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean ownDeletesAreVisible(int type)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method ownDeletesAreVisible() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean ownInsertsAreVisible(int type)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method ownInsertsAreVisible() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean othersUpdatesAreVisible(int type)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method othersUpdatesAreVisible() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean othersDeletesAreVisible(int type)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method othersDeletesAreVisible() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean othersInsertsAreVisible(int type)
        throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method othersInsertsAreVisible() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean updatesAreDetected(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method updatesAreDetected() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean deletesAreDetected(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method deletesAreDetected() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param type Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean insertsAreDetected(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method insertsAreDetected() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException TODO
     */
    public boolean supportsBatchUpdates() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
            "Method supportsBatchUpdates() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param query Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @exception SQLException Description of Exception
     */
    private ResultSet popResultSet(String query) throws SQLException {
        FakeResultSet rs = FakeDriver.getDriver().popResultSet(query);
        return rs;
    }
}
