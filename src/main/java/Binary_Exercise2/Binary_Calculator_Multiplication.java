package Binary_Exercise2;
import java.util.Arrays;
import java.util.Scanner;

public class Binary_Calculator_Multiplication {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the first number you want to");
        int numb1 = myObj.nextInt();  // Read user input
        System.out.println("Enter the second number");
        int numb2 = myObj.nextInt();  // Read user input
        System.out.println("  "  );
        System.out.println("First binary number " +  numb1 );  // Output user input
        System.out.println("Second binary number " +  numb2 );  // Output user input
        System.out.println("  "  );
        System.out.println("If you multiply them " );  // Output user input

        int lengthofnumb1 = String.valueOf(numb1).length();
        int lengthofnumb2 = String.valueOf(numb2).length();

        int arr[] = new int[lengthofnumb1 ];
        int arr2[] = new int[lengthofnumb2 ];


        final int columnSize = lengthofnumb1 + lengthofnumb2  - 1 ;
        final int rowSize = lengthofnumb2 ;

        // We create the specific size of the multiArr with the rowSize and columnSize +1
        int multiArr[][] = new int[rowSize][columnSize + 1];

//// This is the section where we separate the numb1 into single digits into an arr
        for (int i = lengthofnumb1 - 1; i >= 0; i--) {
            arr[i] = numb1 % 10; // store last digit
            numb1 = numb1 / 10; // chop  out last digit number
        }

//// This is the section where we separate the numb2 into single digits into an arr
        for (int l = lengthofnumb2 - 1; l >= 0; l--) {
            arr2[l] = numb2 % 10; // store last digit
            numb2 = numb2 / 10; // chop  out last digit number
        }

        // This is the section where we do the multiplication of arr and arr2 and we place it into the multiArr

        // This 2 variables are used to control the added zeros we need to put in the end of the array.
        boolean isTrue = false;
        int isTrueCounter = 0;
        int numberforZeros = columnSize ;

        System.out.println("  "  );

        for (int y = rowSize - 1; y >= 0; y--) {
            if (isTrue) {
                isTrueCounter = isTrueCounter + 1;
            }
            for (int x = columnSize - rowSize, z = numberforZeros - isTrueCounter ; x >= 0 && z >= 0; x--, z--) {
                isTrue = true;
                multiArr[y][z] = arr[x] * arr2[y]; }
        }

        // This is print is just to visually show the multiArr - Helps alot to understand the program.
        for (int l = multiArr.length - 1; l >= 0; l--) {
            System.out.println(Arrays.toString(multiArr[l]));
        }

        // This section here is to do the addiction and use the carryover.
        int result = 0;
        int carryOver = 0;
        int endResult = 0;
        boolean carrOverCondition = false;
        int endResultSingleNumb = 0;
        int multiplier = 0;

        for (int i = columnSize ; i >= 0; i--) {   // Loop through each column (right to left)

            if (!carrOverCondition) {
                result = 0;
            } else {
                result = carryOver;

            }
            for (int j = 0; j < rowSize; j++)  {   // Loop through each row (each number)
                result = multiArr[j][i] + result;  // Add bit to result
                carryOver = result / 2;           // Calculate new carry (1 if 2 or more)
                carrOverCondition = true;         // Set that we now have a carry possibility
                endResult = result % 2;           // Whats the resulting bit at this position?
            }
            endResultSingleNumb  = (int) (endResult * Math.pow(10, multiplier) + endResultSingleNumb );
            multiplier = multiplier +1;
        }
        System.out.println("------------------" );
        System.out.println("  "  );

        System.out.println("  The result is:");
        System.out.println("    " +
                "  "   + endResultSingleNumb);
    }
}


