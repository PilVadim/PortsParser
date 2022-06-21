package test.java.com.pilvadim;

public class Templates {

    //{"1,3-5", "2", "3-4"}
    static int[][] getMainIntRange() {
        int[][] temp = new int[3][];

        int[] arr1 = {1,3,4,5};
        int[] arr2 = {2};
        int[] arr3 = {3,4};

        temp[0] = arr1;
        temp[1] = arr2;
        temp[2] = arr3;

        return temp;
    }

    static int[][] getMainIntResult() {
        int[][] temp = new int[8][];

        int[] arr0 = {1, 2, 3};
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {3, 2, 3};
        int[] arr3 = {3, 2, 4};
        int[] arr4 = {4, 2, 3};
        int[] arr5 = {4, 2, 4};
        int[] arr6 = {5, 2, 3};
        int[] arr7 = {5, 2, 4};

        temp[0] = arr0;
        temp[1] = arr1;
        temp[2] = arr2;
        temp[3] = arr3;
        temp[4] = arr4;
        temp[5] = arr5;
        temp[6] = arr6;
        temp[7] = arr7;

        return temp;
    }

    //{"1"}
    static int[][] get1IntRange() {
        int[][] temp = new int[1][];
        int[] arr1 = {1};
        temp[0] = arr1;
        return temp;
    }

    static int[][] get1IntResult() {
        int[][] temp = new int[1][];
        int[] arr0 = {1};
        temp[0] = arr0;
        return temp;

    }

}
