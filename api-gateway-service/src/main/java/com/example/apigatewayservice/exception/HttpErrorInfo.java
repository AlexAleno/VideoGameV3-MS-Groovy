package com.example.apigatewayservice.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import java.time.ZonedDateTime;

@Getter // Uses Lombok - or generate getters manually
public class HttpErrorInfo {
    private final ZonedDateTime timestamp;
    private final String path;
    private final HttpStatus httpStatus;
    private final String message;

    public HttpErrorInfo(HttpStatus httpStatus, String path, String message) {
        this.timestamp = ZonedDateTime.now();
        this.httpStatus = httpStatus;
        this.path = path;
        this.message = message;
    }

    public HttpErrorInfo() {
        this.timestamp = null;
        this.path = null;
        this.httpStatus = null;
        this.message = null;
    }
}