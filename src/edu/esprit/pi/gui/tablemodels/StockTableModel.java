/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.gui.tablemodels;

import edu.esprit.pi.dao.StockDAO;
import edu.esprit.pi.entites.Stock;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Amine
 */
public class StockTableModel extends AbstractTableModel {

    List<Stock> listStock;
    String[] entete = {"ID","Libelle Vet", "Type", "Quantite en stock", "Prix unitaire", "Depot"};

    public StockTableModel() {
        listStock = new StockDAO().findAll();
    }

    @Override
    public int getRowCount() {
        return listStock.size();
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                 return listStock.get(rowIndex).getId();
            case 1:
                return listStock.get(rowIndex).getLibelle();
            case 2:
                return listStock.get(rowIndex).getType();
            case 3:
                return listStock.get(rowIndex).getQtiteStock();
            case 4:
                return listStock.get(rowIndex).getPrix();
            case 5:
                return listStock.get(rowIndex).getDepot().getAdresse();
            default:
                 throw new IllegalArgumentException();
        }
    }

    @Override
    public String getColumnName(int column) {
        return entete[column];
    }

    
}
