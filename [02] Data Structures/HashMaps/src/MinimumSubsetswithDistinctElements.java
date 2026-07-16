import java.util.*;

class MinimumSubsetswithDistinctElements {

    static int minSubsets(int[] arr)
    {
        int count = 0;
        int n = arr.length;
        boolean[] visited = new boolean[n];
        // HashSet<Integer> set = new HashSet<>();
        HashSet<HashSet<Integer>> finalSet = new HashSet<>();
        for(int i =0;i<n;i++){
            if(visited[i]){
                continue;
            }
            count++;
            HashSet<Integer> set = new HashSet<>();
            for(int j=0;j<n;j++){
                if(visited[j] || set.contains(arr[j])){
                    continue;
                }
                visited[j] = true;
                set.add(arr[j]);
            }
            finalSet.add(set);
        }
        for(HashSet<Integer> k : finalSet){
            System.out.println(k);
        }
        return count;
    }
    static int minSubsets2(int[] arr)
    {
        int maxFreq = 0;
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(maxFreq<map.get(arr[i])){
                maxFreq = map.get(arr[i]);
            }
        }
        return maxFreq;
    }

    public static void main(String[] args)
    {
        int[] arr = {2,1,4,1,6,5,5,5};
        System.out.println(minSubsets(arr));
        System.out.println(minSubsets2(arr));
    }
}