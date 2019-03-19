package com.greenfoxacademy.rest.models;

public class InputError {

    private String error;

    public InputError(){}

    public InputError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
