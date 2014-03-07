/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.workshop.statistiques;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Amine
 */
public class BarChart implements IChart {

    DefaultCategoryDataset dataset;
    JFreeChart graphe;

    private CategoryDataset createDataset() {
        dataset = new DefaultCategoryDataset();
        dataset.addValue(100, "Electronique", "");
        dataset.addValue(74, " Medical", "");
        dataset.addValue(52, "Culturel", "");
        dataset.addValue(5, "Services", "");
        return dataset;

    }


    @Override
    public JFreeChart construireChart2D() {
        graphe = ChartFactory.createBarChart(
                "Pourcentage revenue par Département",
                "Departement",
                "Pourcentage du revenu",
                createDataset(),
                PlotOrientation.VERTICAL,
                true,
                true,
                true);
        final CategoryPlot plot = graphe.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 2.0));
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true);
        return graphe;
    }

    @Override
    public JFreeChart construireChart3D() {
        graphe = ChartFactory.createBarChart3D(
                "Pourcentage revenue par Département",
                "",
                "Pourcentage du revenu",
                createDataset(),
                PlotOrientation.HORIZONTAL,
                true,
                true,
                true);
        final CategoryPlot plot = graphe.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 2.0));
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true);
        return graphe;
    }

}
