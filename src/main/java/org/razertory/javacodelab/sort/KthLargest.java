package org.razertory.javacodelab.sort;

import java.util.PriorityQueue;

/**
 * top k 问题通常可以用
 * 1.快速排序法，不断缩小选择范围锁定
 * 2.堆排序法，维护一个大小为 k 的堆，遍历完数组后，堆顶那个元素就是目标值
 * https://leetcode.com/problems/kth-largest-element-in-an-array
 */
class KthLargest {
    /**
     * 快速排序法
     */
    int findByQuickSort(int k, int[] nums) {
        return findByQuickSort(k, nums, 0, nums.length - 1);
    }

    /**
     * 优先队列/堆排序法
     */
    int findWithPriorityQueue(int k, int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        int cur = queue.poll();
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > cur) {
                queue.add(nums[i]);
                cur = queue.poll();
            }
        }
        return cur;
    }

    private int findByQuickSort(int k, int[] nums, int left, int right) {
        int n = partition(nums, left, right);
        if (n == k - 1)
            return nums[n];
        else if (n < k - 1)
            return findByQuickSort(k, nums, n + 1, right);
        else
            return findByQuickSort(k, nums, left, n - 1);
    }

    // 大的左边，小的右边
    private int partition(int[] array, int low, int high) {
        int left = low;
        int pivot = array[high];
        for (int i = low; i < high; i++) {
            if (array[i] > pivot) {
                int temp = array[i];
                array[i] = array[left];
                array[left] = temp;
                left++;
            }
        }
        int temp = array[left];
        array[left] = pivot;
        array[high] = temp;
        return left;
    }
}
