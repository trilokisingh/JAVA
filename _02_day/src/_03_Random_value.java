import java.util.Random;
public class _03_Random_value {
    public static void main(String [] args) {
        Random R = new Random();
        int x,y;
        x = R.nextInt(); // This method will take any random value by its own
        System.out.println("The random value is " + x);

        y = R.nextInt(4)+1; // This method will take random value bwn 1 to 5
        System.out.println("The random value is " + y);

    }
}
