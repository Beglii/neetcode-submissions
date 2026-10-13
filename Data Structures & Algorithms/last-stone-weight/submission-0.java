class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collectoins.reverseOrder());

        for (int s : stones) {
            maxHeap.offer(s);
        }

        while (minHeap.size() > 1) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();

            if (first != second) {
                maxHeap.offer(first - second)
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();

    }
}
