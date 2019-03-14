package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by mengfl on 2019/3/14.
 */

public class QueueTest {
}
class QueueExample1 {
    public static void main(String[] args) {

      /*
       * We cannot create instance of a Queue as it is an
       * interface, we can create instance of LinkedList or
       * PriorityQueue and assign it to Queue
       */
        Queue<String> q = new LinkedList<String>();

        //Adding elements to the Queue
        q.add("Rick");
        q.add("Maggie");
        q.add("Glenn");
        q.add("Negan");
        q.add("Daryl");

        System.out.println("Elements in Queue:" + q);

      /*
       * We can remove element from Queue using remove() method,
       * this would remove the first element from the Queue
       */
        System.out.println("Removed element: " + q.remove());

      /*
       * element() method - this returns the head of the
       * Queue. Head is the first element of Queue
       */
        System.out.println("Head: " + q.element());

      /*
       * poll() method - this removes and returns the
       * head of the Queue. Returns null if the Queue is empty
       */
        System.out.println("poll(): " + q.poll());

      /*
       * peek() method - it works same as element() method,
       * however it returns null if the Queue is empty
       */
        System.out.println("peek(): " + q.peek());

        //Again displaying the elements of Queue
        System.out.println("Elements in Queue:" + q);

        int k=3;
        int[] a =new int[]{4,5,8,2};

        KthLargestElementinAStream kthLargestElementinAStream = new KthLargestElementinAStream(k,a);

    }


    static class KthLargestElementinAStream {
        final PriorityQueue<Integer> q;
        public KthLargestElementinAStream(int k, int[] a) {
            q = new PriorityQueue<>(k);

            for (int n : a)
                add(n);
        }

        public int add(int n) {
            if (q.size() < 3)
                q.offer(n);
            else if (q.peek() < n) {
                q.poll();
                q.offer(n);
            }
            return q.peek();
        }
    }
}

