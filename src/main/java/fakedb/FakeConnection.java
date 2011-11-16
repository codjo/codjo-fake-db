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
/**
 * Overview.
 *
 * @version $Revision: 1.2 $
 */
class FakeConnection implements Connection {
    private boolean autoCommit = true;


    /**
     * Constructor for the FakeConnection object
     */
    FakeConnection() {
        // TODO a faire 
    }


    /**
     * Overview.
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void clearWarnings() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method clearWarnings() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @throws SQLException Description of Exception
     */
    public void close() throws SQLException {
    }


    /**
     * Overview.
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void commit() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method commit() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public Statement createStatement() throws SQLException {
        return newFakeStatement();
    }


    /**
     * Overview.
     *
     * @param resultSetType        Description of Parameter
     * @param resultSetConcurrency Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public Statement createStatement(int resultSetType, int resultSetConcurrency)
          throws SQLException {
        return newFakeStatement();
    }


    /**
     * Gets the AutoCommit attribute of the FakeConnection object
     *
     * @return The AutoCommit value
     *
     * @throws SQLException Description of Exception
     */
    public boolean getAutoCommit() throws SQLException {
        return autoCommit;
    }


    /**
     * Gets the Catalog attribute of the FakeConnection object
     *
     * @return The Catalog value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public String getCatalog() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getCatalog() not yet implemented.");
    }


    /**
     * Gets the MetaData attribute of the FakeConnection object
     *
     * @return The MetaData value
     *
     * @throws SQLException Description of Exception
     */
    public DatabaseMetaData getMetaData() throws SQLException {
        return new FakeDatabaseMetaData();
    }


    /**
     * Gets the TransactionIsolation attribute of the FakeConnection object
     *
     * @return The TransactionIsolation value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public int getTransactionIsolation() throws SQLException {
        throw new java.lang.UnsupportedOperationException(
              "Method getTransactionIsolation() not yet implemented.");
    }


    /**
     * Gets the TypeMap attribute of the FakeConnection object
     *
     * @return The TypeMap value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public java.util.Map<String, Class<?>> getTypeMap() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method getTypeMap() not yet implemented.");
    }


    /**
     * Gets the Warnings attribute of the FakeConnection object
     *
     * @return The Warnings value
     *
     * @throws SQLException Description of Exception
     */
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }


    /**
     * Gets the Closed attribute of the FakeConnection object
     *
     * @return The Closed value
     *
     * @throws SQLException Description of Exception
     */
    public boolean isClosed() throws SQLException {
        return false;
    }


    /**
     * Gets the ReadOnly attribute of the FakeConnection object
     *
     * @return The ReadOnly value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public boolean isReadOnly() throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method isReadOnly() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param sql Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public String nativeSQL(String sql) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method nativeSQL() not yet implemented.");
    }


    /**
     * Overview.
     *
     * @param sql Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public CallableStatement prepareCall(String sql)
          throws SQLException {
        return newFakeStatement(sql);
    }


    /**
     * Overview.
     *
     * @param sql                  Description of Parameter
     * @param resultSetType        Description of Parameter
     * @param resultSetConcurrency Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency)
          throws SQLException {
        return newFakeStatement(sql);
    }


    /**
     * Overview.
     *
     * @param sql Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public PreparedStatement prepareStatement(String sql)
          throws SQLException {
        return newFakeStatement(sql);
    }


    /**
     * Overview.
     *
     * @param sql                  Description of Parameter
     * @param resultSetType        Description of Parameter
     * @param resultSetConcurrency Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
          throws SQLException {
        return newFakeStatement(sql);
    }


    /**
     * Overview.
     *
     * @throws SQLException Description of Exception
     */
    public void rollback() throws SQLException {
    }


    /**
     * Sets the AutoCommit attribute of the FakeConnection object
     *
     * @param autoCommit The new AutoCommit value
     *
     * @throws SQLException Description of Exception
     */
    public void setAutoCommit(boolean autoCommit)
          throws SQLException {
        this.autoCommit = autoCommit;
    }


    /**
     * Sets the Catalog attribute of the FakeConnection object
     *
     * @param catalog The new Catalog value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void setCatalog(String catalog) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setCatalog() not yet implemented.");
    }


    /**
     * Sets the ReadOnly attribute of the FakeConnection object
     *
     * @param readOnly The new ReadOnly value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void setReadOnly(boolean readOnly) throws SQLException {
        throw new java.lang.UnsupportedOperationException("Method setReadOnly() not yet implemented.");
    }


    /**
     * Sets the TransactionIsolation attribute of the FakeConnection object
     *
     * @param level The new TransactionIsolation value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
    public void setTransactionIsolation(int level)
          throws SQLException {
        throw new java.lang.UnsupportedOperationException(
              "Method setTransactionIsolation() not yet implemented.");
    }


    /**
     * Sets the TypeMap attribute of the FakeConnection object
     *
     * @param map The new TypeMap value
     *
     * @throws SQLException Description of Exception
     * @throws java.lang.UnsupportedOperationException
     *                      TODO
     */
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


    public void releaseSavepoint(Savepoint savepoint)
          throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.releaseSavepoint not yet implemented.");
    }


    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
          throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.createStatement not yet implemented.");
    }


    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
                                              int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
                                         int resultSetHoldability) throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareCall not yet implemented.");
    }


    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
          throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
          throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    public PreparedStatement prepareStatement(String sql, String[] columnNames)
          throws SQLException {
        throw new UnsupportedOperationException("FakeConnection.prepareStatement not yet implemented.");
    }


    /**
     * Overview.
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    private FakeStatement newFakeStatement() throws SQLException {
        FakeStatement stmt = new FakeStatement();
        stmt.setConnection(this);
        return stmt;
    }


    /**
     * Overview.
     *
     * @param query Description of Parameter
     *
     * @return Description of the Returned Value
     *
     * @throws SQLException Description of Exception
     */
    private FakeStatement newFakeStatement(String query) throws SQLException {
        FakeStatement stmt = new FakeStatement(query);
        stmt.setConnection(this);
        return stmt;
    }
}
