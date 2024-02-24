24-02-2024


  2092. Find All People With Secret
Solved
Hard
Topics
Companies
Hint
You are given an integer n indicating there are n people numbered from 0 to n - 1. You are also given a 0-indexed 2D integer array meetings where meetings[i] = [xi, yi, timei] indicates that person xi and person yi have a meeting at timei. A person may attend multiple meetings at the same time. Finally, you are given an integer firstPerson.

Person 0 has a secret and initially shares the secret with a person firstPerson at time 0. This secret is then shared every time a meeting takes place with a person that has the secret. More formally, for every meeting, if a person xi has the secret at timei, then they will share the secret with person yi, and vice versa.

The secrets are shared instantaneously. That is, a person may receive the secret and share it with people in other meetings within the same time frame.

Return a list of all the people that have the secret after all the meetings have taken place. You may return the answer in any order.



  class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        HashSet<Integer> hs = new HashSet<>(Arrays.asList(0, firstPerson));
        int shortest[] = new int[n];
        Arrays.fill(shortest, (int)(1e9));
        ArrayList<ArrayList<int[]>> arr = new ArrayList<>();
        for(int i = 0 ; i<n ; i++)arr.add(new ArrayList<>());

        for (int[] meeting : meetings) {
            arr.get(meeting[0]).add(new int[]{meeting[1], meeting[2]});
            arr.get(meeting[1]).add(new int[]{meeting[0], meeting[2]});
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{0, 0});
        pq.add(new int[]{firstPerson, 0});
        shortest[0] = 0;
        shortest[firstPerson] = 0;
        while (!pq.isEmpty()) {
            int[] s = pq.poll();
            for (int[] j : arr.get(s[0])) {
                if (j[1] >= s[1] && shortest[j[0]]>j[1]) {
                    pq.add(new int[]{j[0], j[1]});
                    hs.add(j[0]);
                    shortest[j[0]] = j[1];
                }
            }
        }
        return new ArrayList<>(hs);
    }
}
