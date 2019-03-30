package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import javax.swing.JOptionPane;

/**
 *
 * @author stag
 */
public class ControleFormulaire {

    /**
     * Valide le nom
     */
    private void validationNom(String nom) throws Exception {
        if (nom != null && nom.trim().length() < 2) {

            // popup réussite
            //    JOptionPane.showMessageDialog("Veuillez saisir un nom.");
            throw new Exception("Le nom du contact doit contenir au moins 2 caractères.");
        }
    }

    /**
     * Valide le prenom : si société prénom non obligatoire
     */
    private void validationPrenom(String prenom, boolean boutonCiviliteSociete) throws Exception {
        if (boutonCiviliteSociete != true && prenom != null && prenom.trim().length() < 2) {

            // popup réussite
            //    JOptionPane.showMessageDialog("Veuillez saisir un nom.");
            throw new Exception("Le prennom du contact doit contenir au moins 2 caractères.");
        }
    }

    
    // intNumeroVoie
    
      /**
     * Valide le prenom : si société prénom non obligatoire
     */
    private void validationNumeroVoie(Integer intNumeroVoie) throws Exception {
      //  if (intNumeroVoie != null || int intNumeroVoie entier = Integer.parseInt(intNumeroVoie)) {

            //  
            //    JOptionPane.showMessageDialog("Veuillez saisir un nom.");
            throw new Exception("Le numéro de la voie doit être numérique.");
       // }
    }
    /**
     * Valide l'adresse mail saisie.
     */
    private void validationEmail(String email) throws Exception {
        if (email != null && email.trim().length() != 0) {
            if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                throw new Exception("Merci de saisir une adresse mail valide.");
            }
        } else {
            throw new Exception("Merci de saisir une adresse mail.");
        }
    }

}
