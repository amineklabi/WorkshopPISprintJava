/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.dao;

import edu.esprit.pi.entites.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amine
 */
public class ClientDAO extends IDAO<Client> {

    public Client find(String cin) {
        String sql = "SELECT * FROM T_Client WHERE CIN=?";
        Client found = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cin);
            resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Client();
                found.setCin(resultSet.getInt("CIN"));
                found.setNom(resultSet.getString("NOM"));
                found.setPrenom(resultSet.getString("PRENOM"));
                found.setAdresse(resultSet.getString("ADRESSE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "find Depot failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
    }
    @Override
    public Client find(int cin) {
       String sql = "SELECT * FROM T_Client WHERE CIN=?";
        Client found = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, cin);
            resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Client();
                found.setCin(resultSet.getInt("CIN"));
                found.setNom(resultSet.getString("NOM"));
                found.setPrenom(resultSet.getString("PRENOM"));
                found.setAdresse(resultSet.getString("ADRESSE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "find Depot failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
    }

    @Override
    public void update(Client client) {
        if (find(client.getCin()) != null) {

            String sql = "UPDATE T_CLIENT SET NOM=?,PRENOM=?,ADDRESS=? WHERE CIN=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, client.getNom());
                preparedStatement.setString(2, client.getPrenom());
                preparedStatement.setString(3, client.getAdresse());
                preparedStatement.setInt(4, client.getCin());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void delete(Client client) {
        if (find(client.getCin()) != null) {
            String sql = "DELETE FROM T_CLIENT WHERE CIN=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, client.getCin());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public List<Client> findAll() {
        List<Client> list = new ArrayList<Client>();
        String sql = "SELECT * FROM T_CLIENT";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            while (resultSet.next()) {
                Client client = new Client();
                client.setCin(resultSet.getInt("CIN"));
                client.setNom(resultSet.getString("NOM"));
                client.setPrenom(resultSet.getString("PRENOM"));
                client.setAdresse(resultSet.getString("ADRESSE"));
                list.add(client);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "find all depots failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }

    @Override
    public void create(Client client) {
        if (find(client.getCin()) == null) {
            String sql = "INSERT INTO T_CLIENT (cin,nom,prenom,adresse) VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, client.getCin());
                preparedStatement.setString(2, client.getNom());
                preparedStatement.setString(3, client.getPrenom());
                preparedStatement.setString(4, client.getAdresse());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "insert failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }
}
