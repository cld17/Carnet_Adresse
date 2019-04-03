package controller;

/*
 * Modele MVC appliqué : Le controller gére : 
 * la vue
 * la validation des champs saisis
 * la préparation de l'objet DTO
 * l'appel de la classe DAO pour la mise a jour dans la base
 *  
 */
import dao.AddressDAO;
import dao.AddressDAOJdbc;
import dto.AddressDTO;
import exception.AddressException;
import exception.AddressValidatorException;
import model.Address;
import response.CustomResponse;
import response.FormatErrorEnum;
import util.Builder;
import validator.AddressValidator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adeline, Christophe, Cyril, Christine
 */
public class FormController {

    /**
     * type = nom de l'interRetrieveface (pas l'implementation. si
     * l'implementation change on a pas à le modifier
     */
    private final AddressDAO addressDAO;

    public FormController() {

        /**
         * Creation requete sql + ouverture connexion base sql + deconnexion
         * base sql retourne une exception si erreur on utilise l'implementation
         */
        addressDAO = new AddressDAOJdbc();
    }

    /**
     * Creation contact
     */
    public CustomResponse createAddress(Address address) {
        // création objet reponse
        CustomResponse customResponse = new CustomResponse();

        try {
            AddressValidator.validate(address);

            AddressDTO addressDTO = Builder.buildAddressDTO(address);

            addressDAO.insertAddress(addressDTO);

        } catch (AddressValidatorException e) {
            customResponse.setResponseCode(e.getErrorCode());
            customResponse.setErrorMessage(e.getMessage());
            return customResponse;
        } catch (AddressException e) {
            customResponse.setResponseCode(FormatErrorEnum.DATABASE_ERROR);
            customResponse.setErrorMessage(e.getMessage());
            return customResponse;
        }

        customResponse.setResponseCode(FormatErrorEnum.SUCCESS);

        return customResponse;
    }

    /**
     * Recherche contact
     */
    public CustomResponse retrieveAddress(Address address) {
        // création objet reponse
        CustomResponse customResponse = new CustomResponse();

        List<Address> resultat = new ArrayList<>();

        try {
            // todo si nom, libelle voie , cp et ville nom rempli -> on déclenche une exception

            AddressDTO addressDTO = Builder.buildAddressDTO(address);

            // Récupération liste
            List<AddressDTO> addressDTOList = addressDAO.retrieveAddress(addressDTO);
            System.out.println("controller " + addressDTOList);

            resultat.addAll(Builder.buildAddresses(addressDTOList));

        } catch (AddressException e) {
            customResponse.setResponseCode(FormatErrorEnum.DATABASE_ERROR);
            customResponse.setErrorMessage(e.getMessage());
            return customResponse;
        }

        customResponse.setResponseCode(FormatErrorEnum.SUCCESS);
//        customResponse.put("responseCode", FormatErrorEnum.SUCCESS);
        customResponse.setAddresses(resultat);

        return customResponse;
    }

    /**
     * Suppression contact
     */
    public CustomResponse deleteAddress(Address address) {
        // création objet reponse
        CustomResponse customResponse = new CustomResponse();

        try {

            AddressDTO addressDTO = Builder.buildAddressDTO(address);

            addressDAO.deleteAddress(addressDTO);

        } catch (AddressException e) {
            customResponse.setResponseCode(FormatErrorEnum.DATABASE_ERROR);
            customResponse.setErrorMessage(e.getMessage());
            return customResponse;
        }

        customResponse.setResponseCode(FormatErrorEnum.SUCCESS);

        return customResponse;
    }

    /**
     * Mise à jour contact
     */
    public CustomResponse updateAddress(Address address) {// création objet reponse
        CustomResponse customResponse = new CustomResponse();

        try {
            AddressValidator.validate(address);

            AddressDTO addressDTO = Builder.buildAddressDTO(address);

            addressDAO.updateAddress(addressDTO);

        } catch (AddressValidatorException e) {
            customResponse.setResponseCode(e.getErrorCode());
            customResponse.setErrorMessage(e.getMessage());
            return customResponse;
        } catch (AddressException e) {
            customResponse.setResponseCode(FormatErrorEnum.DATABASE_ERROR);
            customResponse.setErrorMessage(e.getMessage());
            return customResponse;
        }

        customResponse.setResponseCode(FormatErrorEnum.SUCCESS);

        return customResponse;
    }

}
