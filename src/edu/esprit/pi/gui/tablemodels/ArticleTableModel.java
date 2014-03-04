/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.gui.tablemodels;

import edu.esprit.pi.dao.ArticleDAO;
import edu.esprit.pi.entites.Article;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Amine
 */
public class ArticleTableModel extends AbstractTableModel {

    List<Article> list;
    String[] entete = {"Client", "Article acheté", "quantité"};

    public ArticleTableModel() {
        list = new ArticleDAO().findAll();
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getClient().getPrenom();
            case 1:
                return list.get(rowIndex).getStock().getLibelle();
            case 2:
                return list.get(rowIndex).getQuantite();
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String getColumnName(int column) {
        return entete[column];
    }

    
}
