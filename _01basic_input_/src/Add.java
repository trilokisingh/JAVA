import java.util.Scanner;
public class Add {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int num1,num2;
        System.out.println("enter the first number");
        num1 = obj.nextInt();
        System.out.println("enter the second number");
        num2 = obj.nextInt();
        System.out.println("THE SUM IS = " + num1+num2);
    }
}
