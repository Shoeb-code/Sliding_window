package Sliding_Window;

import Map.Hashmap;

import java.util.HashMap;

public class most_k_frequency_2958 {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,2,3,1,2,3,4};
        int k=2;



        System.out.println(LongestKfreqArray(arr,k));
    }

    public static  int LongestKfreqArray(int [] arr, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int si=0;
        int ei=0;
        int ans=0;
        while(ei<arr.length){
            map.put(arr[ei],map.getOrDefault(arr[ei],0)+1);
            while (map.get(arr[ei]) > k) { // Shrink window if frequency exceeds k
                map.put(arr[si], map.get(arr[si]) - 1);
                si++;
            }
          ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
