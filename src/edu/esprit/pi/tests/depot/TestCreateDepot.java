/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.tests.depot;

import edu.esprit.pi.dao.DepotDAO;
import edu.esprit.pi.entites.Depot;

/**
 *
 * @author Amine
 */
public class TestCreateDepot {
    public static void main(String[] args) {
        Depot d = new Depot();
        d.setAdresse("Ariana");
        Depot d2 = new Depot();
        d2.setAdresse("Ben Arous");
        DepotDAO  ddao = new DepotDAO();
        ddao.create(d);
        ddao.create(d2);
        
    }
}
