/*
 * Interface : utiliser pour le CRUD
 * implémenté par la classe AdrdressDAOJdbc
 *  
 * Author : Adeline, Christophe, Cyril, Christine
 */

package dao;

import dto.AddressDTO;
import exception.AddressException;

import java.util.List;

public interface AddressDAO {

    Object insertAddress(AddressDTO addressDTO) throws AddressException;
    
    Object deleteAddress(AddressDTO addressDTO) throws AddressException;
    
    Object updateAddress(AddressDTO addressDTO) throws AddressException;

    List<AddressDTO> retrieveAddress(AddressDTO addressDTO) throws AddressException;
}
