// we will see either user enter integer or not

import java.util.Scanner;
public class _04_IsInteger {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number");
        //int Num = n.nextInt();
        System.out.println(n.hasNextInt());  //n.hasInt() will check is it integer or not
    }
}
