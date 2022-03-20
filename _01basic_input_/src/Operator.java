import java.util.Scanner;
public class Operator {
    public static void main(String[]args){
        Scanner ob = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter the first number");
        num1 = ob.nextInt();
        System.out.println("enter the second number");
        num2 = ob.nextInt();
        System.out.println("The value of operation  num1%num2 is "+(num1%num2));
        System.out.println("The value of operation   num1/num2 is "+ (double)(num1/num2) );  //(double will change the value in floating point
        System.out.println("The value of operation   is num1**num2 "+ (num1*num2) );
        System.out.println("The value of operation   is "+  num1*4);
        System.out.println("The value of operation   is "+  num2*2);
    }
}
