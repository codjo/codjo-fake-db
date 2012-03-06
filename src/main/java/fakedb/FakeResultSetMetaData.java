/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import net.codjo.test.common.mock.ProxyDelegatorFactory;

class FakeResultSetMetaData {
    private Object[][] matrix = {};


    FakeResultSetMetaData(Object[][] matrix) throws SQLException {
        this.matrix = matrix;
    }


    public ResultSetMetaData getStub() {
        return ProxyDelegatorFactory.getProxy(this, ResultSetMetaData.class);
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
}
