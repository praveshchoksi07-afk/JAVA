import java.util.*;
public class strings {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        char letter=str.charAt(7);
        System.out.println("Character at index 7: " + letter);
        int index=str.indexOf("World");
        System.out.println("Index of 'World': " + index);
        int index2=str.lastIndexOf("o");
        System.out.println("Last index of 'o': " + index2);
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);
        
        // Get length of the string
        int length = str.length();
        System.out.println("Length: " + length);
        
        // Check if string contains a substring
        boolean containsHello = str.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);
        
        // Replace a substring
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
        
        // Split the string
        String[] parts = str.split(", ");
        System.out.println("Split parts: " + Arrays.toString(parts));
        if(str.isEmpty()){
            System.out.println("The string is empty.");
        }
        else{
            System.out.println("The string is not empty.");
        }
        if(str.equalsIgnoreCase("hello, world!")){
            System.out.println("The strings are equal (case-insensitive).");
        }
        else{
            System.out.println("The strings are not equal (case-insensitive).");
        }
        String sub=str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + sub);
        
    }
}