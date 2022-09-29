//task: https://www.hackerrank.com/challenges/java-end-of-file/problem?h_r=next-challenge&h_r=next-challenge&h_r=next-challenge&h_v=zen&h_v=zen&h_v=zen&isFullScreen=true&h_r=next-challenge&h_v=zen
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.  */

        Scanner input = new Scanner(System.in);
        System.out.print("Напиши строку? ");
        int i = 0;
        while ( input.hasNext()) {
            System.out.printf((String.format("%d %s\n", ++i, (String)input.nextLine())));
        }


        }



    }
