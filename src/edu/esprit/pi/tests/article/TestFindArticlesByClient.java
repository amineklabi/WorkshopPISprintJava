/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.tests.article;

import edu.esprit.pi.dao.ArticleDAO;
import edu.esprit.pi.dao.ClientDAO;
import edu.esprit.pi.entites.Article;
import edu.esprit.pi.entites.Client;
import java.util.List;

/**
 *
 * @author Amine
 */
public class TestFindArticlesByClient {
    public static void main(String[] args) {
        Client c = new ClientDAO().find(7126390);
        List<Article> l = new ArticleDAO().findArticlesByClient(c);
        System.out.println(l);
    }
}
