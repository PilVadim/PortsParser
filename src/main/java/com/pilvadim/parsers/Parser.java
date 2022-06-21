package main.java.com.pilvadim.parsers;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private final static String COMMA = ",";
    private final static String DASH = "-";

    /**Parse string templates
     *
     * @param input array of String
     * @return array of arrays of integers
     */
    public static int[][] parse( String[] input ){

        int[][] result = new int[ input.length ][];

        int i = 0;
        for (String s:input)
            result[i++] = parseString(s);

        return result;

    }

    /**Parse template string
     * Example of input: 1,122-200
     * @param input - template as String
     * @return - array of integers from range
     */
    private static int[] parseString( String input ){

        String[] templates = input.split( COMMA );
        List<Integer> result = new ArrayList<>();

        for ( String temp:templates ){
            if ( temp.contains("-") )
                result.addAll( parseRange(temp) );
            else if (temp.matches("^[0-9]+$"))
                result.add( Integer.parseInt(temp) );
            else
                throw new RuntimeException("Number contains illegal symbols: " + temp);
        }

        return result
                .stream()
                .mapToInt(i->i)
                .toArray();

    }

    /**Parse range string
     * Example of input: 128-200
     * @param input - range as String
     * @return - List of integers from range
     */
    private static List<Integer> parseRange(String input) {

        List<Integer> result = new ArrayList<>();

        if (input.indexOf( DASH ) != input.lastIndexOf( DASH )){
            throw new RuntimeException( "Wrong range:" + input );
        }

        String[] borders = input.split( DASH );
        int left = Integer.parseInt( borders[0] );
        int right = Integer.parseInt( borders[1] );

        int length = right - left + 1;
        if ( length <= 0 )
            throw new RuntimeException("Wrong range:" + input);

        for ( int i = left; i <= right; i++ )
            result.add( i );

        return result;

    }

}
