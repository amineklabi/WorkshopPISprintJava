/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.tests.stock;

import edu.esprit.pi.dao.StockDAO;
import edu.esprit.pi.entites.Stock;

/**
 *
 * @author Amine
 */
public class TestDeleteStock {
    public static void main(String[] args) {
        
        Stock s = new Stock();
        s.setId(5);
        StockDAO stockDAO = new StockDAO();
        stockDAO.delete(s);
    }
}
