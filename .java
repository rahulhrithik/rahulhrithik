// Find the mainimum out of three numbers ?//
import java.lang.*;
import java.io.*;

public class A2Q3 {

    public static void main(String[] Strings) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a, b, c, min;
        System.out.println("Enter First Number:");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter Second Number:");
        b = Integer.parseInt(br.readLine());
        System.out.println("Enter Third Number:");
        c = Integer.parseInt(br.readLine());

        if ((a < b) && (a < c)) 
        {
            min = a;
        }
         else if (b < c) 
        {
            min = b;
        }
         else
        {
            min = c;  
        }
        
        {
            System.out.println("The Minimum Numbar:" + min);
        }
    }

}
