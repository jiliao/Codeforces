/**
 * Next Round
 */

import java.io.*;
import java.util.*;
import java.lang.*;

public class NextRound {
	static boolean DEBUG = false;
	static int n, k;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] l;

		line = br.readLine().trim();
		l = line.split(" ");
		n = Integer.parseInt(l[0]);
		k = Integer.parseInt(l[1]);

		if (DEBUG) { System.out.println("n: " + n + " k: " + k); }

		line = br.readLine().trim();
		l = line.split(" ");

		int total = 0;
		int kthScore = Integer.parseInt(l[k-1]);
		for (int i = 0; i < l.length; i++) {
			if (Integer.parseInt(l[i]) >= kthScore && Integer.parseInt(l[i]) > 0) {
				total++;
			}
		}

		System.out.println(total);
	}

}