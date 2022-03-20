import java.util.Scanner;

public class _02_Taking_Input {
    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);

        System.out.println("Enter the number");

        int num1 = A.nextInt();  //take integer only
        System.out.println("Enter the second number");

        float num2 = A.nextFloat(); // take floating number only

        System.out.println("the sum of both number is " + (num1 + num2));

        System.out.println("enter your name with surname ");
        String name =A.next();  // will take only first word
        System.out.println("YOUR FULL NAME IS "+ name);

    }
}
