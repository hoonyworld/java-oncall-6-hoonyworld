package oncall.view;

public enum IllegalArgumentExceptionType implements ExceptionType<IllegalArgumentException> {
    NON_VALID_VALUE("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요.");
    private final String message;

    IllegalArgumentExceptionType(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public IllegalArgumentException getException() {
        return new IllegalArgumentException(getMessage());
    }
}