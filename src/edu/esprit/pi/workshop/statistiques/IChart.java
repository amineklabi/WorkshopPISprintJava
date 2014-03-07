/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.workshop.statistiques;

import org.jfree.chart.JFreeChart;

/**
 *
 * @author Amine
 */
public interface IChart {
    public JFreeChart construireChart2D();
    public JFreeChart construireChart3D();
}
