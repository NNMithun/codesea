package com.practise;


class ReplaceAllOccurenceOfPattern
{
  // Function to compare two strings S and P and returns true if P is prefix of S
  public static boolean compare(char[] S, int k, char[] P)
  {
    int i = 0;
    while (i + k < S.length && i < P.length) {
      if (S[i + k] != P[i]) {
        break;
      }
      i++;
    }

    return i == P.length;
  }

  // In-place replace single or multiple occurrences of a pattern by a
  // specified character
  public static String convert(String string, String pattern, char ch)
  {
    char[] S = string.toCharArray();
    char[] P = pattern.toCharArray();

    int k = 0;

    // do for each character of the String
    for (int i = 0; i < S.length; i++)
    {
      // compare substring S[i,i+n] with pattern P
      if (compare(S, i, P)) {
        // move ahead by the length of the pattern
        i += P.length - 1;

        // replace the substring by the specified character
        S[k++] = ch;
      }
      else {
        // copy current character to next available position k
        S[k++] = S[i];
      }
    }

    // terminate the resultant string
    return new String(S).substring(0, k);
  }

  public static void main(String[] args)
  {
    // input string, pattern and character
    String string = "ABCABCXABC";
    String pattern = "ABC";
    char ch = '@';

    String s = convert(string, pattern, ch);
    System.out.println(s);
  }
}