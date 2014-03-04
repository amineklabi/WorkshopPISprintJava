/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amine
 */
public class ScriptHelper {
    private static ScriptHelper instance;

    private ScriptHelper() {
    }

    public static ScriptHelper getInstance() {
        if(instance == null){
            instance = new ScriptHelper();
        }
        return instance;
    }
    public  String getScriptAsString(String fileName) {
        StringBuilder script = new StringBuilder(400);
        File file = new File(fileName);
        FileReader fr = null;
        BufferedReader in = null;
        try {
            fr = new FileReader(file);
            in = new BufferedReader(fr);
            String currentLine = in.readLine();
            while (currentLine != null) {
                script.append(currentLine).append("\n");
                currentLine = in.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return script.toString().trim();
    }

    public  List<String> getBatches(String script) {
        String[] tokens = script.split(";");
        for(int i = 0; i < tokens.length; i++){
            tokens[i]=tokens[i].trim();
        }
        List<String> batches = Arrays.asList(tokens);
        return batches;
    }

    public  void executeScript(String script, Connection connection) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            for (String batch : getBatches(script)) {
                if(!batch.equals("")){
                    statement.addBatch(batch);
                }
                 
            }
            statement.executeBatch();
            System.out.println(script);

        } catch (SQLException e) {
            Logger.getLogger(ScriptHelper.class.getName()).log(Level.SEVERE, "error executing script"  , e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ScriptHelper.class.getName()).log(Level.SEVERE, "freeing resourses failed", ex);
            }
        }
    }
}
