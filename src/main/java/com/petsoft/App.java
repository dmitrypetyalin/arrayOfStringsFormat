package com.petsoft;

import java.util.Arrays;

/**
 * @author PetSoft
 * @date 18.04.2024 23:22
 */
public class App {
    public static void main(String[] args) {
        String[] array = Util.createStringArray(15);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Util.transformStringArray(array)));
    }
}
