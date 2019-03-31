package util;

import dto.AddressDTO;
import model.Address;

public class Builder {

    public static AddressDTO buildAddressDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setCivilite(address.getCivilite());
        addressDTO.setNom(address.getNom());
        addressDTO.setPrenom(address.getPrenom());
        addressDTO.setAppartbat(address.getAppartbat());
        addressDTO.setNumeroVoie(Integer.parseInt(address.getNumeroVoie()));
        addressDTO.setComplementNumeroVoie(address.getComplementNumeroVoie());
        addressDTO.setLibelleVoie(address.getLibelleVoie());
        addressDTO.setCodePostal(Integer.parseInt(address.getCodePostal()));
        addressDTO.setVille(address.getVille());
        addressDTO.setTelephoneMobile(Integer.parseInt(address.getTelephoneMobile()));
        addressDTO.setTelephoneFixe(Integer.parseInt(address.getTelephoneFixe()));
        addressDTO.setMailPerso(address.getMailPerso());
        addressDTO.setMailPro(address.getMailPro());

        return addressDTO;
    }
}
