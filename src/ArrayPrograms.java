import java.util.Scanner;
import java.util.Arrays;

public class ArrayPrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ID;

        do {
            System.out.println("Enter a program number or 0 to quit.\n" +
            "1 - Reverse String\n");
            ID = input.nextInt();


            switch (ID) {
                case 1:
                    reverseString();
                    break;
                default:
                    System.out.println("Goodbye!");
                    System.exit(1);
            }

        } while (ID != 0);
    }
    //1. Reverse String
    public static void reverseString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to reverse.");
        String str = input.nextLine();
        char[] chArr = str.toCharArray();
        String reversedStr;
        int length = str.length();
        int leftIdx = 0;
        int rightIdx = length - 1;
        int mid = (int) Math.floor((length - 1) / 2);

        for (; leftIdx < mid; rightIdx -= 1, leftIdx += 1) {
            char temp = chArr[rightIdx];
            chArr[rightIdx] = chArr[leftIdx];
            chArr[leftIdx] = temp;
        }

        reversedStr = String.valueOf(chArr);
        System.out.printf("'%s' reversed is '%s'.\n", str, reversedStr);
    }
}
