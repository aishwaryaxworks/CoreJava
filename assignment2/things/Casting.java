package com.xworkz.assignment2.things;

public class Casting {
    public static void main(String[] args) {
        // Convert byte to other types
        byte byteValue = 50;
        int intValue1 = byteValue;
        long longValue1 = byteValue;
        short shortValue1 = byteValue;
        float floatValue1 = byteValue;
        double doubleValue1 = byteValue;
        char charValue1 = (char) byteValue;

        // Convert int to other types
        int intValue2 = 500;
        byte byteValue2 = (byte) intValue2;
        long longValue2 = intValue2;
        short shortValue2 = (short) intValue2;
        float floatValue2 = intValue2;
        double doubleValue2 = intValue2;
        char charValue2 = (char) intValue2;

        // Convert long to other types
        long longValue3 = 1234567890L;
        int intValue3 = (int) longValue3;
        byte byteValue3 = (byte) longValue3;
        short shortValue3 = (short) longValue3;
        float floatValue3 = longValue3;
        double doubleValue3 = longValue3;
        char charValue3 = (char) longValue3;

        // Convert short to other types
        short shortValue4 = 1000;
        int intValue4 = shortValue4;
        byte byteValue4 = (byte) shortValue4;
        long longValue4 = shortValue4;
        float floatValue4 = shortValue4;
        double doubleValue4 = shortValue4;
        char charValue4 = (char) shortValue4;

        // Convert float to other types
        float floatValue5 = 123.45f;
        int intValue5 = (int) floatValue5;
        byte byteValue5 = (byte) floatValue5;
        short shortValue5 = (short) floatValue5;
        long longValue5 = (long) floatValue5;
        double doubleValue5 = floatValue5;
        char charValue5 = (char) floatValue5;

        // Convert double to other types
        double doubleValue6 = 123.456;
        int intValue6 = (int) doubleValue6;
        byte byteValue6 = (byte) doubleValue6;
        short shortValue6 = (short) doubleValue6;
        float floatValue6 = (float) doubleValue6;
        long longValue6 = (long) doubleValue6;
        char charValue6 = (char) doubleValue6;

        // Convert char to other types
        char charValue7 = 'A';
        int intValue7 = charValue7;
        byte byteValue7 = (byte) charValue7;
        short shortValue7 = (short) charValue7;
        float floatValue7 = charValue7;
        double doubleValue7 = charValue7;
        long longValue7 = charValue7;

        // Printing results
        System.out.println("byte to int: " + intValue1);
        System.out.println("byte to long: " + longValue1);
        System.out.println("byte to short: " + shortValue1);
        System.out.println("byte to float: " + floatValue1);
        System.out.println("byte to double: " + doubleValue1);
        System.out.println("byte to char: " + charValue1);

        System.out.println("int to byte: " + byteValue2);
        System.out.println("int to long: " + longValue2);
        System.out.println("int to short: " + shortValue2);
        System.out.println("int to float: " + floatValue2);
        System.out.println("int to double: " + doubleValue2);
        System.out.println("int to char: " + charValue2);

        System.out.println("long to int: " + intValue3);
        System.out.println("long to byte: " + byteValue3);
        System.out.println("long to short: " + shortValue3);
        System.out.println("long to float: " + floatValue3);
        System.out.println("long to double: " + doubleValue3);
        System.out.println("long to char: " + charValue3);

        System.out.println("short to int: " + intValue4);
        System.out.println("short to byte: " + byteValue4);
        System.out.println("short to long: " + longValue4);
        System.out.println("short to float: " + floatValue4);
        System.out.println("short to double: " + doubleValue4);
        System.out.println("short to char: " + charValue4);

        System.out.println("float to int: " + intValue5);
        System.out.println("float to byte: " + byteValue5);
        System.out.println("float to short: " + shortValue5);
        System.out.println("float to long: " + longValue5);
        System.out.println("float to double: " + doubleValue5);
        System.out.println("float to char: " + charValue5);

        System.out.println("double to int: " + intValue6);
        System.out.println("double to byte: " + byteValue6);
        System.out.println("double to short: " + shortValue6);
        System.out.println("double to float: " + floatValue6);
        System.out.println("double to long: " + longValue6);
        System.out.println("double to char: " + charValue6);

        System.out.println("char to int: " + intValue7);
        System.out.println("char to byte: " + byteValue7);
        System.out.println("char to short: " + shortValue7);
        System.out.println("char to float: " + floatValue7);
        System.out.println("char to double: " + doubleValue7);
        System.out.println("char to long: " + longValue7);
    }
}

