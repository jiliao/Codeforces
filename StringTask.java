/**
 * StringTask
 */

import java.io.*;
import java.util.*;
import java.lang.*;

public class StringTask {
    static boolean DEBUG = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        line = br.readLine().trim();
        line = line.toLowerCase();
        char[] input = line.toCharArray();

        for (int i = 0; i < input.length; i++) {
            if (!isVowel(input[i])) {
                System.out.print("." + input[i]);
            }
        }
    }

    private static boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'o':
            case 'y':
            case 'e':
            case 'u':
            case 'i':
                return true;
            default:
                return false;
        }
    }

}