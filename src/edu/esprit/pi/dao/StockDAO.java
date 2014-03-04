/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.dao;

import edu.esprit.pi.entites.Stock;
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
public class StockDAO extends IDAO<Stock> {

    @Override
    public Stock find(int id) {
        String sql = "SELECT * FROM T_STOCK WHERE ID=?";
        Stock found = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
            if (resultSet.next()) {
                found = new Stock();
                found.setId(resultSet.getInt("ID"));
                found.setLibelle(resultSet.getString("LIBELLE"));
                found.setType(resultSet.getString("TYPE"));
                found.setQtiteStock(resultSet.getInt("NBRESTOCK"));
                found.setPrix(resultSet.getDouble("PRIX"));
                found.setDepot(new DepotDAO().find(resultSet.getInt("fk_id_depot")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, "find Depot failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
    }

    @Override
    public void create(Stock stock) {
        if (find(stock.getId()) == null) {
            String sql = "INSERT INTO T_STOCK (libelle,type,nbrestock,prix,fk_id_depot) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, stock.getLibelle());
                preparedStatement.setString(2, stock.getType());
                preparedStatement.setInt(3, stock.getQtiteStock());
                preparedStatement.setDouble(4, stock.getPrix());
                preparedStatement.setInt(5, stock.getDepot().getId());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, "insert failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void update(Stock stock) {
      if (find(stock.getId()) != null) { 

            String sql = "UPDATE T_STOCK SET libelle=?,type=?,nbrestock=?,prix=?, fk_id_depot=? WHERE ID=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, stock.getLibelle());
                preparedStatement.setString(2, stock.getType());
                preparedStatement.setInt(3, stock.getQtiteStock());
                preparedStatement.setDouble(4, stock.getPrix());
                preparedStatement.setInt(5, stock.getDepot().getId());
                preparedStatement.setInt(6, stock.getId());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void delete(Stock article) {
    if (find(article.getId()) != null) { 

            String sql = "DELETE FROM T_STOCK WHERE ID=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, article.getId());
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
    public List<Stock> findAll() {
         List<Stock> list = new ArrayList<Stock>();
        String sql = "SELECT * FROM T_STOCK";
        Statement statement = null; 
        ResultSet resultSet = null;       
        try {
            statement = connection.createStatement(); 
            resultSet = statement.executeQuery(sql);  
            System.out.println(sql);
          
            while (resultSet.next()) {
                Stock found = new Stock();
                found.setId(resultSet.getInt("ID"));
                found.setLibelle(resultSet.getString("LIBELLE"));
                found.setType(resultSet.getString("TYPE"));
                found.setQtiteStock(resultSet.getInt("NBRESTOCK"));
                found.setPrix(resultSet.getDouble("PRIX"));
                found.setDepot(new DepotDAO().find(resultSet.getInt("fk_id_depot")));
                list.add(found);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, "find all depots failed", ex);
        } finally {            
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(StockDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }

}
