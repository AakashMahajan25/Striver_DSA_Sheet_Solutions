import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Character c = input.charAt(0);

        if (c>'A' && c<'Z') {
            System.out.println(1);
        } else if (c>'a' && c<'z') {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
        
    }
}