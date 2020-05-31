class Solution {
    public int findJudge(int N, int[][] trust) {
        int ar[]=new int[N+1];
        int size=trust.length;
        for(int i=0;i<size;i++){
            ar[trust[i][1]]++;
            ar[trust[i][0]]--;
        }
        for(int i=1;i<=N;i++)
            if(ar[i]==N-1)
                return i;
        return -1;
    }
}