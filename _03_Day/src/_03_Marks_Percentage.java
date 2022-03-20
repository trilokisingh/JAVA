import java.util.Scanner;
public class _03_Marks_Percentage {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        float total = 500;
        float sub1, sub2, sub3, sub4, sub5;

        System.out.println("Enter the first subject marks");
        sub1 = m.nextFloat();
        System.out.println("Enter the second subject marks");
        sub2 = m.nextFloat();
        System.out.println("Enter the third subject marks");
        sub3 = m.nextFloat();
        System.out.println("Enter the fourth subject marks");
        sub4 = m.nextFloat();
        System.out.println("Enter the fifth subject marks");
        sub5 = m.nextFloat();

        float sum = (sub1+sub2+sub3+sub4+sub5);

       float percentage = (100*sum)/total;
        System.out.println("the percentage is "+percentage+" %");



    }
}
