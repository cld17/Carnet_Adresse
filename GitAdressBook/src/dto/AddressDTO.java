package dto;

public class AddressDTO {
    String civilite;
    String nom;
    String prenom;
    String appartbat;
    int numeroVoie;
    String complementNumeroVoie;
    String libelleVoie;
    int codePostal;
    String ville;
    int telephoneMobile;
    int telephoneFixe;
    String mailPerso;
    String mailPro;

    public AddressDTO() {
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAppartbat() {
        return appartbat;
    }

    public void setAppartbat(String appartbat) {
        this.appartbat = appartbat;
    }

    public int getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(int numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    public String getComplementNumeroVoie() {
        return complementNumeroVoie;
    }

    public void setComplementNumeroVoie(String complementNumeroVoie) {
        this.complementNumeroVoie = complementNumeroVoie;
    }

    public String getLibelleVoie() {
        return libelleVoie;
    }

    public void setLibelleVoie(String libelleVoie) {
        this.libelleVoie = libelleVoie;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(int telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public int getTelephoneFixe() {
        return telephoneFixe;
    }

    public void setTelephoneFixe(int telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    public String getMailPerso() {
        return mailPerso;
    }

    public void setMailPerso(String mailPerso) {
        this.mailPerso = mailPerso;
    }

    public String getMailPro() {
        return mailPro;
    }

    public void setMailPro(String mailPro) {
        this.mailPro = mailPro;
    }
}
