/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.tests.client;

import edu.esprit.pi.dao.ClientDAO;
import edu.esprit.pi.entites.Client;

/**
 *
 * @author Amine
 */
public class TestFindClient {
    public static void main(String[] args) {
        Client c = new ClientDAO().find("4887569");
        System.out.println(c);
    }
}
