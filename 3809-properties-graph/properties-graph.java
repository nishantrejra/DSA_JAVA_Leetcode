class Solution {
    private void dfs(boolean[] used, Map<Integer, List<Integer>> map, int v) {
        used[v] = true;
        for(int child : map.getOrDefault(v, new ArrayList<>())) {
            if(!used[child]) {
                dfs(used, map, child);
            }
        }
    }
    
    public int numberOfComponents(int[][] properties, int K) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = properties.length, m = properties[0].length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int[][] ct = new int[101][2];
                Set<Integer> set = new HashSet<>();
                for(int k=0; k<m; k++) {
                    int v1 = properties[i][k], v2 = properties[j][k];
                    if(ct[v1][0] == 0) ct[v1][0]++;
                    if(ct[v2][1] == 0) ct[v2][1]++;
                    if(ct[v1][0]==1 && ct[v1][1]==1) set.add(v1);
                    if(ct[v2][0]==1 && ct[v2][1]==1) set.add(v2);
                }
                
                if(set.size() >= K) {
                    map.putIfAbsent(i, new ArrayList<>());
                    map.putIfAbsent(j, new ArrayList<>());
                    map.get(i).add(j);
                    map.get(j).add(i);
                }
            }
        }
        
        boolean used[] = new boolean[n];
        int ans = 0;
        for(int i=0; i<n; i++) {
            if(!used[i]) {
                ans++;
                dfs(used, map, i);
            }
        }
        return ans;
    }
}