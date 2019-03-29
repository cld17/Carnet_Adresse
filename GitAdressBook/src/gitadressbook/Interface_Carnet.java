package gitadressbook;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stag
 */
public class Interface_Carnet extends javax.swing.JFrame {

    // création de notre instance connexion
    Connexion maConnexion = new Connexion();

    /**
     * Creates new form Interface_Carnet
     */
    public Interface_Carnet() {
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        champNom = new javax.swing.JTextField();
        champPrenom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        champTelMobile = new javax.swing.JTextField();
        champMailPerso = new javax.swing.JTextField();
        btnenr = new javax.swing.JButton();
        btnan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        champAppartBat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        champNumeroVoie = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        champAdresse = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        champCodePostal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        champVille = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        boutonRadioMonsieur = new javax.swing.JRadioButton();
        boutonRadioMadame = new javax.swing.JRadioButton();
        boutonRadioSociete = new javax.swing.JRadioButton();
        champComplementNumeroVoie = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        champRechercheID = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        champRechercheNom = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        champNom.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        champNom.setMinimumSize(new java.awt.Dimension(4, 50));
        champNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champNomActionPerformed(evt);
            }
        });

        jLabel1.setText("Carnet d'adresses");

        jLabel2.setText("Nom");

        jLabel3.setText("Prénom");

        jLabel4.setText("Téléphone mobile");

        jLabel5.setText("Mail perso");

        champTelMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champTelMobileActionPerformed(evt);
            }
        });

        btnenr.setText("Enregistrer");
        btnenr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenrActionPerformed(evt);
            }
        });

        btnan.setText("Annuler");
        btnan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanActionPerformed(evt);
            }
        });

        jLabel7.setText("Appart / Bât");

        jLabel8.setText("Num voie");

        champNumeroVoie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champNumeroVoieActionPerformed(evt);
            }
        });

        jLabel9.setText("Adresse");

        champAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champAdresseActionPerformed(evt);
            }
        });

        jLabel6.setText("Code postal");

        jLabel10.setText("Ville");

        jLabel11.setText("M.");

        jLabel12.setText("Mme");

        jLabel13.setText("Société");

        boutonRadioMonsieur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonRadioMonsieurActionPerformed(evt);
            }
        });

        champComplementNumeroVoie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champComplementNumeroVoieActionPerformed(evt);
            }
        });

        jLabel14.setText("Complément Numéro Voie");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(champMailPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnenr)
                                .addGap(101, 101, 101)
                                .addComponent(btnan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabel1)))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(champComplementNumeroVoie)
                            .addComponent(champTelMobile)
                            .addComponent(champVille)
                            .addComponent(champCodePostal)
                            .addComponent(champAdresse)
                            .addComponent(champNumeroVoie)
                            .addComponent(champNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(champPrenom)
                            .addComponent(champAppartBat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(68, 68, 68)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(boutonRadioMadame))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boutonRadioSociete)
                                            .addComponent(jLabel13)))
                                    .addComponent(boutonRadioMonsieur)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutonRadioMadame, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boutonRadioSociete)
                    .addComponent(boutonRadioMonsieur))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(champNom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(champPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(champAppartBat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(champNumeroVoie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(champComplementNumeroVoie, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(champAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(champCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(champVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(champTelMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(champMailPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnenr)
                    .addComponent(btnan))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setText("Recherche par ID");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        champRechercheID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champRechercheIDActionPerformed(evt);
            }
        });

        jButton4.setText("Recherche par nom");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Supprimer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(champRechercheID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(champRechercheNom, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(champRechercheID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(champRechercheNom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnenrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenrActionPerformed

        String req;
        // prepare notre sql de création

        req = "insert into carnet (`nom`, `prenom`, `telephone_mobile`, `mail_perso`) values (?,?,?,?)";
        try {
            PreparedStatement ps = maConnexion.getConnexion().prepareStatement(req);

            // recuperation des champs de l'écran
            String nom = champNom.getText();
            String prenom = champPrenom.getText();
            String appartbat = champAppartBat.getText();
            String numeroVoie = champNumeroVoie.getText();
            String complementNumeroVoie = champComplementNumeroVoie.getText();
            String adresse = champAdresse.getText();
            String telephone_mobile = champTelMobile.getText();
            String mail_perso = champMailPerso.getText();

            // preparation des valeurs a transmettre dans ma requette
            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, telephone_mobile);
            ps.setString(4, mail_perso);

            // execution de ma requetes préparées
            ps.executeUpdate();

            // popup réussite
            JOptionPane.showMessageDialog(this, "Requête executée avec succés.");

            // RAZ de mes champs
           raz_zones();

        } catch (SQLException ex) {
            Logger.getLogger(Interface_Carnet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnenrActionPerformed
    // boutton annuler
    private void btnanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanActionPerformed
        // RAZ de mes champs
        raz_zones();
    }//GEN-LAST:event_btnanActionPerformed

    // recherche par ID
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String req;
        // préparation de la requete de sélection
        req = "select * from carnet where id = '" + champRechercheID.getText() + "'";
        try {
            PreparedStatement ps = maConnexion.getConnexion().prepareStatement(req);
            //
            ResultSet resultat;
            resultat = ps.executeQuery(req);
            // tant qu'il a des données correspondant à notre sélect-> on recupere les donnée
            while (resultat.next()) {
                champNom.setText(resultat.getString("nom"));     // 
                champPrenom.setText(resultat.getString("prenom"));     // position 3 -> prenom
                champTelMobile.setText(resultat.getString("telephone_mobile"));     // position 4 -> contact
                champMailPerso.setText(resultat.getString("mail_perso"));     // position 5 -> mail

            }
            // TODO exception si enregistrement non trouve 
        } catch (SQLException ex) {
            Logger.getLogger(Interface_Carnet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void champRechercheIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champRechercheIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champRechercheIDActionPerformed
    // supprimer données dans carnet
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String req;
        req = "delete from carnet where id =?";
        try {
            PreparedStatement ps = maConnexion.getConnexion().prepareStatement(req);
            ps.setInt(1, Integer.parseInt(champRechercheID.getText()));
            int count = ps.executeUpdate();
            // affichage popup
            JOptionPane.showMessageDialog(this, count + " Donnée supprimée avec succés");

            // mise à blanc des zones de l'écran
            raz_zones();

        } catch (SQLException ex) {
            Logger.getLogger(Interface_Carnet.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton3ActionPerformed
    // recherche par nom
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String req;
        // préparation de la requete de sélection
        req = "select * from carnet where nom = '" + champRechercheNom.getText() + "'";
        try {
            PreparedStatement ps = maConnexion.getConnexion().prepareStatement(req);
            //
            ResultSet resultat;
            resultat = ps.executeQuery(req);
            // tant qu'il a des données correspondant à notre sélect-> on recupere les donnée
            while (resultat.next()) {
                champNom.setText(resultat.getString("nom"));     // position 2 -> nom
                champPrenom.setText(resultat.getString("prenom"));     // position 3 -> prenom
                champTelMobile.setText(resultat.getString("telephone_mobile"));     // position 4 -> contact
                champMailPerso.setText(resultat.getString("mail_perso"));     // position 5 -> mail

            }
        } catch (SQLException ex) {
            // TODO exception si enregistrement non trouve 
            Logger.getLogger(Interface_Carnet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    // supprimer /nom dans carnet

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String req;
        req = "delete from carnet where nom =?";
        try {
            PreparedStatement ps = maConnexion.getConnexion().prepareStatement(req);
            // TODO ps.setText(1, String(rechnom.getText()));
            int count = ps.executeUpdate();
            JOptionPane.showMessageDialog(this, count + " Donnée supprimer avec succés");

            // mise à blanc des zones de l'écran
            raz_zones();
            
        } catch (SQLException ex) {
            Logger.getLogger(Interface_Carnet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void champTelMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champTelMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champTelMobileActionPerformed

    private void champAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champAdresseActionPerformed

    private void boutonRadioMonsieurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonRadioMonsieurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boutonRadioMonsieurActionPerformed

    private void champNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champNomActionPerformed

    private void champNumeroVoieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champNumeroVoieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champNumeroVoieActionPerformed

    private void champComplementNumeroVoieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_champComplementNumeroVoieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_champComplementNumeroVoieActionPerformed
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

        // on instancie notre objet tableau
        Tableau tableau = new Tableau();

        // on le rend visible
        tableau.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(Interface_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Interface_Carnet().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boutonRadioMadame;
    private javax.swing.JRadioButton boutonRadioMonsieur;
    private javax.swing.JRadioButton boutonRadioSociete;
    private javax.swing.JButton btnan;
    private javax.swing.JButton btnenr;
    private javax.swing.JTextField champAdresse;
    private javax.swing.JTextField champAppartBat;
    private javax.swing.JTextField champCodePostal;
    private javax.swing.JTextField champComplementNumeroVoie;
    private javax.swing.JTextField champMailPerso;
    private javax.swing.JTextField champNom;
    private javax.swing.JTextField champNumeroVoie;
    private javax.swing.JTextField champPrenom;
    private javax.swing.JTextField champRechercheID;
    private javax.swing.JTextField champRechercheNom;
    private javax.swing.JTextField champTelMobile;
    private javax.swing.JTextField champVille;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void raz_zones() {
        
        champRechercheID.setText("");
        champRechercheNom.setText("");
        champNom.setText("");
        champPrenom.setText("");
        champTelMobile.setText("");
        champMailPerso.setText("");
    }
}
