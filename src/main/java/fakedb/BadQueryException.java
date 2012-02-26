/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.SQLException;

class BadQueryException extends SQLException {
    BadQueryException(String constraint, String query) {
        super("Requete envoye >" + query + "< mais contrainte >" + constraint + "<");
    }
}
