package com.bridgelabz.logicalPrograms;

import com.bridgelabz.utility.Utility;

public class ReverseNumber {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter a Number :");
        int a= utility.getIntValue();
        utility.reverseNumber(a);
    }
}
