/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.esprit.pi.gui.tablemodels;

import edu.esprit.pi.dao.ClientDAO;
import edu.esprit.pi.entites.Client;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Amine
 */
public class ClientTableModel extends AbstractTableModel{

    List<Client> listClients;
    String[] entete = {"CIN","Nom","Prenom","Adresse"};

    public ClientTableModel() {
        listClients = new ClientDAO().findAll();
    }
    
    
    @Override
    public int getRowCount() {
        return listClients.size();
    }

    @Override
    public int getColumnCount() {
        return entete.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex) {
            case 0:
                return listClients.get(rowIndex).getCin();
            case 1:
                return listClients.get(rowIndex).getNom();
            case 2:
                return listClients.get(rowIndex).getPrenom();
            case 3:
                return listClients.get(rowIndex).getAdresse();
            default:
                 throw new IllegalArgumentException();
       }
    }

    @Override
    public String getColumnName(int column) {
        return entete[column];
    }
    
}
