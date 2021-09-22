package com.bridgelabz.logicalPrograms;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.println("Enter Number (above than 1 ):");
        int a= utility.getIntValue();
        utility.primeNumber(a);
    }
}
