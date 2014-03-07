/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.gui.internalframes;

import edu.esprit.pi.dao.ArticleDAO;
import edu.esprit.pi.dao.ClientDAO;
import edu.esprit.pi.dao.StockDAO;
import edu.esprit.pi.entites.Article;
import edu.esprit.pi.entites.Client;
import edu.esprit.pi.entites.Stock;
import edu.esprit.pi.gui.tablemodels.ArticleTableModel;
import edu.esprit.pi.gui.tablemodels.ClientTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Amine
 */
public class ClientArticleInternaFrame extends javax.swing.JInternalFrame {

    Client c = new Client();
    Stock s = new Stock();
    Article a = new Article();
    List<Article> articles;
    //Stock s = new 
    ClientDAO clientDAO = new ClientDAO();
    StockDAO stockDAO = new StockDAO();
    ArticleDAO articleDAO = new ArticleDAO();

    /**
     * Creates new form ClientArtcleInternaFrame
     */
    public ClientArticleInternaFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        articlejTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cinjTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomjTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prenomjTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        adressejTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientjTable2 = new javax.swing.JTable();
        ajouterjButton1 = new javax.swing.JButton();
        supprimerjButton2 = new javax.swing.JButton();
        effacerjButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clientjComboBox1 = new javax.swing.JComboBox();
        articlestockjComboBox2 = new javax.swing.JComboBox();
        ajoutArticlejButton8 = new javax.swing.JButton();
        libellejLabel7 = new javax.swing.JLabel();
        typeVetjLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomClientjLabel8 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        quantitejSpinner1 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        quitterjButton5 = new javax.swing.JButton();
        supprimerjButton6 = new javax.swing.JButton();
        raffraichirjButton7 = new javax.swing.JButton();

