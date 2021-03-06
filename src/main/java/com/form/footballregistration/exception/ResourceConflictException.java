package com.form.footballregistration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ResourceConflictException extends RuntimeException {
    public ResourceConflictException() { super(); }
    public ResourceConflictException(String message, Throwable cause) { super(message, cause);  }
    public ResourceConflictException(String message) { super(message);}
    public ResourceConflictException(Throwable cause) { super(cause); }
}
