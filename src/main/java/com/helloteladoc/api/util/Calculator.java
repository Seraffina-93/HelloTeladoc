package com.helloteladoc.api.util;

public class Calculator {
    private String str1;
    private String str2;

    public Calculator(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }

    public static String addNumbers(String str1, String str2) {
        if (!isValidInput(str1) || !isValidInput(str2)) {
            return "Error: Invalid input";
        }

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = str1.length() - 1, j = str2.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int x = i >= 0 ? str1.charAt(i--) - '0' : 0;
            int y = j >= 0 ? str2.charAt(j--) - '0' : 0;
            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString().replaceAll("^0+", "");
    }

    private static boolean isValidInput(String input) {
        if (input == null || input.length() == 0) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }

        return true;
    }

}
