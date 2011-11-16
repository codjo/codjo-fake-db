/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package fakedb;
import java.sql.SQLException;
/**
 * Overview.
 *
 * @author $Author: GONNOT $
 * @version $Revision: 1.2 $
 *
 * @todo En haut
 */
class BadQueryException extends SQLException {
    /**
     * Constructor for the BadQueryException object
     *
     * @param constraint Description of Parameter
     * @param query Description of Parameter
     *
     * @todo Coucouco
     */
    public BadQueryException(String constraint, String query) {
        // @todo ICI
        super("Requete envoye >" + query + "< mais contrainte >" + constraint + "<");
    }
}
