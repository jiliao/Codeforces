/**
 * WayTooLongWords
 */

import java.io.*;
import java.util.*;
import java.lang.*;

public class WayTooLongWords {
    static boolean DEBUG = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        line = br.readLine().trim();
        int n = Integer.parseInt(line);

        for (int i = 0; i < n; i++) {
            line = br.readLine().trim();
            int len = line.length();
            if (len > 10) {
                System.out.println(line.charAt(0) + Integer.toString(len - 2) + line.charAt(len - 1));
            } else {
                System.out.println(line);
            }     
        }


    }
}