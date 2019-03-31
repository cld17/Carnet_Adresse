package response;

public class CustomResponse {

    private FormatErrorEnum responseCode;
    private String errorMessage;

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
}
