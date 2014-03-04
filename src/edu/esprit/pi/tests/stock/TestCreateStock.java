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
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.tests.stock;

import edu.esprit.pi.dao.StockDAO;
import edu.esprit.pi.dao.DepotDAO;
import edu.esprit.pi.entites.Stock;

/**
 *
 * @author Amine
 */
public class TestCreateStock {
    public static void main(String[] args) {
        StockDAO aO = new StockDAO();
        DepotDAO ddao = new  DepotDAO();
        
        Stock a = new Stock();
        a.setLibelle("Pantalon");
        a.setType("Homme"); 
        a.setQtiteStock(20);
        a.setPrix(21.5);
        a.setDepot(ddao.find(1));
        aO.create(a);
        
    }
    
}
