package util;

import dto.AddressDTO;
import java.util.ArrayList;
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
        addressDTO.setNumeroVoie(address.getNumeroVoie() != null && !address.getNumeroVoie().isEmpty() ? Integer.parseInt(address.getNumeroVoie()) : null);
        addressDTO.setComplementNumeroVoie(address.getComplementNumeroVoie());
        addressDTO.setLibelleVoie(address.getLibelleVoie());
        addressDTO.setCodePostal( address.getCodePostal() != null && !address.getCodePostal().isEmpty() ? Integer.parseInt(address.getCodePostal()) : null);
        addressDTO.setVille(address.getVille());
        addressDTO.setTelephoneMobile(address.getTelephoneMobile() != null && !address.getTelephoneMobile().isEmpty()? Integer.parseInt(address.getTelephoneMobile()) : null);
        addressDTO.setTelephoneFixe(address.getTelephoneFixe() != null && !address.getTelephoneFixe().isEmpty()? Integer.parseInt(address.getTelephoneFixe()) : null);
        addressDTO.setMailPerso(address.getMailPerso());
        addressDTO.setMailPro(address.getMailPro());

        return addressDTO;
    }

    public static Address buildAddress(AddressDTO addressDTO) {
        Address address = new Address();

        address.setCivilite(addressDTO.getCivilite());
        address.setNom(addressDTO.getNom());
        address.setPrenom(addressDTO.getPrenom());
        address.setAppartbat(addressDTO.getAppartbat());
        address.setNumeroVoie(addressDTO.getNumeroVoie() != null ? addressDTO.getNumeroVoie().toString() : null);
        address.setComplementNumeroVoie(addressDTO.getComplementNumeroVoie());
        address.setLibelleVoie(addressDTO.getLibelleVoie());
        address.setCodePostal(addressDTO.getCodePostal() !=null ? addressDTO.getCodePostal().toString(): null);
        address.setVille(addressDTO.getVille());
        address.setTelephoneMobile(addressDTO.getTelephoneMobile() != null ? addressDTO.getTelephoneMobile().toString() : null);
        address.setTelephoneFixe(addressDTO.getTelephoneFixe() != null ? addressDTO.getTelephoneFixe().toString(): null);
        address.setMailPerso(addressDTO.getMailPerso());
        address.setMailPro(addressDTO.getMailPro());

        return address;
    }

    public static List<Address> buildAddresses(List<AddressDTO> addressDTOList) {
        List<Address> resultat = new ArrayList<>();
        //            for (int i = 0; i < addressDTOList.size(); i++) {
//                resultat.add(Builder.buildAddress(addressDTOList.get(i)));
//            }
        // ==
            for (AddressDTO a :
                    addressDTOList) {
                resultat.add(Builder.buildAddress(a));
            }
// ==
//            addressDTOList.stream().map(addressDTO1 -> Builder.buildAddress(addressDTO1)).collect(Collectors.toList());
        // ==
//        addressDTOList.stream().map(Builder::buildAddress).collect(Collectors.toList());
//        return addressDTOList.stream().map(addressDTO1 -> {
//            Address address = Builder.buildAddress(addressDTO1);
//            return address;
//        }).collect(Collectors.toList());
return resultat;
    }
}
