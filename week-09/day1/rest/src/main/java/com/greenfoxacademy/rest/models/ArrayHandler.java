package com.greenfoxacademy.rest.models;

import java.util.Arrays;

public class ArrayHandler {

    private String what;
    private int[] numbers;

    public ArrayHandler() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "ArrayHandler{" +
                "what='" + what + '\'' +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
