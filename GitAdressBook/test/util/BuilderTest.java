/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dto.AddressDTO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Address;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stag
 */
public class BuilderTest {

    public BuilderTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of buildAddressDTO method, of class Builder.
     */
    @Test
    public void testBuildAddressDTO() {
        System.out.println("buildAddressDTO");

        AddressDTO expResultDto = new AddressDTO();
        expResultDto.setId(1);
        expResultDto.setCivilite("M.");
        expResultDto.setNom("STARK");
        expResultDto.setPrenom("Tony");
        expResultDto.setNumeroVoie("1");
        expResultDto.setComplementNumeroVoie("A");
        expResultDto.setLibelleVoie("avenue Ironman");
        expResultDto.setCodePostal("11222");
        expResultDto.setVille("NEW-YORK");
        expResultDto.setTelephoneMobile("0601020304");
        expResultDto.setTelephoneFixe("0501020304");
        expResultDto.setMailPerso("tony.stark@avengers.com");
        expResultDto.setMailPro("ironman@avengers.com");

        Address address = new Address();
        address.setId("1");
        address.setCivilite("M.");
        address.setNom("STARK");
        address.setPrenom("Tony");
        address.setNumeroVoie("1");
        address.setComplementNumeroVoie("A");
        address.setLibelleVoie("avenue Ironman");
        address.setCodePostal("11222");
        address.setVille("NEW-YORK");
        address.setTelephoneMobile("0601020304");
        address.setTelephoneFixe("0501020304");
        address.setMailPerso("tony.stark@avengers.com");
        address.setMailPro("ironman@avengers.com");

        AddressDTO result = Builder.buildAddressDTO(address);

        assertEquals(expResultDto.getId(), result.getId());
        assertEquals(expResultDto.getCivilite(), result.getCivilite());
        assertEquals(expResultDto.getNom(), result.getNom());
        assertEquals(expResultDto.getPrenom(), result.getPrenom());
        assertEquals(expResultDto.getNumeroVoie(), result.getNumeroVoie());
        assertEquals(expResultDto.getComplementNumeroVoie(), result.getComplementNumeroVoie());
        assertEquals(expResultDto.getLibelleVoie(), result.getLibelleVoie());
        assertEquals(expResultDto.getCodePostal(), result.getCodePostal());
        assertEquals(expResultDto.getVille(), result.getVille());
        assertEquals(expResultDto.getTelephoneMobile(), result.getTelephoneMobile());
        assertEquals(expResultDto.getTelephoneFixe(), result.getTelephoneFixe());
        assertEquals(expResultDto.getMailPerso(), result.getMailPerso());
        assertEquals(expResultDto.getMailPro(), result.getMailPro());
        // TODO review the generated test code and remove the default call to fail.
        if (!expResultDto.getId().equals(result.getId())) {
            fail("Erreur sur getId()");
        }
        if (!expResultDto.getCivilite().equals(result.getCivilite())) {
            fail("Erreur sur getCivilite()");
        }
        if (!expResultDto.getNom().equals(result.getNom())) {
            fail("Erreur sur getNom()");
        }
        if (!expResultDto.getPrenom().equals(result.getPrenom())) {
            fail("Erreur sur getPrenom()");
        }
        if (!expResultDto.getNumeroVoie().equals(result.getNumeroVoie())) {
            fail("Erreur sur getNumeroVoie()");
        }
        if (!expResultDto.getComplementNumeroVoie().equals(result.getComplementNumeroVoie())) {
            fail("Erreur sur getComplementNumeroVoie()");
        }
        if (!expResultDto.getLibelleVoie().equals(result.getLibelleVoie())) {
            fail("Erreur sur getLibelleVoie()");
        }
        if (!expResultDto.getCodePostal().equals(result.getCodePostal())) {
            fail("Erreur sur getCodePostal()");
        }
        if (!expResultDto.getVille().equals(result.getVille())) {
            fail("Erreur sur getVille()");
        }
        if (!expResultDto.getTelephoneMobile().equals(result.getTelephoneMobile())) {
            fail("Erreur sur getTelephoneMobile()");
        }
        if (!expResultDto.getTelephoneFixe().equals(result.getTelephoneFixe())) {
            fail("Erreur sur getTelephoneFixe()");
        }
        if (!expResultDto.getMailPerso().equals(result.getMailPerso())) {
            fail("Erreur sur getMailPerso()");
        }
        if (!expResultDto.getMailPro().equals(result.getMailPro())) {
            fail("Erreur sur getMailPro()");
        }
    }

