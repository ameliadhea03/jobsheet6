import java.util.Scanner;

/**
 * Selection2Exp203
 */
public class Selection2Exp203 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.println("Input angle");
        System.out.println("Input angle1: ");
        float angle1 = input03.nextFloat();
        System.out.println("Input angle2: ");
        float angle2 = input03.nextFloat();
        System.out.println("Input angl3: ");
        float angle3 = input03.nextFloat();
        float totalAngle;

        totalAngle = angle1 + angle2 + angle3;

        if(totalAngle == 180) {
            if((angle1 == 90) || (angle2 == 90) || (angle3 == 90))
                System.out.println("Right triangle");
            else
                System.out.println("Not a right triangle");     
        } else
            System.out.println("Not a right triangle");
        }
}
