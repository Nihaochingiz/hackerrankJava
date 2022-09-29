//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
import java.util.*;
import java.io.*;
public class LoopsTwo {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                a = b + a;
                if ( j > 0) {
                    System.out.print(" ");
                }
                System.out.print(a);
                b = b * 2;
            }
            System.out.println(" ");
        }
        in.close();
    }
}
