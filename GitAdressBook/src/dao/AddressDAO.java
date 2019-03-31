package dao;

import dto.AddressDTO;
import exception.AddressException;

import java.util.List;

public interface AddressDAO {

    Object insertAddress(AddressDTO addressDTO) throws AddressException;

    List<AddressDTO> retrieveAddress(AddressDTO addressDTO) throws AddressException;
}
