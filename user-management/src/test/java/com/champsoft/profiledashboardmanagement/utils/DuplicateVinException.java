package com.champsoft.profiledashboardmanagement.utils;

public class DuplicateVinException extends RuntimeException{

    public DuplicateVinException() {}

    public DuplicateVinException(String message) { super(message); }

    public DuplicateVinException(Throwable cause) { super(cause); }

    public DuplicateVinException(String message, Throwable cause) { super(message, cause); }
}
