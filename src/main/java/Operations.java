public class Operations {

    public static double divide(int numerator, int denominator){
        float result = numerator / denominator;
        return result;
    };

    public static double add (int addend1, int addend2 ){
        int result = addend1 + addend2 ;
        return result;
    }

    public static double subtract(int minuend, int subtrahend ){
        int result = minuend - subtrahend ;
        return result;
    }

    public static double multiply(int multiplicand, int multiplier){
        int result = multiplicand * multiplier ;
        return result;
    }

    public static double squareroot(int int1){
        double result = Math.pow(int1,2);
        return result;
    }


}
