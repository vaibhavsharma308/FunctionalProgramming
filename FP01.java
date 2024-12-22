import java.util.List;
import java.util.Arrays;

public class FP01 {

        private static void print(int x){
            System.out.print(x+" ");
            return ;
        }
        private static boolean checkEven(int n){
            return n % 2 == 0;
        }
        public static void main(String []args){


            List<Integer> myList = Arrays.asList(1,2,3,4,5,6,67,8,89);
            myList.stream().filter(FP01::checkEven)
                    .forEach(FP01::print);
        }
}
