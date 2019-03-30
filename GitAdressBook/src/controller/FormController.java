package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import dto.AddressDTO;
import exception.AddressValidatorException;
import gitadressbook.InterfaceCarnet;
import model.Address;
import util.Builder;
import util.FormatErrorEnum;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author stag
 */
public class FormController {

    /**
     * Valide le nom
     */
    private void validationNom(String nom) throws AddressValidatorException {
        if (nom != null && nom.trim().length() < 2) {

            // popup réussite
            //    JOptionPane.showMessageDialog("Veuillez saisir un nom.");
            throw new AddressValidatorException("Le nom du contact doit contenir au moins 2 caractères.");
        }
    }

    /**
     * Valide le prenom : si société prénom non obligatoire
     */
    private void validationPrenom(String prenom, String boutonCivilite) throws AddressValidatorException {
        boolean cestunesociete = Boolean.parseBoolean(boutonCivilite);
        if (cestunesociete || prenom != null && prenom.trim().length() < 2) {

            // popup réussite
            //    JOptionPane.showMessageDialog("Veuillez saisir un nom.");
            throw new AddressValidatorException("Le prennom du contact doit contenir au moins 2 caractères.");
        }
    }


    // intNumeroVoie

    /**
     * Valide le prenom : si société prénom non obligatoire
     *
     * @param intNumeroVoie
     */
    private void validationNumeroVoie(String intNumeroVoie) throws AddressValidatorException {
        try {
            Integer.parseInt(intNumeroVoie);
        } catch (NumberFormatException e) {
            throw new AddressValidatorException("Le numéro de la voie doit être numérique.", e);

        }
        //  if (intNumeroVoie != null || int intNumeroVoie entier = Integer.parseInt(intNumeroVoie)) {

        //
        //    JOptionPane.showMessageDialog("Veuillez saisir un nom.");
        // }
    }

    /**
     * Valide l'adresse mail saisie.
     */
    private void validationEmail(String email) throws AddressValidatorException {
        if (email != null && email.trim().length() != 0) {
            if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                throw new AddressValidatorException("Merci de saisir une adresse mail valide.", FormatErrorEnum.EMAIL);
            }
        } else {
            throw new AddressValidatorException("Merci de saisir une adresse mail.");
        }
    }

    public void insertAddress(Address address) {
        try {
            validate(address);
            AddressDTO addressDTO = Builder.builAdress(address);

            // TODO ...
        } catch (AddressValidatorException e) {
            return new CustomResponse(e.getErrorCode());
        }


        String req;
        // prepare notre sql de création

        req = "insert into carnet (`civilite`,`nom`,`prenom`,`appart_bat`,`numero_voie`,`complement_numero_voie`,`libelle_voie`,`code_postal`,`ville`,`telephone_mobile`,`telephone_fixe`,`mail_perso`,`mail_pro`) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = maConnexion.getConnexion().prepareStatement(req);

            // recuperation des champs de l'écran
            String civilite = "M."; // a récupérer
            String nom = txtNom.getText();
            String prenom = txtPrenom.getText();
            String appartbat = txtAppartBat.getText();
            String numeroVoie = intNumeroVoie.getText();
            String complementNumeroVoie = txtComplementNumeroVoie.getText();
            String libelleVoie = txtLibelleVoie.getText();
            String codePostal = intCodePostal.getText();
            String ville = txtVille.getText();
            String telephone_mobile = intTelMobile.getText();
            String telephone_fixe = intTelFixe.getText();
            String mail_perso = txtMailPerso.getText();
            String mail_pro = txtMailPro.getText();

            // preparation des valeurs a transmettre dans ma requette
            ps.setString(1, civilite);
            ps.setString(2, nom);
            ps.setString(3, prenom);
            ps.setString(4, appartbat);
            ps.setString(5, numeroVoie);
            ps.setString(6, complementNumeroVoie);
            ps.setString(7, libelleVoie);
            ps.setString(8, codePostal);
            ps.setString(9, ville);
            ps.setString(10, telephone_mobile);
            ps.setString(11, telephone_fixe);
            ps.setString(12, mail_perso);
            ps.setString(13, mail_pro);

            // execution de ma requetes préparées
            ps.executeUpdate();

            // popup réussite
            JOptionPane.showMessageDialog(this, "Requête executée avec succés.");

            // RAZ de mes champs
            raz_zones();

        } catch (SQLException ex) {
            Logger.getLogger(InterfaceCarnet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validate(Address address) throws AddressValidatorException {
        validationEmail(address.getMailPerso());
        validationEmail(address.getMailPro());
        validationNom(address.getNom());
        validationNumeroVoie(address.getNumeroVoie());
        validationPrenom(address.getPrenom(), address.getCivilite());
    }
}
