package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author stag
 */
public class FormController {

    // type = nom de l'interRetrieveface (pas l'implementation.
    // si l'implementation change on a pas à le modifier
    private final AddressDAO addressDAO;

    public FormController() {

        // Creation requete sql + ouverture connexion base sql + deconnexion base sql  
        // retourne une exception si erreur
        // on utilise l'implementation
        addressDAO = new AddressDAOJdbc();
    }

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

    // recherche
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

    //
    
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
