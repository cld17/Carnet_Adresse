package dao;

import dto.AddressDTO;
import exception.AddressException;
import util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressDAOJdbc implements AddressDAO {
    @Override
    public Object insertAddress(AddressDTO addressDTO) throws AddressException {
        String req;
        // prepare notre sql de création

        req = "insert into carnet (`civilite`,`nom`,`prenom`,`appart_bat`,`numero_voie`,`complement_numero_voie`,`libelle_voie`,`code_postal`,`ville`,`telephone_mobile`,`telephone_fixe`,`mail_perso`,`mail_pro`) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DBUtil.connexion().prepareStatement(req);

            // preparation des valeurs a transmettre dans ma requette
            ps.setString(1, addressDTO.getCivilite());
            ps.setString(2, addressDTO.getNom());
            ps.setString(3, addressDTO.getPrenom());
            ps.setString(4, addressDTO.getAppartbat());
            ps.setInt(5, addressDTO.getNumeroVoie());
            ps.setString(6, addressDTO.getComplementNumeroVoie());
            ps.setString(7, addressDTO.getLibelleVoie());
            ps.setInt(8, addressDTO.getCodePostal());
            ps.setString(9, addressDTO.getVille());
            ps.setInt(10, addressDTO.getTelephoneMobile());
            ps.setInt(11, addressDTO.getTelephoneFixe());
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
    public Object retrieveAddress(AddressDTO addressDTO) throws AddressException {
        return null;
    }
}
