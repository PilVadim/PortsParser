package main.java.com.pilvadim;

import java.util.Arrays;
import java.util.Scanner;

import static main.java.com.pilvadim.parsers.OptionsChecker.listAllOptions;
import static main.java.com.pilvadim.parsers.Parser.parse;

public class Main {

    public static void main(String[] args) {

        String[] inputArr = {"1,3-5", "2", "3-4"};

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        if ( ! input.isEmpty() )
            inputArr = input.split(", ");

        for (int i = 0; i < inputArr.length; i++)
            inputArr[i] = inputArr[i].replace("\"","");

        s.close();

        int[][] result = listAllOptions( parse( inputArr ) );

        for (int[] r:result)
            System.out.println(Arrays.toString(r));

    }

}
