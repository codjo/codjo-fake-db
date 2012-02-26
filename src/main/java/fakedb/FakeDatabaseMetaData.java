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

class FakeDatabaseMetaData implements DatabaseMetaData {

    FakeDatabaseMetaData() {
    }


    public String getURL() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getURL() not yet implemented.");
    }


    public String getUserName() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getUserName() not yet implemented.");
    }


    public boolean isReadOnly() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isReadOnly() not yet implemented.");
    }


    public String getDatabaseProductName() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDatabaseProductName() not yet implemented.");
    }


    public String getDatabaseProductVersion() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDatabaseProductVersion() not yet implemented.");
    }


    public String getDriverName() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDriverName() not yet implemented.");
    }


    public String getDriverVersion() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDriverVersion() not yet implemented.");
    }


    public int getDriverMajorVersion() {
        throw new java.lang.UnsupportedOperationException("Method getDriverMajorVersion() not yet implemented.");
    }


    public int getDriverMinorVersion() {
        throw new java.lang.UnsupportedOperationException("Method getDriverMinorVersion() not yet implemented.");
    }


    public String getIdentifierQuoteString() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getIdentifierQuoteString() not yet implemented.");
    }


    public String getSQLKeywords() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getSQLKeywords() not yet implemented.");
    }


    public String getNumericFunctions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getNumericFunctions() not yet implemented.");
    }


    public String getStringFunctions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getStringFunctions() not yet implemented.");
    }


    public String getSystemFunctions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getSystemFunctions() not yet implemented.");
    }


    public String getTimeDateFunctions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTimeDateFunctions() not yet implemented.");
    }


    public String getSearchStringEscape() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getSearchStringEscape() not yet implemented.");
    }


    public String getExtraNameCharacters() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getExtraNameCharacters() not yet implemented.");
    }


    public String getSchemaTerm() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getSchemaTerm() not yet implemented.");
    }


    public String getProcedureTerm() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getProcedureTerm() not yet implemented.");
    }


    public String getCatalogTerm() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getCatalogTerm() not yet implemented.");
    }


    public boolean isCatalogAtStart() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isCatalogAtStart() not yet implemented.");
    }


    public String getCatalogSeparator() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getCatalogSeparator() not yet implemented.");
    }


    public int getMaxBinaryLiteralLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxBinaryLiteralLength() not yet implemented.");
    }


    public int getMaxCharLiteralLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxCharLiteralLength() not yet implemented.");
    }


    public int getMaxColumnNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxColumnNameLength() not yet implemented.");
    }


    public int getMaxColumnsInGroupBy() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxColumnsInGroupBy() not yet implemented.");
    }


    public int getMaxColumnsInIndex() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxColumnsInIndex() not yet implemented.");
    }


    public int getMaxColumnsInOrderBy() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxColumnsInOrderBy() not yet implemented.");
    }


    public int getMaxColumnsInSelect() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxColumnsInSelect() not yet implemented.");
    }


    public int getMaxColumnsInTable() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxColumnsInTable() not yet implemented.");
    }


    public int getMaxConnections() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxConnections() not yet implemented.");
    }


    public int getMaxCursorNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxCursorNameLength() not yet implemented.");
    }


    public int getMaxIndexLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxIndexLength() not yet implemented.");
    }


    public int getMaxSchemaNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxSchemaNameLength() not yet implemented.");
    }


    public int getMaxProcedureNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxProcedureNameLength() not yet implemented.");
    }


    public int getMaxCatalogNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxCatalogNameLength() not yet implemented.");
    }


    public int getMaxRowSize() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxRowSize() not yet implemented.");
    }


    public int getMaxStatementLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxStatementLength() not yet implemented.");
    }


    public int getMaxStatements() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxStatements() not yet implemented.");
    }


    public int getMaxTableNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxTableNameLength() not yet implemented.");
    }


    public int getMaxTablesInSelect() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxTablesInSelect() not yet implemented.");
    }


    public int getMaxUserNameLength() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getMaxUserNameLength() not yet implemented.");
    }


    public int getDefaultTransactionIsolation() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getDefaultTransactionIsolation() not yet implemented.");
    }


    public ResultSet getProcedures(String catalog, String schemaPattern,
                                   String procedureNamePattern) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getProcedures() not yet implemented.");
    }


    public ResultSet getProcedureColumns(String catalog, String schemaPattern,
                                         String procedureNamePattern, String columnNamePattern) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getProcedureColumns() not yet implemented.");
    }


    public ResultSet getTables(String catalog, String schemaPattern,
                               String tableNamePattern, String[] types) throws SQLException {
        String query =
              "FakeDatabaseMetaData.getTables(" + catalog + ", " + schemaPattern + ", "
              + tableNamePattern + ", " + Arrays.asList(types).toString() + ")";
        return popResultSet(query);
    }


    public ResultSet getSchemas() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getSchemas() not yet implemented.");
    }


    public ResultSet getCatalogs() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getCatalogs() not yet implemented.");
    }


    public ResultSet getTableTypes() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTableTypes() not yet implemented.");
    }


    public ResultSet getColumns(String catalog, String schemaPattern,
                                String tableNamePattern, String columnNamePattern) throws SQLException {
        String query =
              "FakeDatabaseMetaData.getColumns(" + catalog + ", " + schemaPattern + ", "
              + tableNamePattern + ", " + columnNamePattern + ")";
        return popResultSet(query);
    }


    public ResultSet getColumnPrivileges(String catalog, String schema, String table,
                                         String columnNamePattern) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getColumnPrivileges() not yet implemented.");
    }


    public ResultSet getTablePrivileges(String catalog, String schemaPattern,
                                        String tableNamePattern) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTablePrivileges() not yet implemented.");
    }


    public ResultSet getBestRowIdentifier(String catalog, String schema, String table,
                                          int scope, boolean nullable) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getBestRowIdentifier() not yet implemented.");
    }


    public ResultSet getVersionColumns(String catalog, String schema, String table) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getVersionColumns() not yet implemented.");
    }


    public ResultSet getPrimaryKeys(String catalog, String schema, String table) throws SQLException {
        String query =
              "FakeDatabaseMetaData.getPrimaryKeys(" + catalog + ", " + schema + ", "
              + table + ")";
        return popResultSet(query);
    }


    public ResultSet getImportedKeys(String catalog, String schema, String table) throws SQLException {
        String query =
              "FakeDatabaseMetaData.getImportedKeys(" + catalog + ", " + schema + ", "
              + table + ")";
        return popResultSet(query);
    }


    public ResultSet getExportedKeys(String catalog, String schema, String table) throws SQLException {
        String query =
              "FakeDatabaseMetaData.getExportedKeys(" + catalog + ", " + schema + ", "
              + table + ")";
        return popResultSet(query);
    }


    public ResultSet getCrossReference(String primaryCatalog, String primarySchema,
                                       String primaryTable, String foreignCatalog, String foreignSchema,
                                       String foreignTable) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getCrossReference() not yet implemented.");
    }


    public ResultSet getTypeInfo() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTypeInfo() not yet implemented.");
    }


    public ResultSet getIndexInfo(String catalog, String schema, String table,
                                  boolean unique, boolean approximate) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getIndexInfo() not yet implemented.");
    }


    public ResultSet getUDTs(String catalog, String schemaPattern,
                             String typeNamePattern, int[] types) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getUDTs() not yet implemented.");
    }


    public Connection getConnection() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getConnection() not yet implemented.");
    }


    public boolean supportsSavepoints() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.supportsSavepoints not yet implemented.");
    }


    public boolean supportsNamedParameters() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.supportsNamedParameters not yet implemented.");
    }


    public boolean supportsMultipleOpenResults() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.supportsMultipleOpenResults not yet implemented.");
    }


    public boolean supportsGetGeneratedKeys() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.supportsGetGeneratedKeys not yet implemented.");
    }


    public ResultSet getSuperTypes(String catalog, String schemaPattern,
                                   String typeNamePattern) throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.getSuperTypes not yet implemented.");
    }


    public ResultSet getSuperTables(String catalog, String schemaPattern,
                                    String tableNamePattern) throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.getSuperTables not yet implemented.");
    }


    public ResultSet getAttributes(String catalog, String schemaPattern,
                                   String typeNamePattern, String attributeNamePattern) throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.getAttributes not yet implemented.");
    }


    public boolean supportsResultSetHoldability(int holdability) throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.supportsResultSetHoldability not yet implemented.");
    }


    public int getResultSetHoldability() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.getResultSetHoldability not yet implemented.");
    }


    public int getDatabaseMajorVersion() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.getDatabaseMajorVersion not yet implemented.");
    }


    public int getDatabaseMinorVersion() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.getDatabaseMinorVersion not yet implemented.");
    }


    public int getJDBCMajorVersion() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.getJDBCMajorVersion not yet implemented.");
    }


    public int getJDBCMinorVersion() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.getJDBCMinorVersion not yet implemented.");
    }


    public int getSQLStateType() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.getSQLStateType not yet implemented.");
    }


    public boolean locatorsUpdateCopy() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.locatorsUpdateCopy not yet implemented.");
    }


    public boolean supportsStatementPooling() throws SQLException {
        throw new UnsupportedOperationException("FakeDatabaseMetaData.supportsStatementPooling not yet implemented.");
    }


    public boolean allProceduresAreCallable() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method allProceduresAreCallable() not yet implemented.");
    }


    public boolean allTablesAreSelectable() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method allTablesAreSelectable() not yet implemented.");
    }


    public boolean nullsAreSortedHigh() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method nullsAreSortedHigh() not yet implemented.");
    }


    public boolean nullsAreSortedLow() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method nullsAreSortedLow() not yet implemented.");
    }


    public boolean nullsAreSortedAtStart() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method nullsAreSortedAtStart() not yet implemented.");
    }


    public boolean nullsAreSortedAtEnd() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method nullsAreSortedAtEnd() not yet implemented.");
    }


    public boolean usesLocalFiles() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method usesLocalFiles() not yet implemented.");
    }


    public boolean usesLocalFilePerTable() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method usesLocalFilePerTable() not yet implemented.");
    }


    public boolean supportsMixedCaseIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsMixedCaseIdentifiers() not yet implemented.");
    }


    public boolean storesUpperCaseIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method storesUpperCaseIdentifiers() not yet implemented.");
    }


    public boolean storesLowerCaseIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method storesLowerCaseIdentifiers() not yet implemented.");
    }


    public boolean storesMixedCaseIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method storesMixedCaseIdentifiers() not yet implemented.");
    }


    public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsMixedCaseQuotedIdentifiers() not yet implemented.");
    }


    public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method storesUpperCaseQuotedIdentifiers() not yet implemented.");
    }


    public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method storesLowerCaseQuotedIdentifiers() not yet implemented.");
    }


    public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method storesMixedCaseQuotedIdentifiers() not yet implemented.");
    }


    public boolean supportsAlterTableWithAddColumn() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsAlterTableWithAddColumn() not yet implemented.");
    }


    public boolean supportsAlterTableWithDropColumn() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsAlterTableWithDropColumn() not yet implemented.");
    }


    public boolean supportsColumnAliasing() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsColumnAliasing() not yet implemented.");
    }


    public boolean nullPlusNonNullIsNull() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method nullPlusNonNullIsNull() not yet implemented.");
    }


    public boolean supportsConvert() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsConvert() not yet implemented.");
    }


    public boolean supportsConvert(int fromType, int toType) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsConvert() not yet implemented.");
    }


    public boolean supportsTableCorrelationNames() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsTableCorrelationNames() not yet implemented.");
    }


    public boolean supportsDifferentTableCorrelationNames() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsDifferentTableCorrelationNames() not yet implemented.");
    }


    public boolean supportsExpressionsInOrderBy() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsExpressionsInOrderBy() not yet implemented.");
    }


    public boolean supportsOrderByUnrelated() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsOrderByUnrelated() not yet implemented.");
    }


    public boolean supportsGroupBy() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsGroupBy() not yet implemented.");
    }


    public boolean supportsGroupByUnrelated() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsGroupByUnrelated() not yet implemented.");
    }


    public boolean supportsGroupByBeyondSelect() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsGroupByBeyondSelect() not yet implemented.");
    }


    public boolean supportsLikeEscapeClause() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsLikeEscapeClause() not yet implemented.");
    }


    public boolean supportsMultipleResultSets() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsMultipleResultSets() not yet implemented.");
    }


    public boolean supportsMultipleTransactions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsMultipleTransactions() not yet implemented.");
    }


    public boolean supportsNonNullableColumns() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsNonNullableColumns() not yet implemented.");
    }


    public boolean supportsMinimumSQLGrammar() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsMinimumSQLGrammar() not yet implemented.");
    }


    public boolean supportsCoreSQLGrammar() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsCoreSQLGrammar() not yet implemented.");
    }


    public boolean supportsExtendedSQLGrammar() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsExtendedSQLGrammar() not yet implemented.");
    }


    public boolean supportsANSI92EntryLevelSQL() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsANSI92EntryLevelSQL() not yet implemented.");
    }


    public boolean supportsANSI92IntermediateSQL() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsANSI92IntermediateSQL() not yet implemented.");
    }


    public boolean supportsANSI92FullSQL() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsANSI92FullSQL() not yet implemented.");
    }


    public boolean supportsIntegrityEnhancementFacility() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsIntegrityEnhancementFacility() not yet implemented.");
    }


    public boolean supportsOuterJoins() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsOuterJoins() not yet implemented.");
    }


    public boolean supportsFullOuterJoins() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsFullOuterJoins() not yet implemented.");
    }


    public boolean supportsLimitedOuterJoins() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsLimitedOuterJoins() not yet implemented.");
    }


    public boolean supportsSchemasInDataManipulation() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSchemasInDataManipulation() not yet implemented.");
    }


    public boolean supportsSchemasInProcedureCalls() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSchemasInProcedureCalls() not yet implemented.");
    }


    public boolean supportsSchemasInTableDefinitions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSchemasInTableDefinitions() not yet implemented.");
    }


    public boolean supportsSchemasInIndexDefinitions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSchemasInIndexDefinitions() not yet implemented.");
    }


    public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSchemasInPrivilegeDefinitions() not yet implemented.");
    }


    public boolean supportsCatalogsInDataManipulation() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsCatalogsInDataManipulation() not yet implemented.");
    }


    public boolean supportsCatalogsInProcedureCalls() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsCatalogsInProcedureCalls() not yet implemented.");
    }


    public boolean supportsCatalogsInTableDefinitions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsCatalogsInTableDefinitions() not yet implemented.");
    }


    public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsCatalogsInIndexDefinitions() not yet implemented.");
    }


    public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsCatalogsInPrivilegeDefinitions() not yet implemented.");
    }


    public boolean supportsPositionedDelete() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsPositionedDelete() not yet implemented.");
    }


    public boolean supportsPositionedUpdate() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsPositionedUpdate() not yet implemented.");
    }


    public boolean supportsSelectForUpdate() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSelectForUpdate() not yet implemented.");
    }


    public boolean supportsStoredProcedures() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsStoredProcedures() not yet implemented.");
    }


    public boolean supportsSubqueriesInComparisons() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSubqueriesInComparisons() not yet implemented.");
    }


    public boolean supportsSubqueriesInExists() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSubqueriesInExists() not yet implemented.");
    }


    public boolean supportsSubqueriesInIns() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSubqueriesInIns() not yet implemented.");
    }


    public boolean supportsSubqueriesInQuantifieds() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsSubqueriesInQuantifieds() not yet implemented.");
    }


    public boolean supportsCorrelatedSubqueries() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsCorrelatedSubqueries() not yet implemented.");
    }


    public boolean supportsUnion() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsUnion() not yet implemented.");
    }


    public boolean supportsUnionAll() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsUnionAll() not yet implemented.");
    }


    public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsOpenCursorsAcrossCommit() not yet implemented.");
    }


    public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsOpenCursorsAcrossRollback() not yet implemented.");
    }


    public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsOpenStatementsAcrossCommit() not yet implemented.");
    }


    public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsOpenStatementsAcrossRollback() not yet implemented.");
    }


    public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method doesMaxRowSizeIncludeBlobs() not yet implemented.");
    }


    public boolean supportsTransactions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsTransactions() not yet implemented.");
    }


    public boolean supportsTransactionIsolationLevel(int level) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsTransactionIsolationLevel() not yet implemented.");
    }


    public boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsDataDefinitionAndDataManipulationTransactions() not yet implemented.");
    }


    public boolean supportsDataManipulationTransactionsOnly() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsDataManipulationTransactionsOnly() not yet implemented.");
    }


    public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method dataDefinitionCausesTransactionCommit() not yet implemented.");
    }


    public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method dataDefinitionIgnoredInTransactions() not yet implemented.");
    }


    public boolean supportsResultSetType(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsResultSetType() not yet implemented.");
    }


    public boolean supportsResultSetConcurrency(int type, int concurrency) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsResultSetConcurrency() not yet implemented.");
    }


    public boolean ownUpdatesAreVisible(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method ownUpdatesAreVisible() not yet implemented.");
    }


    public boolean ownDeletesAreVisible(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method ownDeletesAreVisible() not yet implemented.");
    }


    public boolean ownInsertsAreVisible(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method ownInsertsAreVisible() not yet implemented.");
    }


    public boolean othersUpdatesAreVisible(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method othersUpdatesAreVisible() not yet implemented.");
    }


    public boolean othersDeletesAreVisible(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method othersDeletesAreVisible() not yet implemented.");
    }


    public boolean othersInsertsAreVisible(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method othersInsertsAreVisible() not yet implemented.");
    }


    public boolean updatesAreDetected(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method updatesAreDetected() not yet implemented.");
    }


    public boolean deletesAreDetected(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method deletesAreDetected() not yet implemented.");
    }


    public boolean insertsAreDetected(int type) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method insertsAreDetected() not yet implemented.");
    }


    public boolean supportsBatchUpdates() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method supportsBatchUpdates() not yet implemented.");
    }


    private ResultSet popResultSet(String query) throws SQLException {
        return FakeDriver.getDriver().popResultSet(query);
    }
}
