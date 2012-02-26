/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.CallableStatement;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Map;
import net.codjo.test.common.mock.ConnectionMock;

class FakeConnection extends ConnectionMock {
    private boolean autoCommit = true;


    FakeConnection() {
        // TODO a faire 
    }


    @Override
    public void clearWarnings() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method clearWarnings() not yet implemented.");
    }


    @Override
    public void close() throws SQLException {
    }


    @Override
    public void commit() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method commit() not yet implemented.");
    }


    @Override
    public Statement createStatement() throws SQLException {
        return newFakeStatement().getStub();
    }


    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency)
          throws SQLException {
        return newFakeStatement().getStub();
    }


    @Override
    public boolean getAutoCommit() throws SQLException {
        return autoCommit;
    }


    @Override
    public String getCatalog() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getCatalog() not yet implemented.");
    }


    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return new FakeDatabaseMetaData().getStub();
    }


    @Override
    public int getTransactionIsolation() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTransactionIsolation() not yet implemented.");
    }


    @Override
    public java.util.Map<String, Class<?>> getTypeMap() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTypeMap() not yet implemented.");
    }


    @Override
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }


    @Override
    public boolean isClosed() throws SQLException {
        return false;
    }


    @Override
    public boolean isReadOnly() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isReadOnly() not yet implemented.");
    }


    @Override
    public String nativeSQL(String sql) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method nativeSQL() not yet implemented.");
    }


    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        return newFakeStatement(sql).getStub();
    }


    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency)
          throws SQLException {
        return newFakeStatement(sql).getStub();
    }


    @Override
    public PreparedStatement prepareStatement(String sql)
          throws SQLException {
        return newFakeStatement(sql).getStub();
    }


    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
          throws SQLException {
        return newFakeStatement(sql).getStub();
    }


    @Override
    public void rollback() throws SQLException {
    }


    @Override
    public void setAutoCommit(boolean autoCommit)
          throws SQLException {
        this.autoCommit = autoCommit;
    }


    @Override
    public void setCatalog(String catalog) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setCatalog() not yet implemented.");
    }


    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setReadOnly() not yet implemented.");
    }


    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setTransactionIsolation() not yet implemented.");
    }


    @Override
    public void setTypeMap(Map map) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setTypeMap() not yet implemented.");
    }


    @Override
    public void setHoldability(int holdability) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setTypeMap() not yet implemented.");
    }


    @Override
    public int getHoldability() throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.getHoldability not yet implemented.");
    }


    @Override
    public Savepoint setSavepoint() throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.setSavepoint not yet implemented.");
    }


    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.setSavepoint not yet implemented.");
    }


    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.rollback not yet implemented.");
    }


    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.releaseSavepoint not yet implemented.");
    }


    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.createStatement not yet implemented.");
    }


    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareCall not yet implemented.");
    }


    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    private FakeStatement newFakeStatement() throws SQLException {
        FakeStatement stmt = new FakeStatement();
        stmt.setConnection(this.getStub());
        return stmt;
    }


    private FakeStatement newFakeStatement(String query) throws SQLException {
        FakeStatement stmt = new FakeStatement(query);
        stmt.setConnection(this.getStub());
        return stmt;
    }
}
