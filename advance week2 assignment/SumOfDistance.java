class Solution {
    HashMap<Integer, int[]> dp = new HashMap<Integer, int[]>();
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        if (N <= 1) return new int[]{0};
        ArrayList<Integer>[] tree = new ArrayList[N];
        for(int i = 0; i < N-1;i++) {
            int n1 = edges[i][0];
            int n2 = edges[i][1];
            if (tree[n1] == null) tree[n1] = new ArrayList<Integer>();
            tree[n1].add(n2);
            if (tree[n2] == null) tree[n2] = new ArrayList<Integer>();
            tree[n2].add(n1);
        }
        
        int res[] = new int[N];
        for (int i = 0; i < N; i++) {
            for (int nn : tree[i]) {
                res[i] += dfs(nn, i, tree)[0];
            }
        }
        return res;
    }
    
    int[] dfs(int cur, int pre, ArrayList<Integer>[] tree) {
        int encode = (pre << 15) + cur;   
        int[] res = dp.getOrDefault(encode, null);
        if (res != null) return res;
        res = new int[2];
        for (int nn : tree[cur]) {
            if (pre != nn) {
                int[] tmp = dfs(nn, cur, tree);
                res[0] += tmp[0];
                res[1] += tmp[1];
            }
        }
        res[1] += 1;
        res[0] += res[1];
        dp.put(encode, res);
        return res;
    }
}