public class _05_Operators {
    public static void main(String[] args) {
        int a = 40;
        int b = 12;
        System.out.println("+= operator " + (a += 5));  // will increase the value of var a by 5
        System.out.println("a % b will give reminder " + (a % b));  // also give modulo operator give remider
        System.out.println("comperision operaor ==" + (a == b)); // comparison operators  // return true or false

        // Logical operators

        System.out.println(a > b && b > 90); // will give true when both are true
        System.out.println(a > b || b > 90);  // true return if anyone is true

    }
}
