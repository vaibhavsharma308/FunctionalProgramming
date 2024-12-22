import java.util.List;

public class StreamRevision1
{

    public static void printAllNumber(List<Integer> nums){
        for(int number :nums){
            System.out.println(number);
        }
        return ;


    }
    public static void main(String []args){
        System.out.println("Hey !! Stream Revision");
        System.out.println( "Structured Programming");
        List<Integer> nums = List.of(1,2,3,90,23,431,13,4,23,4);
        nums.stream().forEach(System.out::print);
        nums.stream().
//      printAllNumber(nums);
    }
}


git remote -v
