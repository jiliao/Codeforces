/**
 * Domino Piling
 *
 * Observation: If at least one of the dimensions is even, then the number of tiles is just
 * 				(area / 2), as you can always have a perfect tiling. Mini-proof: Just split
 * 				the board into 2 x m boards, each of which can be tiled perfectly. 
 * Observation2: For odd x odd boards, you can always tile to fill perfectly all but 1 square.
 *				 Mini-proof: m x (n-1) is now the upper case. Tile that, then tile the remaining
 *				 line, which will leave 1 space empty.
 */

import java.io.*;
import java.util.*;
import java.lang.*;

public class DominoPiling {
	static boolean DEBUG = false;
	static int m, n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] l;

		line = br.readLine().trim();
		l = line.split(" ");
		m = Integer.parseInt(l[0]);
		n = Integer.parseInt(l[1]);

		if (DEBUG) { System.out.println("m: " + m + " n: " + n); }

		if ((m % 2 == 0) || (n % 2) == 0) {
			System.out.println(m * n / 2);
		} else {
			System.out.println((m * n - 1)/2);
		}
	}
}