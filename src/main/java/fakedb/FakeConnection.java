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
import java.sql.Statement;
import net.codjo.test.common.mock.ProxyDelegatorFactory;

@SuppressWarnings({"UnusedParameters"})
class FakeConnection {
    private boolean autoCommit = true;


    FakeConnection() {
    }


    public Connection getStub() {
        return ProxyDelegatorFactory.getProxy(this, Connection.class);
    }


    public void close() throws SQLException {
    }


    public Statement createStatement() throws SQLException {
        return newFakeStatement().getStub();
    }


    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return newFakeStatement().getStub();
    }


    public boolean getAutoCommit() throws SQLException {
        return autoCommit;
    }


    public DatabaseMetaData getMetaData() throws SQLException {
        return new FakeDatabaseMetaData().getStub();
    }


    public SQLWarning getWarnings() throws SQLException {
        return null;
    }


    public boolean isClosed() throws SQLException {
        return false;
    }


    public CallableStatement prepareCall(String sql) throws SQLException {
        return newFakeStatement(sql).getStub();
    }


    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return newFakeStatement(sql).getStub();
    }


    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return newFakeStatement(sql).getStub();
    }


    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return newFakeStatement(sql).getStub();
    }


    public void rollback() throws SQLException {
    }


    public void setAutoCommit(boolean autoCommit) throws SQLException {
        this.autoCommit = autoCommit;
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
