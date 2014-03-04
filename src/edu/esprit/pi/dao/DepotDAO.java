/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.dao;

import edu.esprit.pi.entites.Depot;
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
public class DepotDAO extends IDAO<Depot> {

    public Depot find(String adresse) {
        String sql = "SELECT * FROM T_DEPOT WHERE adresse=?";
        Depot found = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, adresse);
            resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Depot(resultSet.getInt("ID"),
                        resultSet.getString("ADRESSE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "find Depot failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
    }
    @Override
    public Depot find(int id) {
        String sql = "SELECT * FROM T_DEPOT WHERE ID=?";
        Depot found = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Depot(resultSet.getInt("ID"),
                        resultSet.getString("ADRESSE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "find Depot failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
    }

    @Override
    public void create(Depot depot) {
        if (find(depot.getId()) == null) {
            String sql = "INSERT INTO T_DEPOT (ADRESSE) VALUES (?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, depot.getAdresse());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "insert failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void update(Depot depot) {
        if (find(depot.getId()) != null) {

            String sql = "UPDATE T_DEPOT SET ADRESSE=? WHERE ID=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, depot.getAdresse());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void delete(Depot depot) {
        if (find(depot.getId()) != null) {

            String sql = "DELETE FROM T_DEPOT WHERE ID=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, depot.getId());
                preparedStatement.executeUpdate();

                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }

        }
    }

    @Override
    public List<Depot> findAll() {
        List<Depot> list = new ArrayList<Depot>();
        String sql = "SELECT * FROM T_DEPOT";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
            while (resultSet.next()) {
                Depot found;
                found = new Depot(resultSet.getInt("ID"),
                        resultSet.getString("ADRESSE"));
                list.add(found);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "find all depots failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DepotDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }

}
