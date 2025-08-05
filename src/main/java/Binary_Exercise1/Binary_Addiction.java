package Binary_Exercise1;


 /* Take an input of 2 binary numbers and display their sum .
        You have to do this manually

        Input number1 : 11
        Input number2 : 11

        integers have a limit of 10 characters

*/

public class Binary_Addiction {
// Methods to separate in digit and place it into an array
    public static int[] digitSeparate1(int arr[], int numb1) {
        int i = 0;
        while (numb1 > 0) {
            arr[i] = numb1 % 10; // store last digit
          //  System.out.println("arr[ " + i + "] " + arr[i]);
            numb1 = numb1 / 10; // chop  out last digit number
            i = i + 1;
        }
        return arr;
    }

    public static int[] digitSeparate2(int arr2[], int numb2) {
        int i = 0;
        while (numb2 > 0) {
            arr2[i] = numb2 % 10; // store last digit

         //   System.out.println("arr[ " + i + "] " + arr2[i]);
            numb2 = numb2 / 10; // chop  out last digit number
            i = i + 1;}
        return arr2;
    }

// method to add each digit in accordance to the binary rules
    public static void binaryAddition(int arr[], int arr2[]) {
        int endResult = 0;
        int carryOver = 0;
        int multiplier = 0;
        int result = 0;
        for (int y = 0, z = 0; y < arr.length && z < arr2.length;
             y++, z++) {
            if (arr[y] == 0 && arr2[z] == 0) {
                if (carryOver == 1) {
                    result = 1;
                    carryOver = 0;
                } else {
                    result = 0;}
            } else if ((arr[y] == 0 && arr2[z] == 1) || (arr[y] == 1 && arr2[z] == 0)) {
                if (carryOver == 1) {
                    result = 0;
                    carryOver = 1;
                } else {
                    result = 1;}
            } else if ((arr[y] == 1 && arr2[z] == 1)) {
                if (carryOver == 1) {
                    result = 1;
                    carryOver = 1;
                } else {
                    result = 0;
                    carryOver = 1;}
            } else if ((arr[y] == 0 && carryOver == 1) || (arr2[z] == 0 && carryOver == 1)) {
                result = 1;}
            endResult = addZeros(result, endResult, multiplier);
            multiplier = multiplier + 1;
        }


        System.out.println("    The end result is :  ");
        System.out.println("           " + endResult);
    }

// method to ensure that the correct amount of zeros are added into the result
    public static int addZeros(int result, int endResult, int multiplier) {
        endResult = (int) (result * Math.pow(10, multiplier) + endResult);
        return endResult;
    }

    public static void main(String[] args) {
        int numb1 =  101111;
        int numb2 = 111;
        int lengthofnumb1 = String.valueOf(numb1).length();
        int lengthofnumb2 = String.valueOf(numb2).length();
        int sumofLengthNumbers = lengthofnumb1 + lengthofnumb2;

 // based on trial and error the sizes of the arrays where we store the numbers has to be the  sum of the lengths of the 2 numbers
        int arr[] = new int[sumofLengthNumbers];
        int arr2[] = new int[sumofLengthNumbers];

        System.out.println("           " );
        System.out.println("If you add numbers " + numb1 +  " and " + numb2 + " in binary" );

        binaryAddition(digitSeparate1(arr, numb1), digitSeparate2(arr2, numb2));
    }
}