import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// ENUNCIADO:


/*
 Problem
Submissions
Leaderboard
Discussions
Donats dos nombres n1 i n2, on n1 és més gran que n2 (n1>n2), imprimeix els nombres desde n1 fins a n2.

Input Format

Dos enters n1 i n2, on n1>n2

Constraints

Suposem que n1>n2

Output Format

Imprimeix els nombres desde n1 a n2 inclosos [n1,n2]

Sample Input 0

5 1
Sample Output 0

5
4
3
2
1
 */




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while (n1>=n2)
        {
            System.out.println(n1--);
        }

    }
}
