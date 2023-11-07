import java.util.Scanner;

public class Selection2Exp203_1{
    public static void main(String[] args) {

        Scanner input03 = new Scanner(System.in);
        System.out.print("Input Angle 1 : ");
        float angle1 = input03.nextInt();
        System.out.print("Input Angle 2 : ");
        float angle2 = input03.nextInt();
        System.out.print("Input Angle 3 : ");
        float angle3 = input03.nextInt();
        
        float totalangle;
        
        totalangle = angle1 + angle2 + angle3;
    if (totalangle == 180){
        if ((angle1 == 90) || (angle2 == 90) || (angle3 == 90)){
            System.out.println("Right triangle ");
        }else if  ((angle1 == 60) && (angle2 == 60) && (angle3 == 60)){
            System.out.println("Right equilateral triangle");
        }else if ((angle1 == angle2) || (angle2 == angle3) || (angle1 == angle3)){
            System.out.println("Right isosceles triangle"); 
        }
    }else{ 
        System.out.println("Not a triangle");
    }

}
}
