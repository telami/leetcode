package cn.telami.leetcode.original;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {
  /**
   * 4. Median of Two Sorted Arrays
   * <p>
   * There are two sorted arrays nums1 and nums2 of size m and n respectively.
   * <p>
   * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
   * <p>
   * You may assume nums1 and nums2 cannot be both empty.
   * <p>
   * <p>
   * <p>
   * Example 1:
   * <p>
   * nums1 = [1, 3]
   * nums2 = [2]
   * <p>
   * The median is 2.0
   * Example 2:
   * <p>
   * nums1 = [1, 2]
   * nums2 = [3, 4]
   * <p>
   * The median is (2 + 3)/2 = 2.5
   */
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    ArrayList<Integer> list = Lists.newArrayList();
    for (int i : nums1) {
      list.add(i);
    }
    for (int i : nums2) {
      list.add(i);
    }
//    Arrays.stream(nums1).forEach(list::add);
//    Arrays.stream(nums2).forEach(list::add);
    Collections.sort(list);
    int size = list.size();
    if (size % 2 == 0) {
      return (list.get(size / 2 - 1) + list.get(size / 2)) / 2;
    } else {
      return list.get(size / 2);
    }
  }
}
