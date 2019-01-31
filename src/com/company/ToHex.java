package com.company;

public class ToHex {

    static void RGBtoHex(String[] rgb){

        for(int i = 0; i < rgb.length; i++){
            int copyOfrgb = Integer.parseInt(rgb[i]);
            String value = Integer.toHexString(copyOfrgb);
            if(i == 0){
                System.out.print("The hex value is: " + "#" + value);
            }else{
                System.out.print(value);
            }
        }
    }
}
