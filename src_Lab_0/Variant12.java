package lab0;

public class Variant12 {

    public static class Circle {

        public double radius;
        public double diameter;
        public double length;
        public double square;

        public Circle(double r, double d, double l, double s) {
                this.radius = r;
                this.diameter = d;
                this.diameter = l;
                this.square = s;
            }

        public boolean equals(Circle circle) {
                return this.diameter == circle.diameter && this.diameter == circle.diameter && this.square == circle.square && this.length == circle.length;
        }
    }
    public static class ArrayClass {
        public int[] array;

        public ArrayClass(int[] array) {
            this.array = new int[array.length];
            //System.arraycopy(array, 0, this.array, 0, array.length - 1 );
        }

        public boolean equals(ArrayClass elem) {
            for (int i = 0; i < this.array.length && i < elem.array.length; i++) {
                if (this.array[i] != elem.array[i]){
                    return false;}
            }
            return true;
        }
    }
    /**
     * @param k is square side
     * @return perimeter
     */
    public int inputOutputTask(int k) {
        return 0;
    }

    /**
     * @param k is 3-digit number
     * @return inverse 3-digit number
     */

    public int integerNumbersTask(int k) {
        int number = k % 10;
        k /= 10;
        number *= 10;
        number += k;
        return number;
    }

    /**
     * @param parameter are 3 whole numbers
     * @return true, if every number is positive
     */
    public boolean booleanTask(int number1, int number2, int number3 ) {
        if ( number1 > 0 && number2 > 0 && number3 > 0 ){
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * @param parameter are 3 whole numbers
     * @return smallest number
     */
    public int ifTask(int num1, int num2, int num3) {
        if ( num1 < num2 && num1 < num3 ){
            return num1;
        }
        if ( num2 < num1 && num2 < num3 ){
            return num2;
        }
        if ( num3 < num1 && num3 < num2 ){
            return num3;
        }
        return 1;
    }


    /**
     * @param number1 Элементы окружности пронумерованы следующим образом: 1 — радиус R, 2 — диаметр D=2*R, 3 — длина L=2*π*R, 4 — площадь круга S =π*R2. Дан номер одного из этих элементов и его значение. Вывести значения остальных элементов данной окружности (в том же порядке). В качестве значения π использовать 3.14.
     * @return day of week day represented number1
     */
    public Circle switchTask(int var, double x) {
        double r,d,l,s;
        switch (var) {
            case 1:
                d = 2 * x;
                l = 2 * 3.14 * x;
                s = 3.14 * x * x;
                return new Circle(x,d,l,s);
            case 2:
                r = x / 2;
                l = 2 * 3.14 * r;
                s = 3.14 * r * r;
                return new Circle(r,x,l,s);
            case 3:
                r = x / 2 / 3.14;
                d = 2 * r;
                s = 3.14 * r * r;
                return new Circle(r,d,x,s);
            case 4:
                r = Math.sqrt(x / 3.14);
                d = 2 * r;
                l = 2 * 3.14 * r;
                return new Circle(r,d,l,x);
        }
        return new Circle(1,1,1,1);
    }


    /**
     * @param n is integer number
     * @return product of factors
     */
    public double forTask(int n) {
        assert n > 0 : "Argument should be more than zero";
        double rez = 1;
        for ( int i = 1; i < n; i ++) {
            rez = rez * (1 + 0.1 * i);
        }
        return rez;
    }

    /**
     * @param n Дано целое число N(>1). Вывести наибольшее из целых чисел k, для которых сумма 1+2+...+k будет меньше или равна N, и саму эту сумму.
     * @return product of factors
     */

    public int whileTask(int n) {
        assert (n > 1) : "Argument should be more than 1";
        int k = 1;
        double f = 1;
        while ( f <= n ){
            f = f * k;
            k ++;
        }
        return k - 2;
    }
    /**
     * @param array length n
     * @return the smallest positive number else 0
     */
    public int minmaxTask(int[] array) {
        int positive = 0;
        boolean flag = false;
        int i = 0;
        while ( flag == false ){    //while positive == 0
            if ( array[i] > 0 ){
                positive = array[i];
                flag = true;
            }
            i ++;
        }
        if ( flag == false ){   //positive == 0 return 0
            return 0;
        }
        for ( int k = i - 1; k < array.length; k ++ ){
            if ( array[k] > 0 && array[k] <= positive ){
                positive = array[k];
            }
        }
        return positive;
    }

    /**
     * @param array
     * @return transformed array where row with even indexes
     * don't use if
     */
    public ArrayClass arrayTask(int[] array) {
        int[]newArray = new int[array.length];
        int k = 0;
        for ( int i = 0; i <= array.length; i += 2 ){
            newArray[k] = array[i];
            k =+ 1;
        }
        return new ArrayClass(newArray);
    }
    /**
     * @param array length n
     * @return the smallest positive number else 0
     */
    public int []matrixTask(int [][]matrix ) {

        int []result = new int[matrix.length];

        boolean sign = false, signal;
        int index1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            if ( sign = false ){
                for (int k = 0; k < matrix.length; k++) {
                    result[index1] = matrix[k][i];
                    index1 =+ 1;
                }
                signal = true;
            }
            if ( sign = true ){
                for (int k = matrix.length - 1; k >= 0; k--) {
                    result[index1] = matrix[k][i];
                    index1 =+ 1;
                }
                sign = false;
            }
            if ( signal = true ){
                sign = true;
            }
            signal = false;
        }
            return result;
    }


}

