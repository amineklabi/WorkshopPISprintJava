/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.workshop.statistiques;

import edu.esprit.pi.dao.StockDAO;
import edu.esprit.pi.entites.Stock;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Amine
 */
public class PieChart {
    DefaultPieDataset dataset;//Dataset qui va contenir les Données
    JFreeChart graphe;        //Graphe


    public JFreeChart construireChart3D() {
        List<Stock> list = new StockDAO().findAll();
        dataset = new DefaultPieDataset();
        //Remplissage Dynamique du dataset
        for (Stock stock : list) {
            dataset.setValue(stock.getLibelle(),stock.getQtiteStock() );
        }
        graphe = ChartFactory.createPieChart3D("Exemple Camemberg 3D", dataset,true ,true ,false);
        return graphe;
    }
    
    public JFreeChart construireChart2D() {
        List<Stock> list = new StockDAO().findAll();
        dataset = new DefaultPieDataset();
        //Remplissage Dynamique du dataset
        for (Stock stock : list) {
            dataset.setValue(stock.getLibelle(),stock.getQtiteStock() );
        }
        graphe = ChartFactory.createPieChart("Exemple Camemberg 2D", dataset,true ,true ,false);
        return graphe;
    }
    
    
    

}
