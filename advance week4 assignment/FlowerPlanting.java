class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
       Map<Integer, Set<Integer>> adjacent = createMap(N,paths);
       return getResult(N,paths,adjacent);  
    }
    private Map<Integer, Set<Integer>> createMap(int N, int[][] paths){
        Map<Integer, Set<Integer>> adjacent = new HashMap<>();
        for(int i = 0; i<N ; i++)
            adjacent.put(i, new HashSet<>());
        int size = paths.length;
        for(int i =0; i<size ;i++){
            adjacent.get(paths[i][0]-1).add(paths[i][1]-1);
            adjacent.get(paths[i][1]-1).add(paths[i][0]-1);
        }
        return adjacent;
        
    }
    
    private int[] getResult(int N, int[][] paths,Map<Integer, Set<Integer>> adjacent){
        int[] result = new int[N];
        for(int i =0; i<N ;i++){
            int[] flowerType = new int[5];
            for(int x: adjacent.get(i))
                flowerType[result[x]] = 1;
            for(int c=1; c<5;c++){
                if(flowerType[c] !=1)
                    result[i] = c;
            }
        }
        return result;
    }
}