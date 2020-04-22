package com.appnetics;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;

	int myMaxIntValue = Integer.MAX_VALUE;
	int myMinIntValue = Integer.MIN_VALUE;

        System.out.println("Integer Maximum value is " + myMaxIntValue);
        System.out.println("Integer Minimum value is " + myMinIntValue);

        System.out.println("Busted Maximum value is " + (myMaxIntValue + 1));
        System.out.println("Busted Minimum value is " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value is " + myMinByteValue);
        System.out.println("Byte Maximum Value is " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value is " + myMinShortValue);
        System.out.println("Short Maximum Value is " + myMaxShortValue);


        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value is " + myMinLongValue);
        System.out.println("Long Maximum Value is " + myMaxLongValue);

        long bigLongLiteravlValue = 2_147_483_647_234L ;
        System.out.println(bigLongLiteravlValue);

        int myTotal = (myMinIntValue / 2);

        byte newByteValue =(byte) (myMinByteValue / 2);

        short myNewShortValue =(short) (myMinShortValue / 2);

        byte anyValidByteNumber = 101;
        short anyValidShortNumber = 2015;
        int anyValidIntNumber = 134;
        long crazyLongNumber = 50000L + 10L * (anyValidByteNumber + anyValidIntNumber + anyValidShortNumber);

        System.out.println(crazyLongNumber);
    }
}
