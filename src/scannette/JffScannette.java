/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scannette;

import accesBDD.ArticleMySQL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import scannette.classeMetier.Article;
import scannette.classeMetier.Scannette;

/**
 *
 * @author solen
 */
public class JffScannette extends javax.swing.JFrame {

    private Scannette laScannette;

    /**
     * Creates new form jffScannette
     */
    public JffScannette() {
        initComponents();
    }

    public JffScannette(Scannette scan) {
        initComponents();
        laScannette = scan;
        jLBienvenue.setText("Bienvenue " + laScannette.getIdentiteClient() + " dans votre magasin");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtSupprimer = new javax.swing.JButton();
        jBtTerminer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLBienvenue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFNo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePanier = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTFMt = new javax.swing.JTextField();
        jTFNbArticle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images/quitter.png"))); // NOI18N
        jBtSupprimer.setEnabled(false);
        jBtSupprimer.setLabel("Supprimer");
        jBtSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSupprimerActionPerformed(evt);
            }
        });
        getContentPane().add(jBtSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 120, -1));

        jBtTerminer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images/valider.png"))); // NOI18N
        jBtTerminer.setText("Achats terminés");
        jBtTerminer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtTerminerActionPerformed(evt);
            }
        });
        getContentPane().add(jBtTerminer, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 160, -1));

        jLabel2.setText("Montant à payer: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 278, 110, 30));

        jLabel3.setText("Nb articles:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 70, 30));
        jLabel3.getAccessibleContext().setAccessibleName("Nb articles");

        jLBienvenue.setText("Bienvenue dans votre magasin MarketPlus");
        getContentPane().add(jLBienvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 255, -1));

        jLabel5.setText("N° de l'article à ajouter: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, 30));

        jTFNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNoActionPerformed(evt);
            }
        });
        getContentPane().add(jTFNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 100, 30));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        jTablePanier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTablePanier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numéro", "Désignation", "Prix"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePanier.setGridColor(new java.awt.Color(204, 204, 204));
        jTablePanier.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTablePanier.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTablePanier.setShowGrid(true);
        jScrollPane2.setViewportView(jTablePanier);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 360, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/images/fondClair.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 419, -1));

        jTFMt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFMtActionPerformed(evt);
            }
        });
        getContentPane().add(jTFMt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 100, 30));
        getContentPane().add(jTFNbArticle, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 100, 30));

        setBounds(0, 0, 714, 418);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSupprimerActionPerformed
        int noLig = jTablePanier.getSelectedRow();
        if (noLig < 0) {
            JOptionPane.showMessageDialog(null, "Sélectionner l'article à supprimer", "Erreur", JOptionPane.ERROR_MESSAGE);
        } else {
            jTablePanier.getValueAt(noLig, 0);
            int reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment supprimer l'article n° " + jTablePanier.getValueAt(noLig, 0));

            if (reponse == 0) {

                Article unArticle = laScannette.getLePanier().get(noLig);

                laScannette.oterDuPanier(unArticle);
                ((DefaultTableModel) jTablePanier.getModel()).removeRow(noLig);

                laScannette.calculetMtPanier();
                String mt = String.format("%,.2f", laScannette.calculetMtPanier());
                jTFMt.setText(mt);
                
                jTFNbArticle.setText(Integer.toString(laScannette.getLePanier().size()));
                int nbLigne = laScannette.getLePanier().size();
                ((DefaultTableModel) jTablePanier.getModel()).setRowCount(nbLigne);

                if (nbLigne == 0) {
                    jBtSupprimer.setEnabled(!rootPaneCheckingEnabled);

                }
            }
        }

    }//GEN-LAST:event_jBtSupprimerActionPerformed

    private void jTFNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNoActionPerformed
        //Récupération du no saisi
        String noArticleS = jTFNo.getText();
        int noArticle = Integer.parseInt(noArticleS);
// Accès BDD
        ArticleMySQL am = new ArticleMySQL();
        Article unArticle = am.readArticle(noArticle);
        if (unArticle != null) {
//            JOptionPane.showMessageDialog(null, "L'article trouvé : "
//                    + unArticle.getDesignation());
            laScannette.ajouterAuPanier(unArticle);
            jTFNbArticle.setText(Integer.toString(laScannette.getLePanier().size()));
            jTFNo.setText("");
            jBtSupprimer.setEnabled(rootPaneCheckingEnabled);
            laScannette.calculetMtPanier();
            String mt = String.format("%,.2f", laScannette.calculetMtPanier());
            jTFMt.setText(mt);
            int nbLigne = laScannette.getLePanier().size();
            ((DefaultTableModel) jTablePanier.getModel()).setRowCount(nbLigne);
            jTablePanier.getModel().setValueAt(noArticle, nbLigne - 1, 0);
            jTablePanier.getModel().setValueAt(unArticle.getDesignation(), nbLigne - 1, 1);
            jTablePanier.getModel().setValueAt(unArticle.getPrixVente(), nbLigne - 1, 2);

        } else {
            JOptionPane.showMessageDialog(null, "L'article no "
                    + noArticleS + " n'existe pas");

        }
    }//GEN-LAST:event_jTFNoActionPerformed

    private void jTFMtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFMtActionPerformed


    }//GEN-LAST:event_jTFMtActionPerformed

    private void jBtTerminerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtTerminerActionPerformed
        if (!laScannette.getLePanier().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Veuillez insérer votre carte dans le lecteur, \n et suivre les indications", "Paiement", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Merci de votre, n'oubliez pas votre ticket. \n A bientôt!", "Au revoir", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Le panier est vide");
        }
    }//GEN-LAST:event_jBtTerminerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JffScannette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JffScannette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JffScannette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JffScannette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JffScannette().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtSupprimer;
    private javax.swing.JButton jBtTerminer;
    private javax.swing.JLabel jLBienvenue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFMt;
    private javax.swing.JTextField jTFNbArticle;
    private javax.swing.JTextField jTFNo;
    private javax.swing.JTable jTablePanier;
    // End of variables declaration//GEN-END:variables
}
