import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Course{
    private int courseId ;
    private String courseName;
    private double coursePrice;

    public Course(int courseId, String courseName, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public double getCoursePrice() {
        return coursePrice;
    }
}
public class FP12 {
    public static void main(String[] args) {
        System.out.println("Using Class under Streams and Lambdas");
        List<Course> courses = Arrays.asList(
                new Course(101, "Java Programming", 199.99),
                new Course(102, "Python for Data Science", 249.49),
                new Course(103, "Web Development Bootcamp", 299.99),
                new Course(104, "Machine Learning Basics", 349.89),
                new Course(105, "Mobile App Development", 399.00),
                new Course(106, "Cloud Computing Fundamentals", 279.59)
        );

    }


}
