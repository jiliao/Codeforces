/**
 * Watermelon
 */

import java.io.*;
import java.util.*;
import java.lang.*;

public class Watermelon {
    static boolean DEBUG = false;
    static int w;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line; 
        String[] l;

        line = br.readLine().trim();
        w = Integer.parseInt(line);

        if (DEBUG) { System.out.println("w: " + w); }

        if (w == 2 || (w % 2 == 1)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }


    }

}