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
public class TestFindStock {
    public static void main(String[] args) {
        Stock s = new StockDAO().find(1);
        System.out.println(s);
    }
}
