/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.entites;

/**
 *
 * @author Amine
 */
public class Depot {
    private int id;
    private String adresse;
   

    public Depot(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    
    }

   

    public Depot() {
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

  

    @Override
    public String toString() {
        return "Depot{" + "id=" + id + ", adresse=" + adresse + "}";
    }
    
}
