import java.util.Scanner;

public class _06_Strings {
    public static void main(String[] args) {


        //String greet = new String("lOve by Code_X");
        String greet = "Love by Code_x";  //Note:- strings are immutable
        System.out.println(greet);
        int a = 10;
        float b = 15.5254f;

        System.out.printf("the value of a and b are %d %f\n", a, b);  // same as c program
        System.out.printf(" L 2the value of a and b are %d %.2f\n", a, b);  // %.2f mean want 2 digits after decimal
        System.out.printf(" L 3the value of a and b are %d %10.3f\n", a, b);  // %10.3 mean total 10space must include and last
        // 3 digits after decimal


        System.out.format("the value of a and b are %d %f", a, b);  // same as c program

    }
}
