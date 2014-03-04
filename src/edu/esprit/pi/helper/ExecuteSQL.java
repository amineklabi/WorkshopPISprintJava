/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.helper;

import edu.esprit.pi.technique.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author Amine
 */
public class ExecuteSQL {
    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getInstance().getConnection();
        String script = ScriptHelper.getInstance().getScriptAsString("./scripts/scriptCreationStockDepotDB.sql");
        ScriptHelper.getInstance().executeScript(script, connection);
    }
}
