/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.dao;

import edu.esprit.pi.entites.Article;
import edu.esprit.pi.entites.Client;
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
public class ArticleDAO extends IDAO<Article> {

    public List<Article> findArticlesByClient(Client client) {
        String sql = "SELECT a.* FROM T_ARTICLE a "
                + "INNER JOIN T_CLIENT b ON a.fk_id_client=b.cin "
                + "INNER JOIN T_STOCK c ON a.fk_id_stock=c.id "
                + "WHERE fk_id_client=?";
        List<Article> list = new ArrayList<Article>();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, client.getCin());
            resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
            while (resultSet.next()) {
                Article found = new Article();
                found.setId(resultSet.getInt("ID"));
                found.setQuantite(resultSet.getInt("quantite"));
                found.setClient(new ClientDAO().find(resultSet.getInt("FK_ID_CLIENT")));
                System.out.println(resultSet.getInt("FK_ID_STOCK"));
                found.setStock(new StockDAO().find(resultSet.getInt("FK_ID_STOCK")));
                list.add(found);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "find Article failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }

    @Override
    public void create(Article article) {
        if (find(article.getId()) == null) {
            String sql = "INSERT INTO T_ STOCK(quatite,fk_id_client,fk_id_stock) VALUES (?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, article.getQuantite());
                preparedStatement.setInt(2, article.getClient().getCin());
                preparedStatement.setInt(3, article.getStock().getId());
                preparedStatement.executeUpdate();

                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "insert failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void update(Article article) {
        if (find(article.getId()) != null) {

            String sql = "UPDATE T_STOCK SET quanite=?,fk_id_client=?,fk_id_stock=? WHERE ID=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, article.getQuantite());
                preparedStatement.setInt(2, article.getClient().getCin());
                preparedStatement.setInt(3, article.getStock().getId());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "update failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }
        }
    }

    @Override
    public void delete(Article article) {
        if (find(article.getId()) != null) {
            String sql = "DELETE FROM T_STOCK WHERE ID=?";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, article.getId());
                preparedStatement.executeUpdate();
                System.out.println(sql);
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "delete failed", ex);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
                }
            }

        }
    }

    @Override
    public List<Article> findAll() {
        List<Article> list = new ArrayList<Article>();
        String sql = "SELECT * FROM T_ARTICLE";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);

            while (resultSet.next()) {
                Article found = new Article();
                found.setId(resultSet.getInt("ID"));
                found.setQuantite(resultSet.getInt("quantite"));
                found.setClient(new ClientDAO().find(resultSet.getInt("FK_ID_CLIENT")));
                found.setStock(new StockDAO().find(resultSet.getInt("FK_ID_STOCK")));
                list.add(found);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "find all depots failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return list;
    }

    @Override
    public Article find(int id) {
        String sql = "SELECT a.* FROM T_ARTICLE a "
                + "INNER JOIN T_CLIENT b ON a.fk_id_client=b.cin "
                + "INNER JOIN T_STOCK c ON a.fk_id_stock=c.id "
                + "WHERE fk_id_client=?";
        Article found = new Article();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            System.out.println(sql);
            while (resultSet.next()) {
                found.setId(resultSet.getInt("ID"));
                found.setQuantite(resultSet.getInt("quantite"));
                found.setClient(new ClientDAO().find(resultSet.getInt("FK_ID_CLIENT")));
                System.out.println(resultSet.getInt("FK_ID_STOCK"));
                found.setStock(new StockDAO().find(resultSet.getInt("FK_ID_STOCK")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "find Article failed", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ArticleDAO.class.getName()).log(Level.SEVERE, "free resourses failed", ex);
            }
        }
        return found;
    }

}
