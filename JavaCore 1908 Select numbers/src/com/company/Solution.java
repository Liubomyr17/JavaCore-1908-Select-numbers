package com.company;

/*

1908 Select numbers
Read 2 file names from the console.
Print in the second file all the numbers that are in the first file.
Output numbers separated by spaces.
Close streams.
Example file body:
12 text var2 14 8v 1
Result:
12 14 1

Requirements:
1. The program should read the file names from the console (use BufferedReader).
2. BufferedReader must be closed for reading data from the console.
3. The program should read the contents of the first file (use BufferedReader with the FileReader constructor).
4. The stream of reading from the file (BufferedReader) should be closed.
5. The program should write to the second file all numbers, separated by spaces, from the first file (use BufferedWriter with the FileWriter constructor).
6. The write stream to the file (BufferedWriter) must be closed.


*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        String fileName2 = conReader.readLine();
        conReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            String[] digital = s.split("\\s"); //("\\D+") ;

            for (String str : digital)
                try {
                    System.out.println(Integer.parseInt(str));
                    fileWriter.write(str + " ");
                } catch (NumberFormatException e) {
                    continue;
                }
        }
        fileWriter.close();
        fileReader.close();
    }
}




