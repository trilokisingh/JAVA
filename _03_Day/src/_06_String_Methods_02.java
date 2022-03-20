import java.util.Locale;

public class _06_String_Methods_02 {
    public static void main(String[] args) {
        String name = "Love by Code_x";
        System.out.println(name);
        int leanth = name.length();  // give the leangth
        System.out.println(leanth);
        String upper = name.toUpperCase();  // change in upper case
        System.out.println(upper);
        String lower = name.toLowerCase();
        System.out.println(lower);

        String name2 = "     codex  devill     ";

        String trimmed = name2.trim();   //remove all the spaces back abd front side
        System.out.println(trimmed);


        System.out.println(name.substring(2)); // from the index 2 print all the string
        System.out.println(name.substring(2,7)); // start from 2 and stop before 7 // 2 inclusive 7 exclusive
        String replaced = name.replace("Love","Hate");  // replace
        System.out.println(replaced);
        System.out.println(name.startsWith("Love"));
        System.out.println(name.endsWith("you"));
        System.out.println(name.charAt(3));   // check at index 3 and return
        System.out.println(name2.indexOf('d'));//will return where d is occurring first time  //if not found than return -1
        System.out.println(name2.indexOf('d',8));  // will start searching after index 8
        System.out.println(name2.lastIndexOf(name2));  // return the last index of string
        System.out.println(name.equals(name2)); // will check is name and name2 are equal string
        System.out.println(name.equalsIgnoreCase("love by code_x")); // will check string are equal or not
        // by ignoring the cases
    }
}
