import java.util.Scanner;
import java.util.Arrays;

public class ArrayPrograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ID;

        do {
            System.out.println("Enter a program number or 0 to quit.\n" +
            "1 - Reverse String\n" +
            "2 - Remove Duplicates\n" +
            "3 - Find Pairs Summing to 13\n" +
            "4 - Count Even and Odd Occurrences\n" +
            "5 - Parse String\n");
            ID = input.nextInt();


            switch (ID) {
                case 1:
                    reverseString();
                    break;
                case 2:
                    removeDuplicates();
                    break;
//                case 3:
//                    sumsOf13();
//                    break;
//                case 4:
//                    evenOddOccurrences();
//                    break;
//                case 5:
//                    parseString();
//                    break;
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
    //2. Prompt the user to input 10 integer values and store them into an array.
    // If there are any duplicate values in that array, remove them and print out the remaining values.
    public static void removeDuplicates() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Remove Duplicates. ");
        int num[] = new int[10];
        int numLen = 10;

        //assign input to array
        for (int i = 0; i < 10; i += 1) {
            System.out.printf("Enter an integer (%d/10)\n", i + 1);
            num[i] = input.nextInt();
        }
        // check duplicates, if found, reassign current with end and decrease length
        for (int i = 0; i < numLen; i += 1) {
            for (int j = i + 1; j < numLen; j += 1) {
                if (num[i] == num[j]) {
                    num[j] = num[numLen - 1];
                    numLen -= 1;
                    j -= 1;
                }
            }
        }
        // create new array
        int[] removedNums = new int[numLen];
        // copy old array into new array
        System.arraycopy(num, 0, removedNums, 0, numLen);

        System.out.println(Arrays.toString(removedNums));
    }
    //3. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
    // Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
    //4. Prompt the user to input 10 values and store them into an array.
    // Output the total number of odd and even values in the array.
    //5. Prompt the user to input one line of a string.
    // Parse the string into a word, print out the word and length of the word.
    // Assume that the maximum size of a line is 132.

}
