package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by mengfl on 2019/3/14.
 */

public class PriorityQueueTest {
    public static void main(String[] args)
    {

        PriorityQueue<String> queue =
                new PriorityQueue<String>(15, new MyComparator());
        queue.add("Tyrion Lannister");
        queue.add("Daenerys Targaryen");
        queue.add("Arya Stark");
        queue.add("Petyr 'Littlefinger' Baelish");

        /*
         * What I am doing here is removing the highest
         * priority element from Queue and displaying it.
         * The priority I have set is based on the string
         * length. The logic for it is written in Comparator
         */
        while (queue.size() != 0)
        {
            System.out.println(queue.poll());

        }
    }
}

class MyComparator implements Comparator<String>
{
    @Override
    public int compare(String x, String y)
    {
        return x.length() - y.length();
    }
}
