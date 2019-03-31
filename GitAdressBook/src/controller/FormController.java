package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import dao.AddressDAOJdbc;
import dto.AddressDTO;
import exception.AddressException;
import exception.AddressValidatorException;
import model.Address;
import response.CustomResponse;
import response.FormatErrorEnum;
import util.Builder;
import validator.AddressValidator;

/**
 * @author stag
 */
public class FormController {

    private final AddressDAOJdbc addressDAO;

    public FormController() {
        addressDAO = new AddressDAOJdbc();
    }

    public CustomResponse createAddress(Address address) {
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

        return null;
    }

    public CustomResponse retrieveAddress(Address address) {
        //
//        addressDAO.retrieveAddress(addressDTO);
        //
        return null;
    }

    public CustomResponse deleteAddress(Address address) {
        return null;
    }


}
