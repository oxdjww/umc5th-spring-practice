package umc.spring.apiPayload.code.status;

public enum SuccessStatus {
    _OK("OK", "Operation successful"),
    ;

    private final String code;
    private final String message;

    SuccessStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
