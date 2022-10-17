import java.util.Arrays;
import java.util.Comparator;
public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6,"red",false);
        circles[1] = new Circle(1.2,"blue",true);
        circles[2] =  new Circle(2.3,"black", true);

        System.out.println("Pre - Sorted");
        for(Circle circle : circles){
            System.out.println(circle);
        }
        CircleComparator circleCompatator = new CircleComparator();
        Arrays.sort(circles, circleCompatator);
        System.out.println("After - Sorted");
        for(Circle circle: circles){
            System.out.println(circle);
        }


    }
}
