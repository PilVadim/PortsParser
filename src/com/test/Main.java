package com.test;

import java.util.Arrays;

import static com.test.OptionsChecker.listAllOptions;
import static com.test.Parser.parse;

public class Main {

    public static void main(String[] args) {
        String[] input = {"1,3-5", "2", "3-4"};
        int[][] result = listAllOptions( parse( input ) );
        for (int[] r:result)
            System.out.println(Arrays.toString(r));
    }

}
