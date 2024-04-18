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
//            int num = random.nextInt(left, right);
            int num = random.nextInt(right - left) + left;
            stringBuilder.append((char) num);
        }
        return stringBuilder.toString();
    }


    public static String[] transformStringArray(String[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int endOfString = random.nextInt(4);
//            array[i] = array[i].substring(0, endOfString); //TODO
        }
        return array;
    }
}
