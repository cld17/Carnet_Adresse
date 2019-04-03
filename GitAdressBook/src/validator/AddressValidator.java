/*
 * Validdation des champs de données
 * Liste des méthodes par nom de champs
 *   
 * Author : Adeline, Christophe, Cyril, Christine
 */

// les JOptionPane doivent être dans la vue.
// Validator -> envoie le message et c'est la vue qui affiche le popup!!!!!!!

package validator;

import exception.AddressValidatorException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Address;

public class AddressValidator {

    /**
     *  *** VALIDATION DU NOM
     *
     ***
     * @param nom
     * @throws exception.AddressValidatorException
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien une chaine de 2 à 50
     * caratères Vérifie que le champ n'est pas null Envoie un popup d'alerte si
     * ce n'est pas le cas
     */
    public static void validationNom(String nom) throws AddressValidatorException {
        if (nom != null && nom.trim().length() < 1) {
            JOptionPane.showMessageDialog(null, "Saisir un nom (obligatoire)");
            throw new AddressValidatorException("Le nom du contact doit contenir au moins 2 caractères");
        }
        if (!Pattern.matches("[A-Za-z/' /-]{2,50}", nom)) {
            JOptionPane.showMessageDialog(null, "(Nom) Saisie texte incorrecte");
            throw new AddressValidatorException("Le nom du contact doit contenir de 2 à 50 caractères alphabétiques");
        }
    }

    /**
     *  *** VALIDATION DU PRENOM
     *
     ***
     * @param prenom
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien une chaine de 0 à 50
     * caratères Envoie un popup d'alerte si ce n'est pas le cas
     */
    private static void validationPrenom(String prenom) throws AddressValidatorException {
        //boolean cestunesociete = Boolean.parseBoolean(boutonCivilite);
        //if (cestunesociete || prenom != null && prenom.trim().length() < 2) {
        //JOptionPane.showMessageDialog("Veuillez saisir un nom.");
        //throw new AddressValidatorException("Le prenom du contact doit contenir au moins 2 caractères.");
        //}
       
        
        if (!Pattern.matches("[A-Za-z/' /-]{0,50}", prenom)) {
            JOptionPane.showMessageDialog(null, "(Prenom) Saisie texte incorrecte");
            throw new AddressValidatorException("Le prenom du contact doit contenir 50 caractères alphabétiques maximum");
        }
    }

    /**
     *  *** VALIDATION DE APPARTBAT
     *
     ***
     * @param appartBat
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien une chaine de 0 à 50
     * caratères Envoie un popup d'alerte si ce n'est pas le cas
     */
    
    private static void validationApparbat(String appartBat) throws AddressValidatorException {
        if (!Pattern.matches("[A-Za-z0-9.' -]{0,50}", appartBat)) {
            JOptionPane.showMessageDialog(null, "(Appart/Bat) Saisie texte incorrecte");
            throw new AddressValidatorException("Le champs doit contenir 50 caractères alphanumérique maximum");
        }
    }

    /**
     *  *** VALIDATION DE NUMVOIE ***
     *
     * @param numeroVoie
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien un int de 0 à 10
     * caratères Envoie un popup d'alerte si ce n'est pas le cas Valide le nom :
     * obligatioire
     */
       
    private static void validationNumeroVoie(String numeroVoie) throws AddressValidatorException {
        if (!Pattern.matches("[0-9]{0,10}", numeroVoie)) {
            JOptionPane.showMessageDialog(null, "(Numéro voie) Saisie texte incorrecte");
            throw new AddressValidatorException("Le champs doit contenir 10 caractères numérique maximum");
        }
    }

    /**
     *  *** VALIDATION DE COMPLEMENTNUMVOIE
     *
     ***
     * @param complementNumeroVoie
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien une chaine de 0 à 10
     * caratères Envoie un popup d'alerte si ce n'est pas le cas
     */
    
    private static void validationComplementNumeroVoie(String complementNumeroVoie) throws AddressValidatorException {
        if (!Pattern.matches("[A-Za-z/' /-]{0,10}", complementNumeroVoie)) {
            JOptionPane.showMessageDialog(null, "(Complément numéro voie) Saisie texte incorrecte");
            throw new AddressValidatorException("Le champs doit contenir 10 caractères alphabétiques maximum");
        }
    }

