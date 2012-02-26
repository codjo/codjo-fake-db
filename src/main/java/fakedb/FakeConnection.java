/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Map;

class FakeConnection implements Connection {
    private boolean autoCommit = true;


    FakeConnection() {
        // TODO a faire 
    }


    public void clearWarnings() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method clearWarnings() not yet implemented.");
    }


    public void close() throws SQLException {
    }


    public void commit() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method commit() not yet implemented.");
    }


    public Statement createStatement() throws SQLException {
        return newFakeStatement();
    }


    public Statement createStatement(int resultSetType, int resultSetConcurrency)
          throws SQLException {
        return newFakeStatement();
    }


    public boolean getAutoCommit() throws SQLException {
        return autoCommit;
    }


    public String getCatalog() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getCatalog() not yet implemented.");
    }


    public DatabaseMetaData getMetaData() throws SQLException {
        return new FakeDatabaseMetaData();
    }


    public int getTransactionIsolation() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTransactionIsolation() not yet implemented.");
    }


    public java.util.Map<String, Class<?>> getTypeMap() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTypeMap() not yet implemented.");
    }


    public SQLWarning getWarnings() throws SQLException {
        return null;
    }


    public boolean isClosed() throws SQLException {
        return false;
    }


    public boolean isReadOnly() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isReadOnly() not yet implemented.");
    }


    public String nativeSQL(String sql) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method nativeSQL() not yet implemented.");
    }


    public CallableStatement prepareCall(String sql)
          throws SQLException {
        return newFakeStatement(sql);
    }


    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency)
          throws SQLException {
        return newFakeStatement(sql);
    }


    public PreparedStatement prepareStatement(String sql)
          throws SQLException {
        return newFakeStatement(sql);
    }


    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
          throws SQLException {
        return newFakeStatement(sql);
    }


    public void rollback() throws SQLException {
    }


    public void setAutoCommit(boolean autoCommit)
          throws SQLException {
        this.autoCommit = autoCommit;
    }


    public void setCatalog(String catalog) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setCatalog() not yet implemented.");
    }


    public void setReadOnly(boolean readOnly) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setReadOnly() not yet implemented.");
    }


    public void setTransactionIsolation(int level) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setTransactionIsolation() not yet implemented.");
    }


    public void setTypeMap(Map map) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setTypeMap() not yet implemented.");
    }


    public void setHoldability(int holdability) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setTypeMap() not yet implemented.");
    }


    public int getHoldability() throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.getHoldability not yet implemented.");
    }


    public Savepoint setSavepoint() throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.setSavepoint not yet implemented.");
    }


    public Savepoint setSavepoint(String name) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.setSavepoint not yet implemented.");
    }


    public void rollback(Savepoint savepoint) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.rollback not yet implemented.");
    }


    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.releaseSavepoint not yet implemented.");
    }


    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.createStatement not yet implemented.");
    }


    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareCall not yet implemented.");
    }


    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    private FakeStatement newFakeStatement() throws SQLException {
        FakeStatement stmt = new FakeStatement();
        stmt.setConnection(this);
        return stmt;
    }


    private FakeStatement newFakeStatement(String query) throws SQLException {
        FakeStatement stmt = new FakeStatement(query);
        stmt.setConnection(this);
        return stmt;
    }
}
