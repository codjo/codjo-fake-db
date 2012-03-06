/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import net.codjo.test.common.mock.ProxyDelegatorFactory;

class FakeDatabaseMetaData {

    FakeDatabaseMetaData() {
    }


    public DatabaseMetaData getStub() {
        return ProxyDelegatorFactory.getProxy(this, DatabaseMetaData.class);
    }


    public ResultSet getTables(String catalog, String schemaPattern,
                               String tableNamePattern, String[] types) throws SQLException {
        String query =
              "FakeDatabaseMetaData.getTables(" + catalog + ", " + schemaPattern + ", "
              + tableNamePattern + ", " + Arrays.asList(types).toString() + ")";
        return popResultSet(query);
    }


    public ResultSet getColumns(String catalog, String schemaPattern,
                                String tableNamePattern, String columnNamePattern) throws SQLException {
        String query =
              "FakeDatabaseMetaData.getColumns(" + catalog + ", " + schemaPattern + ", "
              + tableNamePattern + ", " + columnNamePattern + ")";
        return popResultSet(query);
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


    private ResultSet popResultSet(String query) throws SQLException {
        return FakeDriver.getDriver().popResultSet(query).getStub();
    }
}
