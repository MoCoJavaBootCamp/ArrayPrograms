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
                case 3:
                    sumsOf13();
                    break;
                case 4:
                    evenOddOccurrences();
                    break;
                case 5:
                    parseString();
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
        System.out.println("Welcome to Reverse String.");
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
        System.out.println("Welcome to Remove Duplicates.");
        int num[] = new int[10];
        int numLen = 10;

        //assign input to array
        for (int i = 0; i < 10; i += 1) {
            System.out.printf("Enter an integer (%d/10)\n", i + 1);
            num[i] = input.nextInt();
        }
        // check duplicates, if found, reassign current with end and decrease length, decrement j
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
    public static void sumsOf13() {
        System.out.println("Welcome to Sums of 13");
        // initialize arrays
        int[] arr1 = {1,7,6,5,9};
        int[] arr2 = {2,7,6,3,4};
        int len = 5;
        String pairs = "";
        // loop over both to find sums of 13
        // if true, add to string
        for (int i = 0; i < len; i += 1) {
            for (int j = 0; j < len; j += 1) {
                if (arr1[i] + arr2[j] == 13) {
                    pairs += arr1[i] + ", " + arr2[j] + "\n";
                }
            }
        }
        System.out.println("Pairs that sum to 13:\n" + pairs);
    }
    //4. Prompt the user to input 10 values and store them into an array.
    // Output the total number of odd and even values in the array.
    public static void evenOddOccurrences() {
        System.out.println("Welcome to Even and Odd Occurrences.");
        Scanner input = new Scanner(System.in);
        int num[] = new int[10];
        int oddCount = 0;
        int evenCount = 0;

        //assign input to array
        for (int i = 0; i < 10; i += 1) {
            System.out.printf("Enter an integer (%d/10)\n", i + 1);
            num[i] = input.nextInt();
            // check if even or odd
            if (num[i] % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }

        System.out.printf("Even occurrences: %d\n" +
                "Odd occurrences: %d\n", evenCount, oddCount);
    }
    //5. Prompt the user to input one line of a string.
    // Parse the string into a word, print out the word and length of the word.
    // Assume that the maximum size of a line is 132.
    // prompt user to enter string
    // split string
    // loop over split string and print length per word
    public static void parseString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Parse String.");
        System.out.println("Enter a string to parse (max 132 characters):");
        String str = input.nextLine();
        String[] strSplit = str.split(" ");
        System.out.println("You entered " + str);

        for (String s : strSplit) {
            System.out.printf("%s has %d character(s)\n", s, strSplit.length);
        }
    }
}
