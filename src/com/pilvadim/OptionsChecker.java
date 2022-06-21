package com.pilvadim;

import java.util.ArrayList;
import java.util.List;

public class OptionsChecker {

    /**Finds all possible options of input integer ranges
     *
     * @param input - array of integer ranges
     * @return - all possible arrays made from integers from ranges
     */

    public static int[][] listAllOptions( int[][] input ){

        List<int[]> result = new ArrayList<>();

        numberSpinner( input,
                0,
                new int[input.length],
                result );

        int[][] arrResult = new int[result.size()][];

        for (int i = 0; i < result.size(); i++ )
            arrResult[i] = result.get(i);

        return arrResult;

    }

    private static void numberSpinner( int[][] input, Integer position, int[] tempArray, List<int[]> result ){

        for ( int num : input[position] ){

            int[] temp = tempArray.clone() ;
            temp[ position ] = num;

            if ( position == input.length - 1 )
                result.add( temp );
            else
                numberSpinner( input, position + 1, temp, result );

        }

    }

}
