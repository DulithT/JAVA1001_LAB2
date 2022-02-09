import java.util.Scanner;


public class ArrayTools {
    static int[] generalArray = {1, 3, 4, 5, 6, 7, 9, 10};
    public static void main(String[] args) {
        //Methods
        System.out.println(caeserCipher());

        AgeCheck();

        ReverseArray(generalArray);

        SearchValue(generalArray);

        Average();
    }

    //Method to get the user input
    static String UserInput(String text) {
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        String output = input.nextLine();

        return output;
    }


    //Method for ceaser cipher
    public static StringBuffer caeserCipher() {
        String text1 = "Enter the text you want to cipher";
        String text = UserInput(text1);
        
        String text2 = "Enter a value to encrypt";
        int shift = Integer.parseInt(UserInput(text2));

        StringBuffer result = new StringBuffer();
 
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++) {
            char x = (char) (((int) text.charAt(i) + shift));
            result.append(x);
        }
        return result;
    }


    //Method for checking age
    static void AgeCheck() {
        System.out.println();
        System.out.println("Age Check:");
        String text = "Enter your age:";
        int age = Integer.parseInt(UserInput(text));

        System.out.println();
        if(age >= 18) {
            System.out.println("You are allowed to enter!");
        } else {
            System.out.println("You are not allowed to enter!");
        }

    }


    //Method for reversing an array
    static void ReverseArray(int[] genArray) {
        System.out.println();
        System.out.println("Reverse the array");

        int arrayLength = genArray.length;
        int[] newArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            newArray[i] = genArray[arrayLength - i - 1];
        }

        System.out.println("Old Array: ");
        for(int x: genArray) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("New Array: ");
        for(int x: newArray) {
            System.out.println(x);
        }
    }



    //Method for searching a value in an array    
    static void SearchValue(int[] genArray) {
        System.out.println();
        System.out.println("Search for a number");
        System.out.println("Enter a number to search for: ");
        Scanner input = new Scanner(System.in);
        int searchValue = Integer.parseInt(input.nextLine());

        boolean isTrue = false;
        for(int x = 0; x < genArray.length; x++) {
            if(searchValue == genArray[x]){
                isTrue = true;
                break;
            }
        }

        System.out.println();
        if(isTrue == true) {
            System.out.println(searchValue + " is in the array.");
        } else {
            System.out.println(searchValue + " is not in the array.");
        }
    }


    //Find the average of all values in an array
    static void Average() {
        System.out.println();
        System.out.println("Find the average");
        System.out.println("Enter the size of the array: ");
        //Getting user input
        Scanner input = new Scanner(System.in);
        int arraySize = Integer.parseInt(input.nextLine());

        int[] numArray = new int[arraySize];

        System.out.println("Enter elements for the array: ");
        for(int i = 0; i < arraySize; i++) {
            Scanner numInput = new Scanner(System.in);
            int newInt = Integer.parseInt(numInput.nextLine());

            numArray[i] = newInt;
        }
        int sum = 0;
        float avg = 0f;

        for(int x = 0; x < numArray.length; x++) {
            sum = sum + numArray[x];
        }
        avg = sum / numArray.length;
        
        System.out.println();
        System.out.println("sum: " + sum);
        System.out.println("Number of elements: " + numArray.length);
        System.out.println("Average: " + avg);
    }
}
