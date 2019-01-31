package com.company;

public class ToRGB {

    public static void HexToRGB(String RBGvalue){

        int[] rgb = new int[3];
        for(int i = 0; i < rgb.length; i++){
            rgb[i] = Integer.parseInt(RBGvalue.substring(i * 2, i * 2 + 2), 16);
        }

        for(int i = 0; i < rgb.length; i++){
            if(i == 0){
                System.out.print("rgb(" + rgb[i] + ",");
            }else if(i == 1){
                System.out.print(" " + rgb[i] + ",");
            }else if(i == 2){
                System.out.println(" " + rgb[i] + ")");
            }
        }
    }
}
