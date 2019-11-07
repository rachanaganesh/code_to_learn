package PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LC703_KthLargestElement {
    int k;

    PriorityQueue<Integer> maxHeap1 = new PriorityQueue<Integer>(3, new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            return b - a;
        }
    });
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((f,g) -> g -f);
  //  PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


    public LC703_KthLargestElement(int k, int[] nums) {
        this.k = k;
      //  this.maxHeap = new PriorityQueue<>(k);
        for(int i : nums) {
            add(i);
        }
    }
    public int add(int val) {
        if(maxHeap.size()<k) {
            maxHeap.add(val);

        } else if(val < maxHeap.peek()) {
            maxHeap.remove();
            maxHeap.add(val);
        }
        return maxHeap.peek();
    }


    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4,5,8,2};
        LC703_KthLargestElement ele = new LC703_KthLargestElement(k,nums);

        System.out.println(ele.maxHeap.peek());
        //System.out.println(ele.q);

    }
}
