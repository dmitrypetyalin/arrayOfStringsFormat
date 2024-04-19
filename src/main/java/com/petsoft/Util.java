package com.petsoft;

import java.util.Random;

/**
 * @author PetSoft
 * @date 18.04.2024 23:22
 */
public class Util {
    public static String[] createStringArray(int length) {
        String[] strings = new String[length];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = genString();
        }
        return strings;
    }

    public static String genString() {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        int left = 32;
        int right = 126;
        int stringLength = random.nextInt(10);

        for (int i = 0; i < stringLength; i++) {
            int num = random.nextInt(right - left) + left;
            stringBuilder.append((char) num);
        }
        return stringBuilder.toString();
    }


    public static String[] transformStringArray(String[] array) {
        Random random = new Random();
        String[] newArray = new String[array.length / 3];
        int counter = 0;
        for (String string : array) {
            int size = string.length();
            String s = size > 3 ? string.substring(0, random.nextInt(4)) : string.substring(0, random.nextInt(size == 0 ? 1 : size));
            if (!s.isEmpty()) {
                try {
                    newArray[counter] = s;
                } catch (ArrayIndexOutOfBoundsException e) {
                    newArray = resizeArray(newArray, counter + 1);
                    newArray[counter] = s;
                }
                counter++;
            }
        }
        return newArray;
    }

    public static String[] resizeArray(String[] array, int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
