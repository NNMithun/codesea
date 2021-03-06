package com.Sep18;

import java.util.HashMap;
import java.util.Map;

class PalindromeByDeletion_Sol2
{
	// Function to find out the minimum number of deletions required to
	// convert a given String X[i..j] into a palindrome
	public static int minDeletions(String X, int i, int j, Map<String, Integer> lookup)
	{
		// base condition
		if (i >= j) {
			return 0;
		}

		// construct an unique map key from dynamic elements of the input
		String key = i + "|" + j;

		// if sub-problem is seen for the first time, solve it and
		// store its result in a map
		if (!lookup.containsKey(key))
		{
			// if last character of the String is same as the first character
			if (X.charAt(i) == X.charAt(j)) {
				lookup.put(key, minDeletions(X, i + 1, j - 1, lookup));
			}
			else {
				// if last character of String is different to the first character

				// 1. Remove last character & recur for the remaining substring
				// 2. Remove first character & recur for the remaining substring

				// return 1 (for remove operation) + minimum of the two values

				int res = 1 + Math.min(minDeletions(X, i, j - 1, lookup),
									minDeletions(X, i + 1, j, lookup));
				lookup.put(key, res);
			}
		}

		// return the subproblem solution from the map
		return lookup.get(key);
	}

	public static void main(String[] args)
	{
		String X = "ACBCDBAA";
		int n = X.length();

		// create a map to store solutions of subproblems
		Map<String, Integer> lookup = new HashMap<>();

		System.out.print("The minimum number of deletions required are " +
								minDeletions(X, 0, n - 1, lookup));
	}
}