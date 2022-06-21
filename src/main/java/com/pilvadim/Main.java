package main.java.com.pilvadim;

import java.util.Arrays;

import static main.java.com.pilvadim.parsers.OptionsChecker.listAllOptions;
import static main.java.com.pilvadim.parsers.Parser.parse;

public class Main {

    public static void main(String[] args) {
        String[] input = {"1,3-5", "2", "3-4"};
        int[][] result = listAllOptions( parse( input ) );
        for (int[] r:result)
            System.out.println(Arrays.toString(r));
    }

}
