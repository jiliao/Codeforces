/**
 * TheatreSquare
 */

import java.io.*;
import java.util.*;
import java.lang.*;

public class TheatreSquare {
    static boolean DEBUG = false;
    static long n, m, a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line; 
        String[] l;

        line = br.readLine().trim();
        l = line.split(" ");
        n = Long.parseLong(l[0]);
        m = Long.parseLong(l[1]);
        a = Long.parseLong(l[2]);

        if (DEBUG) { System.out.println("n: " + n + " m: " + m + " a: " + a); }

        double ans = Math.ceil((double)n/a) * Math.ceil((double)m/a);
        System.out.println((long)ans);



    }

}