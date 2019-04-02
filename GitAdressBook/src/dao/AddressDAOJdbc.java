package dao;

import dto.AddressDTO;
import exception.AddressException;
import util.DBUtil;
import vue.InterfaceCarnet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddressDAOJdbc implements AddressDAO {

    @Override
    public Object insertAddress(AddressDTO addressDTO) throws AddressException {
        String req;
        // prepare notre sql de création

        req = "insert into carnet (`civilite`,`nom`,`prenom`,`appart_bat`,`numero_voie`,`complement_numero_voie`,`libelle_voie`,`code_postal`,`ville`,`telephone_mobile`,`telephone_fixe`,`mail_perso`,`mail_pro`) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            // ouverture connexion            
            Connection connexion = DBUtil.connexion();

            // préparation requete
            PreparedStatement ps = connexion.prepareStatement(req);

            // preparation des valeurs a transmettre dans ma requette
            ps.setString(1, addressDTO.getCivilite());
            ps.setString(2, addressDTO.getNom());
            ps.setString(3, addressDTO.getPrenom());
            ps.setString(4, addressDTO.getAppartbat());
            ps.setString(5, addressDTO.getNumeroVoie());
            ps.setString(6, addressDTO.getComplementNumeroVoie());
            ps.setString(7, addressDTO.getLibelleVoie());
            ps.setString(8, addressDTO.getCodePostal());
            ps.setString(9, addressDTO.getVille());
            ps.setString(10, addressDTO.getTelephoneMobile());
            ps.setString(11, addressDTO.getTelephoneFixe());
            ps.setString(12, addressDTO.getMailPerso());
            ps.setString(13, addressDTO.getMailPro());

            // execution de ma requetes préparées
            int res = ps.executeUpdate();

//            if(res == 1)
            DBUtil.deconnexion();

        } catch (SQLException ex) {
            throw new AddressException(ex);
        }
        return null;
    }

    @Override
    public List<AddressDTO> retrieveAddress(AddressDTO addressDTO) throws AddressException {
        String req;
        // préparation de la requete de sélection
        // construire ma requete if nom rempli etc.....
        // TODO

        String select = "SELECT * FROM carnet ";
        String where = "WHERE 1 ";

        if (addressDTO.getId() != null) {
            where += "AND id = '" + addressDTO.getId() + "' ";

        }

        if (addressDTO.getNom() != null) {
            where += "AND nom LIKE '" + addressDTO.getNom() + "%' ";

        }
        if (addressDTO.getLibelleVoie() != null) {

            where += "AND libelle_voie LIKE ('%" + addressDTO.getLibelleVoie() + "%') ";

        }
        if (addressDTO.getCodePostal() != null) {

            where += "AND code_postal LIKE ('%" + addressDTO.getCodePostal() + "%') ";

        }
        if (addressDTO.getVille() != null) {

            where += "AND ville LIKE ('%" + addressDTO.getVille() + "%') ";
        }

        // TODO ...
        String order = "ORDER BY `nom`";

        req = select + where + order;
        System.out.println(req);

        // création liste pour récuperer enregistrement base
        List<AddressDTO> addressDTOList = new ArrayList();

        try {
            // ouverture connexion            
            Connection connexion = DBUtil.connexion();

            PreparedStatement ps = connexion.prepareStatement(req);
            // preparation des valeurs a transmettre dans ma requette

            //ps.setString(2, addressDTO.getNom());
            //ps.setString(7, addressDTO.getLibelleVoie());
            //ps.setInt(8, addressDTO.getCodePostal());
            //ps.setString(9, addressDTO.getVille());
            //
            ResultSet resultat;
            resultat = ps.executeQuery(req);

            // tant qu'il a des données correspondant à notre sélect-> on recupere les donnée dans la liste 
            AddressDTO addressResult;
            while (resultat.next()) {
                addressResult = new AddressDTO();

                addressResult.setId(Integer.parseInt(resultat.getString("Id")));
                addressResult.setCivilite(resultat.getString("civilite"));
                addressResult.setNom(resultat.getString("nom"));//  
                addressResult.setPrenom(resultat.getString("prenom"));
                addressResult.setAppartbat(resultat.getString("appart_bat"));
                addressResult.setNumeroVoie(resultat.getString("numero_voie"));
                addressResult.setComplementNumeroVoie(resultat.getString("complement_numero_voie"));
                addressResult.setLibelleVoie(resultat.getString("libelle_voie"));
                addressResult.setCodePostal(resultat.getString("code_postal"));
                addressResult.setVille(resultat.getString("ville"));
                addressResult.setTelephoneMobile(resultat.getString("telephone_mobile"));
                addressResult.setTelephoneFixe(resultat.getString("telephone_fixe"));
                addressResult.setMailPerso(resultat.getString("mail_perso"));
                addressResult.setMailPro(resultat.getString("mail_pro"));

                // je remplis ma collection avec la méthode add.
                addressDTOList.add(addressResult);
            }
            DBUtil.deconnexion();

        } catch (SQLException ex) {
            // TODO exception si enregistrement non trouve
            Logger.getLogger(InterfaceCarnet.class.getName()).log(Level.SEVERE, null, ex);
        }

        return addressDTOList;
    }

    @Override
    public Object deleteAddress(AddressDTO addressDTO) throws AddressException {
        String req;
        // prepare notre sql de création

        req = "DELETE FROM carnet WHERE id = ?";
        try {
            // ouverture connexion            
            Connection connexion = DBUtil.connexion();

            // préparation requete
            PreparedStatement ps = connexion.prepareStatement(req);

            // preparation des valeurs a transmettre dans ma requette
            ps.setInt(1, addressDTO.getId());

            // execution de ma requetes préparées
            int res = ps.executeUpdate();

            DBUtil.deconnexion();

        } catch (SQLException ex) {
            throw new AddressException(ex);
        }
        return null;
    }

    @Override
    public Object updateAddress(AddressDTO addressDTO) throws AddressException {
        String req;
        Integer res;
        // prepare notre sql de création

        req = "UPDATE carnet SET civilite = ? , nom = ? , prenom = ? , appart_bat = ? , numero_voie = ? , complement_numero_voie = ? , libelle_voie = ? , code_postal = ? , ville = ? , telephone_mobile = ? , telephone_fixe = ? , mail_perso = ? , mail_pro = ? WHERE id = ?";

        System.out.println(req);
        try {
            // ouverture connexion
            Connection connexion = DBUtil.connexion();

            // préparation requete
            PreparedStatement ps = connexion.prepareStatement(req);
            System.out.println(ps);

            // preparation des valeurs a transmettre dans ma requette
            ps.setString(1, addressDTO.getCivilite());
            ps.setString(2, addressDTO.getNom());
            ps.setString(3, addressDTO.getPrenom());
            ps.setString(4, addressDTO.getAppartbat());
            ps.setString(5, addressDTO.getNumeroVoie());
            ps.setString(6, addressDTO.getComplementNumeroVoie());
            ps.setString(7, addressDTO.getLibelleVoie());
            ps.setString(8, addressDTO.getCodePostal());
            ps.setString(9, addressDTO.getVille());
            ps.setString(10, addressDTO.getTelephoneMobile());
            ps.setString(11, addressDTO.getTelephoneFixe());
            ps.setString(12, addressDTO.getMailPerso());
            ps.setString(13, addressDTO.getMailPro());
            ps.setInt(14, addressDTO.getId());

            // execution de ma requetes préparées
            res = ps.executeUpdate();

//            if(res == 1)
            DBUtil.deconnexion();

        } catch (SQLException ex) {
            throw new AddressException(ex);
        }
        return res;
    }

}
