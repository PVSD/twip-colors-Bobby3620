package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Select to use rgb or hexadecimal to convert to either one(ex. rgb to hexadecimal)");
        String chose = kbInput.nextLine();

        if (chose.equalsIgnoreCase("rgb")) {
            //Need a for loop to set all values
            //Add constraint x > 0 & x < 256
            int[] rgb = new int[3];
            System.out.println("Please enter 3 values between 0-255. If value is over the constraint, the program just stops.");
            int constraint1 = -1, constraint2 = 256;
            int nums = 1; //This allows the while loop to be true for the first time
            int timer = -1; //Will terminate the while loop also

            // I hate error messages
            while (nums > constraint1 && nums < constraint2 && timer < 3) {
                nums = kbInput.nextInt();
                for (int i = 0; i < rgb.length; i++) {
                    rgb[i] = nums;
                }
                timer++;
            }

            // This is how to refer back to the abstract class
            rgb theClass = new rgb(); //theClass refers to the rgb class ye
            theClass.rgbToHex(rgb);

            if (chose.equalsIgnoreCase("hexadecimal")) {

            }
        }
    }
}
