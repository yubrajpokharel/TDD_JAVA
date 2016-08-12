package com.yubraj;

/**
 * Created by yubraj on 8/12/16.
 */
public class StringSwap {

    public String swapLastTwoChar(String str){

        //For 1st Test with two chars
        /*
            char firstChar = str.charAt(0);
            char secondChar = str.charAt(1);
            return "" + secondChar + firstChar;
        */


        //for second test with more then two char
        /*
            int len = str.length();
            String withOutLastChar = str.substring(0, len-2);
            char firstLastChar = str.charAt(len-1);
            char secondLastChar = str.charAt(len - 2);
            return withOutLastChar + firstLastChar + secondLastChar;
        */

        //for 3rd testCase

        int len = str.length();
        if(len < 2) return str;
        String withOutLastChar = str.substring(0, len-2);
        char firstLastChar = str.charAt(len-1);
        char secondLastChar = str.charAt(len - 2);
        return withOutLastChar + firstLastChar + secondLastChar;


    }

}
