import java.util.ArrayList;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number N (1 ≤ N ≤ 1000), the total number of records");
        int n = input.nextInt();
        System.out.println("Enter The subsequent N lines contain the record of each item splitted by space character (\" \"). The first string indicates the id of the item, the second string indicates the isValid variable, and the third string indicates the errorMessage if applicable.");
        input.nextLine();
        boolean allValid = true;
        ArrayList<String> errorCodes = new ArrayList<>(); //new array, errorCodes = []

        for (int i = 0; i < n; i++) {
            String[] record = input.nextLine().split(" "); //Read data from input file
            boolean isValid = Boolean.parseBoolean(record[1]);

            if (!isValid) {
                allValid = false;
                errorCodes.add(record[2]); //if record.isValid is not true: errorCodes append error message
            }
        }

        if (allValid) {
            System.out.println("Yes"); //if allValid is true: print "Yes"
        } else {
            System.out.println("No");
            System.out.println(String.join(" ", errorCodes)); //print "No"  print errorCodes sepearated by space character
        }
    }
}
