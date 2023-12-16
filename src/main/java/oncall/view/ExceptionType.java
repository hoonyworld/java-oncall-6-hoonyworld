package oncall.view;

public interface ExceptionType<T> {
    String getMessage();

    T getException();
}