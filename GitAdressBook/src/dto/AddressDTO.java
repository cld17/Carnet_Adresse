package dto;

public class AddressDTO {
    String civilite;
    String nom;
    String prenom;
    String appartbat;
    Integer numeroVoie;
    String complementNumeroVoie;
    String libelleVoie;
    Integer codePostal;
    String ville;
    Integer telephoneMobile;
    Integer telephoneFixe;
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

    public Integer getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(Integer numeroVoie) {
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

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Integer getTelephoneMobile() {
        return telephoneMobile;
    }

    public void setTelephoneMobile(Integer telephoneMobile) {
        this.telephoneMobile = telephoneMobile;
    }

    public Integer getTelephoneFixe() {
        return telephoneFixe;
    }

    public void setTelephoneFixe(Integer telephoneFixe) {
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
