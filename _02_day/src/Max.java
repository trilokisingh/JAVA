import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        Scanner A =new Scanner(System.in);
        float a,b;
        System.out.println("Enter the first number ");
        a = A.nextFloat();
        System.out.println("Enter the second number");
        b = A.nextFloat();

        float maximum = Math.max(a,b);
        System.out.println("the maximum number is " + maximum);  // will give the maximum number in btw
        double root =Math.sqrt(b);
        System.out.println("THe square root is "+ root);  // give the squarer
        float round_Value = Math.round(b);
         System.out.println("the round value is " + round_Value);  // will give the near value of decimal
    }
}