    /**
     *
     *  *** VALIDATION DE LIBELLEVOIE
     *
     ***
     * @param libelleVoie
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien une chaine de 0 à 50
     * caratères alphanumériques Envoie un popup d'alerte si ce n'est pas le cas
     * Valide le prénom si rempli : non obligatioire
     */

    private static void validationLibelleVoie(String libelleVoie) throws AddressValidatorException {

        if (!Pattern.matches("[A-Za-z/' /-]{0,50}", libelleVoie)) {
            JOptionPane.showMessageDialog(null, "(Libellé voie) Saisie texte incorrecte");
            throw new AddressValidatorException("Le champs doit contenir 50 caractères alphabétiques maximum");
        }
    }

    /**
     *  *** VALIDATION DE CODEPOSTAL
     *
     ***
     * @param codePostal
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien une chaine de 0 à 5
     * caratères numériques Envoie un popup d'alerte si ce n'est pas le cas
     */
     
    private static void validationCodePostal(String codePostal) throws AddressValidatorException {
        if (!Pattern.matches("[0-9 ]{0,5}", codePostal)) {
            JOptionPane.showMessageDialog(null, "(Code postal) Saisie texte incorrecte");
            throw new AddressValidatorException("Le champs doit contenir 5 caractères numérique maximum");
        }
    }

    /**
     *  *** VALIDATION DE VILLE
     *
     ***
     * @param ville
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien une chaine de 0 à 50
     * caratères alphabétiques Envoie un popup d'alerte si ce n'est pas le cas
     */
    
    private static void validationVille(String ville) throws AddressValidatorException {
        if (!Pattern.matches("[A-Za-z/' /-]{0,50}", ville)) {
            JOptionPane.showMessageDialog(null, "(ville) Saisie texte incorrecte");
            throw new AddressValidatorException("Le champs doit contenir 50 caractères alphabétiques maximum");
        }
    }

    /**
     *  *** VALIDATION DE NUMTEL
     *
     ***
     * @param numTel
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien une chaine de 0 à 10
     * caratères numeriques Envoie un popup d'alerte si ce n'est pas le cas
     */
        
    private static void validationNumTel(String numTel, String type) throws AddressValidatorException {
        if (!Pattern.matches("[0-9 /./-]{0,50}", numTel)) {
            if (type == "mobile") {
                JOptionPane.showMessageDialog(null, "(Téléphone mobile) Saisie texte incorrecte");
            } else {
                JOptionPane.showMessageDialog(null, "(Téléphone mobile) Saisie texte incorrecte");
            }
            throw new AddressValidatorException("Le champs doit contenir 10 caractères numériques maximum");
        }
    }

    /**
     *  *** VALIDATION DE MAIL
     *
     ***
     * @param mail
     * @autor Christophe COURONNE / Christine LAVAUD / Cyril VAN-LOO / Adeline
     * GALLAND Vérifie que le paramètre en entrée est bien une chaine de 0 à 50
     * caratères alphanumeriques contenant @ Envoie un popup d'alerte si ce
     * n'est pas le cas
     */
    
    
    private static void validationMail(String mail, String type) throws AddressValidatorException {
        if (mail != null && mail.trim().length() < 1) {
            if (!Pattern.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", mail)) {
                if (type == "perso") {
                    JOptionPane.showMessageDialog(null, "(Mail perso) Saisie texte incorrecte");
                } else {
                    JOptionPane.showMessageDialog(null, "(Mail pro) Saisie texte incorrecte");
                }
                throw new AddressValidatorException("Le champs doit contenir @ et une extension");
            }
        }
    }

    public static void validate(Address address) throws AddressValidatorException {
        validationNom(address.getNom());
        validationPrenom(address.getPrenom());
        validationApparbat(address.getAppartbat());
        validationNumeroVoie(address.getNumeroVoie());
        validationComplementNumeroVoie(address.getComplementNumeroVoie());
        validationLibelleVoie(address.getLibelleVoie());
        validationCodePostal(address.getCodePostal());
        validationVille(address.getVille());
        validationNumTel(address.getTelephoneMobile(), "mobile");
        validationNumTel(address.getTelephoneFixe(), "fixe");
        validationMail(address.getMailPerso(), "perso");
        validationMail(address.getMailPro(), "pro");
    }
}
