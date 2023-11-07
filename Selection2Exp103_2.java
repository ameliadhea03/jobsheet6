import java.util.Scanner;

public class Selection2Exp103_2 {
    
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.println("Input year: ");
        int year = input03.nextInt();
        if ((year % 4) == 0){
            if ((year % 100) != 0){
                System.out.println("Leap year");
            } else if ((year % 400) == 0){
                System.out.println("Leap year");
            } else if ((year % 100) == 0) {
                System.out.println("Not a leap year");
            }
        } else
            System.out.println("Not a leap year");
    }
}