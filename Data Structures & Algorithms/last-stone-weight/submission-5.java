class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue maxHeap = new PriorityQueue<>(collections.reverseOrder());

        for (int s : stones) {
            maxHeap.offer(s);
        }

        while (maxHeap.length > 1) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if (first != second) {
                maxHeap.offer(first - second);
            }

            return maxHeap.isEmpty() ? 0 : maxHeap.peek();
        }
}
}
