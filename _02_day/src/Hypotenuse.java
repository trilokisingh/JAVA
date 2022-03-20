import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args){
        Scanner take = new Scanner(System.in);
        double lenth, height,hypotenuse;
        System.out.println("Enter the length of triangle ");
        lenth = take.nextDouble();
        System.out.println("Enter the height of triangle ");
        height = take.nextDouble();
        hypotenuse = Math.sqrt((lenth*lenth + height*height));
        System.out.println("The hypotenuse of tringle is "+ hypotenuse);

    }
}
