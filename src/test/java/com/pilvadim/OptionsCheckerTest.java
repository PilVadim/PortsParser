package test.java.com.pilvadim;

import org.junit.jupiter.api.Test;

import static main.java.com.pilvadim.parsers.OptionsChecker.listAllOptions;
import static org.junit.jupiter.api.Assertions.*;
import static test.java.com.pilvadim.Templates.*;

class OptionsCheckerTest {

    @Test
    void listAllOptionsMainTest() {

        int[][] temp = getMainIntRange();
        int[][] result = listAllOptions( temp );
        int[][] expect = getMainIntResult();
        for (int i = 0; i < result.length; i++ )
            assertArrayEquals( expect[i], result[i] );

    }

    @Test
    void listAllOptions1Test() {

        int[][] temp = get1IntRange();
        int[][] result = listAllOptions( temp );
        int[][] expect = get1IntResult();
        for (int i = 0; i < result.length; i++ )
            assertArrayEquals( expect[i], result[i] );

    }

}