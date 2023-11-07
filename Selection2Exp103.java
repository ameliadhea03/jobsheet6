import java.util.Scanner;

/**
 * Selection2Exp103
 */
public class Selection2Exp103 {

    public static void main(String[] args) {
        Scanner input03 = new Scanner (System.in);
        System.out.println("Input year");
        int year =input03.nextInt();

        if ((year % 4) == 0) {
            if ((year % 100) !=0)
            System.out.println("Leap Year");
        } else
        System.out.println("Not a leap year");
    
        }
    }
