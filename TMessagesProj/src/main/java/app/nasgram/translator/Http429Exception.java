package app.nasgram.translator;

/**
 * Thrown when a translation provider returns HTTP 429 Too Many Requests.
 */
public class Http429Exception extends Exception {
    public Http429Exception(String message) {
        super(message);
    }

    public Http429Exception(String message, Throwable cause) {
        super(message, cause);
    }
}
