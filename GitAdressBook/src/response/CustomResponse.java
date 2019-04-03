/*
 * Gestion des réponses à afficher dans la vue
 *  
 * Author : Adeline, Christophe, Cyril, Christine
 */
package response;

import model.Address;

import java.util.List;

public class CustomResponse {

    // TODO : amélioration : hashmap
    private FormatErrorEnum responseCode;
    private String errorMessage;
    private List<Address> addresses;

    public CustomResponse() {
    }

    public FormatErrorEnum getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(FormatErrorEnum responseCode) {
        this.responseCode = responseCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
