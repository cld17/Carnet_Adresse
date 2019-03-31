package util;

import dto.AddressDTO;
import model.Address;

import java.util.List;
import java.util.stream.Collectors;

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

    public static Address buildAddress(AddressDTO addressDTO) {
        Address address = new Address();

        address.setCivilite(address.getCivilite());
        address.setNom(address.getNom());
        address.setPrenom(address.getPrenom());
        address.setAppartbat(address.getAppartbat());
        address.setNumeroVoie(address.getNumeroVoie());
        address.setComplementNumeroVoie(address.getComplementNumeroVoie());
        address.setLibelleVoie(address.getLibelleVoie());
        address.setCodePostal(address.getCodePostal());
        address.setVille(address.getVille());
        address.setTelephoneMobile(address.getTelephoneMobile());
        address.setTelephoneFixe(address.getTelephoneFixe());
        address.setMailPerso(address.getMailPerso());
        address.setMailPro(address.getMailPro());

        return address;
    }

    public static List<Address> buildAddresses(List<AddressDTO> addressDTOList) {
        //            for (int i = 0; i < addressDTOList.size(); i++) {
//                resultat.add(Builder.buildAddress(addressDTOList.get(i)));
//            }
        // ==
//            for (AddressDTO a :
//                    addressDTOList) {
//                resultat.add(Builder.buildAddress(a));
//            }
// ==
//            addressDTOList.stream().map(addressDTO1 -> Builder.buildAddress(addressDTO1)).collect(Collectors.toList());
        // ==
//        addressDTOList.stream().map(Builder::buildAddress).collect(Collectors.toList());
        return addressDTOList.stream().map(addressDTO1 -> {
            Address address = Builder.buildAddress(addressDTO1);
            return address;
        }).collect(Collectors.toList());
    }
}
