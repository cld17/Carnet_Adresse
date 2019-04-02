package validator;

import exception.AddressValidatorException;
import model.Address;
import response.FormatErrorEnum;

public class AddressValidator {
    /**
     * Valide le nom
     */
    private static void validationNom(String nom) throws AddressValidatorException {
        if (nom != null && nom.trim().length() < 2) {

            // popup réussite
            //    JOptionPane.showMessageDialog("Veuillez saisir un nom.");
            throw new AddressValidatorException("Le nom du contact doit contenir au moins 2 caractères.");
        }
    }

    /**
     * Valide le prenom : si société prénom non obligatoire
     */
    private static void validationPrenom(String prenom, String boutonCivilite) throws AddressValidatorException {
        boolean cestunesociete = Boolean.parseBoolean(boutonCivilite);
        if (cestunesociete || prenom != null && prenom.trim().length() < 2) {

            // popup réussite
            //    JOptionPane.showMessageDialog("Veuillez saisir un nom.");
            throw new AddressValidatorException("Le prennom du contact doit contenir au moins 2 caractères.");
        }
    }


    // intNumeroVoie

    /**
     * Valide le prenom : si société prénom non obligatoire
     *
     * @param intNumeroVoie
     */
   // private static void validationNumeroVoie(String intNumeroVoie) throws AddressValidatorException {
   //     try {
  //          Integer.parseInt(intNumeroVoie);
  //      } catch (NumberFormatException e) {
  //          throw new AddressValidatorException("Le numéro de la voie doit être numérique.", e);

    //    }
        //  if (intNumeroVoie != null || int intNumeroVoie entier = Integer.parseInt(intNumeroVoie)) {

        //
        //    JOptionPane.showMessageDialog("Veuillez saisir un nom.");
        // }
  //  }

    /**
     * Valide l'adresse mail saisie.
     */
    private static void validationEmail(String email, String type) throws AddressValidatorException {
        if (email != null && email.trim().length() != 0) {
            if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
                String errorMessage = type.equals("pro") ? "Email professionel invalide." : "Email personnel invalide.";
                throw new AddressValidatorException(errorMessage, FormatErrorEnum.EMAIL_ERROR);
            }
        } //else {
            
                 //throw new AddressValidatorException("Merci de saisir une adresse mail.", FormatErrorEnum.EMAIL_ERROR);
    //}
    }

    public static void validate(Address address) throws AddressValidatorException {
        validationEmail(address.getMailPerso(), "perso");
     //   validationEmail(address.getMailPro(), "pro");
        validationNom(address.getNom());
       // validationNumeroVoie(address.getNumeroVoie());
        validationPrenom(address.getPrenom(), address.getCivilite());
        // TODO
        // ajout methode pour chaque champs
        // Code Postal
        // Nom
    }
}
