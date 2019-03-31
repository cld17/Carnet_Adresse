package dao;

import dto.AddressDTO;
import exception.AddressException;

public interface AddressDAO {

    Object insertAddress(AddressDTO addressDTO) throws AddressException;

    Object retrieveAddress(AddressDTO addressDTO) throws AddressException;
}
