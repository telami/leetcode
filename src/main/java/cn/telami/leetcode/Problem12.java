package cn.telami.leetcode;

public class Problem12 {
  /**
   * 12. Integer to Roman
   * <p>
   * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
   * <p>
   * Symbol       Value
   * I             1
   * V             5
   * X             10
   * L             50
   * C             100
   * D             500
   * M             1000
   * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
   * <p>
   * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
   * <p>
   * I can be placed before V (5) and X (10) to make 4 and 9.
   * X can be placed before L (50) and C (100) to make 40 and 90.
   * C can be placed before D (500) and M (1000) to make 400 and 900.
   * Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
   * <p>
   * Example 1:
   * <p>
   * Input: 3
   * Output: "III"
   * Example 2:
   * <p>
   * Input: 4
   * Output: "IV"
   * Example 3:
   * <p>
   * Input: 9
   * Output: "IX"
   * Example 4:
   * <p>
   * Input: 58
   * Output: "LVIII"
   * Explanation: C = 100, L = 50, XXX = 30 and III = 3.
   * Example 5:
   * <p>
   * Input: 1994
   * Output: "MCMXCIV"
   * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
   */
  public static String intToRoman(int num) {
    String M[] = {"", "M", "MM", "MMM"};
    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
  }
}
