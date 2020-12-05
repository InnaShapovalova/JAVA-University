import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestVariant12 {


    @Test(dataProvider = "integerProvider")
    public void inputTest(int p1, int p3) {
        assertEquals(new lab0.Variant12().integerNumbersTask(p1), p3);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][]{{12, 21}, {34, 43}, {89, 98}, {16, 61}, {46, 64}};
    }

    //--------------------------------------------------------------------------------

    @Test(dataProvider = "booleanProvider")
    public void boolTest(int p1, int p2,int p3) {
        assertTrue(new lab0.Variant12().booleanTask(p1, p2,p3));
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][]{{1379, 97,1}, {-37, 63,2}, {31, 11,3}, {17, -71,4}, {101, 1,5}};
    }
    //-----------------------------------------------------------------------------------------

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1,int p2,int p3, int output) {
        assertEquals(new lab0.Variant12().ifTask(p1,p2,p3),output);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{12, 21,44,12}, {34, 55,43,34}, {89, 98,1,1}, {-16, 61,2,-16}};
    }
//------------------------------------------------------------------------------------------------

    @Test(dataProvider = "switchProvider")
    public void switchTest(int variant, double num, lab0.Variant12.Circle out) {
        assertEquals(new lab0.Variant12().switchTask(variant, num ),out);
    }

    @DataProvider Object[][] switchProvider() {
        lab0.Variant12.Circle out1 = new lab0.Variant12.Circle(1,2,6.28,3.14);

        lab0.Variant12.Circle out2 = new lab0.Variant12.Circle(1,2,6.28,6.28);

        lab0.Variant12.Circle out3 = new lab0.Variant12.Circle(1,2,6.28,6.28);

        lab0.Variant12.Circle out4 = new lab0.Variant12.Circle(1,2,6.28,6.28);

        return new Object[][]{{1,1, out1}, {2,2, out2}, {3,6.28, out3}, {4,6.28, out4}};
    }
    //-------------------------------------------------------------------------------------
    @Test(dataProvider = "forProvider")
    public void forTest(int p1, double p2) {
        assertEquals(new lab0.Variant12().forTask(p1), p2);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{{1, 1}, {2, 1.1}, {3, 1.32}};
    }
    //---------------------------------------------------------------------------------------

    @Test(dataProvider = "whileProvider")
    public void whileTest(int p1, int p2) {
        assertEquals(new lab0.Variant12().whileTask(p1), p2);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]{{3, 2}, {5, 2}, {6, 3}, {8, 3}};
    }

    //----------------------------------------------------------------------------------------------

    @Test(dataProvider = "minmaxProvider")
    public void minmaxTest(int[] ar, int p2) {
        assertEquals(new lab0.Variant12().minmaxTask(ar), p2);
    }

    @DataProvider
    public Object[][] minmaxProvider(){
    int[] ar1 = new int[] {2, 3, 2, 5, 2};
    int[] ar2 = new int[] {6, 5, 7, 10, 11, 5, 5, 7, 6};
    int[] ar3 = new int[] {5, 5, -3, -3, 3, 0, 2};
    int[] ar4 = new int[] {1, 1, 1, 1, 1};

    return new Object[][]{{ar1, 2}, {ar2, 5}, {ar3, 2}, {ar4, 1}};
    }

    //-------------------------------------------------------------------------------------------------
    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int[] inputArr, lab0.Variant12.ArrayClass output) {
        assertTrue(new lab0.Variant12().arrayTask(inputArr).equals(output));
    }

    @DataProvider Object[][] arrayProvider() {
        lab0.Variant12.ArrayClass output1 = new lab0.Variant12.ArrayClass( new int[] {2,1,10});
        lab0.Variant12.ArrayClass output2 = new lab0.Variant12.ArrayClass( new int[] {-1,-4,4});

        int[] arr1 = new int[] {2, 4, 1, 6, 10};
        int[] arr2 = new int[] {-1, 2, -4, -5,4};

        return new Object[][]{{arr1, output1}, {arr2, output2}};
    }
    //-----------------------------------------------------------------------------


    @Test(dataProvider = "matrixTaskProvider")
    public void matrixTaskTest(int[][] matrix, int[] expected) {
        lab0.Variant12 item = new lab0.Variant12();
        int[] actual = item.matrixTask(matrix);
        for (int i = 0; i < matrix.length; i++) {
            assertEquals(actual[i],expected[i]);
        }
    }

    @DataProvider
    public Object[][] matrixTaskProvider() {
        int[][] input1 = new int[][] {
                {-2, 3, -6},
                {-4, 2, -1},
                {-34, 98, -9},
                {-98, 8, -1}};


        int[] output1 = new int[] {-2,-4,-34,-98,8,98,2,3,-6,-1,-9,-1};
        return new Object[][]{{ input1,output1}};
    }



}