    /**
     * Test of buildAddress method, of class Builder.
     */
    @Test
    public void testBuildAddress() {
        System.out.println("buildAddress");

        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(1);
        addressDTO.setCivilite("M.");
        addressDTO.setNom("STARK");
        addressDTO.setPrenom("Tony");
        addressDTO.setNumeroVoie("1");
        addressDTO.setComplementNumeroVoie("A");
        addressDTO.setLibelleVoie("avenue Ironman");
        addressDTO.setCodePostal("11222");
        addressDTO.setVille("NEW-YORK");
        addressDTO.setTelephoneMobile("0601020304");
        addressDTO.setTelephoneFixe("0501020304");
        addressDTO.setMailPerso("tony.stark@avengers.com");
        addressDTO.setMailPro("ironman@avengers.com");

        Address adressINPUT = new Address();
        adressINPUT.setId("1");
        adressINPUT.setCivilite("M.");
        adressINPUT.setNom("STARK");
        adressINPUT.setPrenom("Tony");
        adressINPUT.setNumeroVoie("1");
        adressINPUT.setComplementNumeroVoie("A");
        adressINPUT.setLibelleVoie("avenue Ironman");
        adressINPUT.setCodePostal("11222");
        adressINPUT.setVille("NEW-YORK");
        adressINPUT.setTelephoneMobile("0601020304");
        adressINPUT.setTelephoneFixe("0501020304");
        adressINPUT.setMailPerso("tony.stark@avengers.com");
        adressINPUT.setMailPro("ironman@avengers.com");

        Address expResult = adressINPUT;
        Address result = Builder.buildAddress(addressDTO);

        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getCivilite(), result.getCivilite());
        assertEquals(expResult.getNom(), result.getNom());
        assertEquals(expResult.getPrenom(), result.getPrenom());
        assertEquals(expResult.getNumeroVoie(), result.getNumeroVoie());
        assertEquals(expResult.getComplementNumeroVoie(), result.getComplementNumeroVoie());
        assertEquals(expResult.getLibelleVoie(), result.getLibelleVoie());
        assertEquals(expResult.getCodePostal(), result.getCodePostal());
        assertEquals(expResult.getVille(), result.getVille());
        assertEquals(expResult.getTelephoneMobile(), result.getTelephoneMobile());
        assertEquals(expResult.getTelephoneFixe(), result.getTelephoneFixe());
        assertEquals(expResult.getMailPerso(), result.getMailPerso());
        assertEquals(expResult.getMailPro(), result.getMailPro());

        // TODO review the generated test code and remove the default call to fail.
        if (!expResult.getId().equals(result.getId())) {
            fail("Erreur sur getId()");
        }
        if (!expResult.getCivilite().equals(result.getCivilite())) {
            fail("Erreur sur getCivilite()");
        }
        if (!expResult.getNom().equals(result.getNom())) {
            fail("Erreur sur getNom()");
        }
        if (!expResult.getPrenom().equals(result.getPrenom())) {
            fail("Erreur sur getPrenom()");
        }
        if (!expResult.getNumeroVoie().equals(result.getNumeroVoie())) {
            fail("Erreur sur getNumeroVoie()");
        }
        if (!expResult.getComplementNumeroVoie().equals(result.getComplementNumeroVoie())) {
            fail("Erreur sur getComplementNumeroVoie()");
        }
        if (!expResult.getLibelleVoie().equals(result.getLibelleVoie())) {
            fail("Erreur sur getLibelleVoie()");
        }
        if (!expResult.getCodePostal().equals(result.getCodePostal())) {
            fail("Erreur sur getCodePostal()");
        }
        if (!expResult.getVille().equals(result.getVille())) {
            fail("Erreur sur getVille()");
        }
        if (!expResult.getTelephoneMobile().equals(result.getTelephoneMobile())) {
            fail("Erreur sur getTelephoneMobile()");
        }
        if (!expResult.getTelephoneFixe().equals(result.getTelephoneFixe())) {
            fail("Erreur sur getTelephoneFixe()");
        }
        if (!expResult.getMailPerso().equals(result.getMailPerso())) {
            fail("Erreur sur getMailPerso()");
        }
        if (!expResult.getMailPro().equals(result.getMailPro())) {
            fail("Erreur sur getMailPro()");
        }
    }

    /**
     * Test of buildAddresses method, of class Builder.
     */
    @Test
    public void testBuildAddresses() {
        System.out.println("buildAddresses");

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nom");
        model.addColumn("Prénom");
        model.addColumn("Code postal");
        model.addColumn("Ville");
        model.addRow(new Object[]{1, "STARK", "Tony", "11222", "NEW-YORK"});
        model.addRow(new Object[]{2, "ROGER", "Steeve", "22333", "WASHINGTON"});
        model.addRow(new Object[]{3, "BANNER", "Bruce", "33444", "DAYTON"});

        DefaultTableModel modelDTO = new DefaultTableModel();
        modelDTO.addColumn("Id");
        modelDTO.addColumn("Nom");
        modelDTO.addColumn("Prénom");
        modelDTO.addColumn("Code postal");
        modelDTO.addColumn("Ville");
        modelDTO.addRow(new Object[]{"1", "STARK", "Tony", "11222", "NEW-YORK"});
        modelDTO.addRow(new Object[]{"2", "ROGER", "Steeve", "22333", "WASHINGTON"});
        modelDTO.addRow(new Object[]{"3", "BANNER", "Bruce", "33444", "DAYTON"});

        //********* PROBLEME DE CONVERSION ENTRE DEFAULTTABLEMODEL ET LIST ******************
        /*DefaultTableModel addressDTOList = modelDTO;
        DefaultTableModel expResult = model;
        List<Address> result = Builder.buildAddresses(addressDTOList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!expResult.equals(result)) {
            fail("The test case is a prototype.");
        }*/
    }

}
