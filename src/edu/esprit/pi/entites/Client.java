/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.entites;

import java.util.List;

/**
 *
 * @author Amine
 */
public class Client {
    private int cin;
    private String nom;
    private String prenom;
    private String adresse;

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

 
    @Override
    public String toString() {
        return "Client{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "}";
    }
    
}
