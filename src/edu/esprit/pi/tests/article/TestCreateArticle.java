/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.tests.article;

import edu.esprit.pi.dao.ArticleDAO;
import edu.esprit.pi.dao.ClientDAO;
import edu.esprit.pi.dao.StockDAO;
import edu.esprit.pi.entites.Article;
import edu.esprit.pi.entites.Client;
import edu.esprit.pi.entites.Stock;

/**
 *
 * @author Amine
 */
public class TestCreateArticle {
    public static void main(String[] args) {
        Article a = new Article();
        ArticleDAO articleDAO = new ArticleDAO();
        a.setClient(new ClientDAO().find(4887569));
        a.setQuantite(3);
        a.setStock(new StockDAO().find(2));
        articleDAO.create(a);
    }
}
