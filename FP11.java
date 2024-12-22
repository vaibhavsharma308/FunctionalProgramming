/*
Analysis around
    Bi predicate
    Bi function
    BiConsumer
*/

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class FP11 {
    public static void main(String[] args) {
        BiPredicate<Boolean, Boolean> andGate =(x, y)-> x&&y;
        if (andGate.test(true,false)){
            System.out.println("Result is True");
        }else{
            System.out.println("Result is False");
        }

        BiConsumer<Integer,String> printNumbers =(x,y)->{
            System.out.println(x+" "+y);
        };

    }
}
