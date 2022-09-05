public class Operations {

    public static double divide(float numerator, float denominator){
        float result = numerator / denominator;
        return result;
    }

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

    public static double sqrt(int int1){
        double result = Math.pow(int1,0.5);
        return result;
    }


}
