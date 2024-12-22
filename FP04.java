import java.util.Arrays;
import java.util.List;

public class FP04 {

    private static int sum(int a,int b){
        System.out.println(a+" "+b);
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Reduce in Streams");
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        System.out.println("Sum of length of each course");
        int ans=courses.stream()
                .map(course->course.length())
                .reduce(0,FP04::sum);
        //Converting it to more advance stuff
        System.out.println(ans);
        ans=courses.stream()
                .map(course->course.length())
                .reduce(0,(x,y)->x+y);
        System.out.println("Using lambda expression "+ans);


        System.out.println("Find Maximum Length");
        int maximum=courses.stream()
                .map(course->course.length())
                .reduce(0,(x,y)-> x>y?x:y);
        System.out.println("Maximum Number "+ maximum);


        List<Integer> myList = Arrays.asList(1,2,3,5,6,3,2,5,13,3,2,2,4);
        System.out.println("Cube every number in a list and find the sum of cubes");
        int sumCube = myList.stream().filter(n->n%2==1).
                map(n-> (int)Math.pow(n,3)).reduce(0,(x,y)->x+y);
        System.out.println("Sum of Cubes  "+ sumCube);
    }
}

