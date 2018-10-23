package com.alevel;

public class ProgressionConfigurationException extends RuntimeException {
    public ProgressionConfigurationException(String message) {
        super(message);
    }

    public ProgressionConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProgressionConfigurationException(Throwable cause) {
        super(cause);
    }
}
