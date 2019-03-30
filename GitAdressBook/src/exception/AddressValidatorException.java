package exception;

import util.FormatErrorEnum;

public class AddressValidatorException extends Exception {

    private FormatErrorEnum errorCode;

    public AddressValidatorException() {
    }

    public AddressValidatorException(String message) {
        super(message);
    }

    public AddressValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public AddressValidatorException(Throwable cause) {
        super(cause);
    }

    public AddressValidatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AddressValidatorException(String message, FormatErrorEnum error) {
        super(message);
        this.errorCode = error;
    }

    public FormatErrorEnum getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(FormatErrorEnum errorCode) {
        this.errorCode = errorCode;
    }
}
