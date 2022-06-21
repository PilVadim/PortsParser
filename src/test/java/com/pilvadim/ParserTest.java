package test.java.com.pilvadim;

import main.java.com.pilvadim.parsers.Parser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static test.java.com.pilvadim.Templates.*;

class ParserTest {

    @Test
    void parseTestMain() {

        int[][] temp = getMainIntRange();

        String[] input = {"1,3-5", "2", "3-4"};
        int[][] result = Parser.parse(input);

        for (int i = 0; i < result.length; i++ )
            assertArrayEquals( temp[i], result[i] );

    }

    @Test
    void parseTest1() {

        int[][] temp = get1IntRange();
        String[] input = {"1"};

        int[][] result = Parser.parse(input);

        for (int i = 0; i < result.length; i++ )
            assertArrayEquals( temp[i], result[i] );

    }
    @Test
    void parseTest500() {

        int[][] temp = get500IntRange();
        String[] input = {"1-500"};

        int[][] result = Parser.parse(input);

        for (int i = 0; i < result.length; i++ )
            assertArrayEquals( temp[i], result[i] );

    }

    @Test
    void parseTestEmpty() {

        int[][] temp = get500IntRange();
        String[] input = {"a-i"};
        try {
            Parser.parse(input);
        } catch (RuntimeException e){
            assertEquals( e.getMessage(), "For input string: \"a\"");
        }

    }

}