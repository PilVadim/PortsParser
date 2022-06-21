package com.test;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private final static String COMMA = ",";
    private final static String DASH = "-";

    public static int[][] parse( String[] input ){

        int[][] result = new int[ input.length ][];

        int i = 0;
        for (String s:input)
            result[i++] = parseString(s);

        return result;

    }

    public static int[] parseString( String input ){

        String[] templates = input.split( COMMA );
        List<Integer> result = new ArrayList<>();

        for ( String temp:templates ){
            if ( temp.contains("-") )
                result.addAll( parseRange(temp) );
            else
                result.add( Integer.parseInt(temp) );
        }

        return result
                .stream()
                .mapToInt(i->i)
                .toArray();

    }

    private static List<Integer> parseRange(String temp) {

        List<Integer> result = new ArrayList<>();

        if (temp.indexOf( DASH ) != temp.lastIndexOf( DASH )){
            throw new RuntimeException( "Wrong range:" + temp );
        }

        String[] borders = temp.split( DASH );
        int left = Integer.parseInt( borders[0] );
        int right = Integer.parseInt( borders[1] );

        int length = right - left + 1;
        if ( length <= 0 )
            throw new RuntimeException("Wrong range:" + temp);

        for ( int i = left; i <= right; i++ )
            result.add( i );

        return result;

    }

}
