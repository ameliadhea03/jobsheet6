import java.util.Scanner;

/**
 * Selection2Exp303
 */
public class Selection2Exp303 {

    public static void main(String[] args) {
        Scanner Input03 = new Scanner (System.in);
        String category;
        int income, netSalery;
        double tax = 0;

        System.out.print("Input category : ");
        category = Input03.nextLine();
        System.out.print("Input income : ");
        income = Input03.nextInt();

        if (category.equalsIgnoreCase("worker")) {
            if (income <= 2000000)
                tax = 0.1;
            else if (income <= 3000000)
                tax = 0.15;
            else
                tax = 0.2;
            netSalery = (int) (income - (tax * income));
            System.out.print("Net Salery : " + netSalery);
            } else if (category.equalsIgnoreCase("businessman")) {
            if (income <= 2500000)
                tax = 0.15;
            else if (income <= 350000)
                tax = 0.2;
            else
                tax = 0.25;
            netSalery = (int) (income - (tax * income));
            System.out.print("Net Salery : " + netSalery);
        } 
        else {
            System.out.println("Invalid category!");}
}
}

