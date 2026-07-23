import java.util.*;

class SmallestInfiniteSet {

    private PriorityQueue<Integer> pq;
    private Set<Integer> set;
    private int current;

    public SmallestInfiniteSet() {

        pq = new PriorityQueue<>();
        set = new HashSet<>();
        current = 1;
    }

    public int popSmallest() {

        if (!pq.isEmpty()) {

            int num = pq.poll();
            set.remove(num);
            return num;
        }

        return current++;
    }

    public void addBack(int num) {

        if (num < current && !set.contains(num)) {
            pq.offer(num);
            set.add(num);
        }
    }
}