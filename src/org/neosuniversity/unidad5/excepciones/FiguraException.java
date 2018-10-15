package org.neosuniversity.unidad5.excepciones;

public class FiguraException extends Exception {

    public FiguraException(String message) {
        super(message);
    }

    public FiguraException(String message, Throwable cause) {
        super(message, cause);
    }
}