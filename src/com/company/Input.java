package com.company;

public class Input {

    private static final String INVALID_MSG = "Invalid input: must enter 2 positive integers";

    public boolean isValid(String[] values) {
        if (!validArgNum(values) || !validNum(values)) {
            System.out.println(INVALID_MSG);
            return false;
        }
        return true;
    }

    public Integer[] prepareArgs(String[] values) {
        return null;
    }

    private boolean validNum(String[] values) {
        int temp;
        for (int i = 0; i < 2; i++) {
            try {
                temp = Integer.parseInt(values[i]);
                if (temp < 0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    private boolean validArgNum(String[] values) {
        if (values.length != 2) {
            return false;
        }
        return true;
    }
}
