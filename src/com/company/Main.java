package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner kbInput = new Scanner(System.in);
        System.out.println("Select to either convert from RGB to Hex or Hex to RGB(rgb/hex)");
        String chose = kbInput.nextLine();

        if(chose.equalsIgnoreCase("rgb")){

            System.out.println("Please enter a red, green, and blue value");
            String[] rgb = new String[3];
            for(int i = 0; i < rgb.length; i++){
                rgb[i] = kbInput.nextLine();
            }
            ToHex.RGBtoHex(rgb);

        }

        if(chose.equalsIgnoreCase("hex")){

            System.out.println("Please enter a hexadecimal value");
            String HexValue = kbInput.nextLine();
            ToRGB.HexToRGB(HexValue);

        }
    }
}
