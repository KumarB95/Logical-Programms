package com.bridgelabz.logicalPrograms;

import com.bridgelabz.utility.Utility;
import jdk.jshell.execution.Util;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Utility utility=new Utility();
        System.out.print("Type 'start' to start the stopwatch: ");
        String input1=utility.getStringInput();
        utility.stopWatch(input1);

    }
}