        setTitle("Gérer Achet Client ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        articlejTable1.setModel(new ArticleTableModel());
        jScrollPane1.setViewportView(articlejTable1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajouter Client"));

        jLabel1.setText("CIN :");

        jLabel2.setText("Nom  :");

        jLabel3.setText("Prenom  :");

        jLabel4.setText("Adresse  :");

        clientjTable2.setModel(new ClientTableModel());
        jScrollPane2.setViewportView(clientjTable2);

        ajouterjButton1.setText("Ajouter");
        ajouterjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterjButton1ActionPerformed(evt);
            }
        });

        supprimerjButton2.setText("Supprimer");

        effacerjButton4.setText("Effacer");
        effacerjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effacerjButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cinjTextField1)
                                    .addComponent(nomjTextField2)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adressejTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(prenomjTextField3)))))))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 142, Short.MAX_VALUE)
                .addComponent(effacerjButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supprimerjButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajouterjButton1))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prenomjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajouterjButton1)
                    .addComponent(supprimerjButton2)
                    .addComponent(effacerjButton4)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Achat Article"));

        jLabel5.setText("Client : ");

        jLabel6.setText("Aricle Stock :");

        clientjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientjComboBox1ActionPerformed(evt);
            }
        });

        articlestockjComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articlestockjComboBox2ActionPerformed(evt);
            }
        });

        ajoutArticlejButton8.setText("Ajouter Achat");
        ajoutArticlejButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutArticlejButton8ActionPerformed(evt);
            }
        });

        libellejLabel7.setText("  ");

        typeVetjLabel8.setText("  ");

        jLabel7.setText("pour");

        nomClientjLabel8.setText(" ");

        jLabel8.setText("Quantité :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(quantitejSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(ajoutArticlejButton8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(articlestockjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(libellejLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeVetjLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(clientjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(nomClientjLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nomClientjLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeVetjLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(articlestockjComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(libellejLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajoutArticlejButton8)
                    .addComponent(jLabel8)
                    .addComponent(quantitejSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        quitterjButton5.setText("Quitter");
        quitterjButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterjButton5ActionPerformed(evt);
            }
        });

        supprimerjButton6.setText("Supprimer");
        supprimerjButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerjButton6ActionPerformed(evt);
            }
        });

        raffraichirjButton7.setText("Raffraichir");
        raffraichirjButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raffraichirjButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(raffraichirjButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supprimerjButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitterjButton5)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitterjButton5)
                    .addComponent(supprimerjButton6)
                    .addComponent(raffraichirjButton7))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitterjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterjButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_quitterjButton5ActionPerformed

    private void ajouterjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterjButton1ActionPerformed
        c.setCin(Integer.parseInt(cinjTextField1.getText()));
        c.setNom(nomjTextField2.getText());
        c.setPrenom(prenomjTextField3.getText());
        c.setAdresse(adressejTextField4.getText());
        clientDAO.create(c);
    }//GEN-LAST:event_ajouterjButton1ActionPerformed

    private void effacerjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_effacerjButton4ActionPerformed
        cinjTextField1.setText("");
        nomjTextField2.setText("");
        prenomjTextField3.setText("");
        adressejTextField4.setText("");
    }//GEN-LAST:event_effacerjButton4ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        List<Client> l = clientDAO.findAll();
        for (Client client : l) {
            clientjComboBox1.addItem(client.getCin());
        }
        List<Stock> s = stockDAO.findAll();
        for (Stock stock : s) {
            articlestockjComboBox2.addItem(stock.getId());
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void articlestockjComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articlestockjComboBox2ActionPerformed
        s = stockDAO.find(Integer.parseInt(articlestockjComboBox2.getSelectedItem().toString()));
        libellejLabel7.setText(s.getLibelle());
        typeVetjLabel8.setText(s.getType());
    }//GEN-LAST:event_articlestockjComboBox2ActionPerformed

    private void clientjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientjComboBox1ActionPerformed
        c = clientDAO.find(Integer.parseInt(clientjComboBox1.getSelectedItem().toString()));
        nomClientjLabel8.setText(c.getPrenom() + " " + c.getNom());
    }//GEN-LAST:event_clientjComboBox1ActionPerformed

    private void ajoutArticlejButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutArticlejButton8ActionPerformed
        c = clientDAO.find(Integer.parseInt(clientjComboBox1.getSelectedItem().toString()));
        s = stockDAO.find(Integer.parseInt(articlestockjComboBox2.getSelectedItem().toString()));
        a.setClient(c);
        a.setStock(s);
        int qtite = Integer.parseInt(quantitejSpinner1.getValue().toString());
        a.setQuantite(qtite);
        if (qtite > s.getQtiteStock()) {
            JOptionPane.showMessageDialog(this, "La quatité qui reste est insuffisante  :" + s.getQtiteStock() + " unités");
        } else {
            s.setQtiteStock(s.getQtiteStock() - qtite);
            stockDAO.update(s);
            articleDAO.create(a);
            JOptionPane.showMessageDialog(this, "Achat effectué avec succès .");
        }
    }//GEN-LAST:event_ajoutArticlejButton8ActionPerformed

    private void raffraichirjButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raffraichirjButton7ActionPerformed
        ArticleTableModel atm = new ArticleTableModel();
        articlejTable1.setModel(atm);
    }//GEN-LAST:event_raffraichirjButton7ActionPerformed

    private void supprimerjButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerjButton6ActionPerformed
        int[] selected = articlejTable1.getSelectedRows();
         System.out.println("selected rows " + selected.length);
        //articles = new ArrayList<>();
        List<Article> toRemove = new ArrayList<Article>(selected.length);
        System.out.println("Taille de la liste d'articles to remove : "+toRemove.size());
        for (int i = 0; i < selected.length; i++) {
            Article a = articles.get(articlejTable1.convertRowIndexToModel(selected[i]));
            System.out.println(a);
            toRemove.add(a);
        }
        for (Article a : toRemove) {
            articleDAO.delete(a);
        }
        articles.removeAll(toRemove);
    }//GEN-LAST:event_supprimerjButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressejTextField4;
    private javax.swing.JButton ajoutArticlejButton8;
    private javax.swing.JButton ajouterjButton1;
    private javax.swing.JTable articlejTable1;
    private javax.swing.JComboBox articlestockjComboBox2;
    private javax.swing.JTextField cinjTextField1;
    private javax.swing.JComboBox clientjComboBox1;
    private javax.swing.JTable clientjTable2;
    private javax.swing.JButton effacerjButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel libellejLabel7;
    private javax.swing.JLabel nomClientjLabel8;
    private javax.swing.JTextField nomjTextField2;
    private javax.swing.JTextField prenomjTextField3;
    private javax.swing.JSpinner quantitejSpinner1;
    private javax.swing.JButton quitterjButton5;
    private javax.swing.JButton raffraichirjButton7;
    private javax.swing.JButton supprimerjButton2;
    private javax.swing.JButton supprimerjButton6;
    private javax.swing.JLabel typeVetjLabel8;
    // End of variables declaration//GEN-END:variables
}
