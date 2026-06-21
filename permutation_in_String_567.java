package Sliding_Window;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class permutation_in_String_567 {
    public static void main(String[] args) {
        String s2="eidboaoo";
        String s1="ab";
           boolean ans=checkPerputation(s2,s1);
        System.out.println(ans);
    }
    public static boolean checkPerputation(String s2, String s1){
        int si=0;
        int k=s1.length();
        int ei=k;
        boolean ans =false;
        while(ei<=s2.length()){
            String l=s2.substring(si,ei);
            if (compareString(s1,l)){
                ans=true;
                break;
            }
            si++;
            ei++;
        }
        return ans;
    }
    public static boolean compareString(String s1, String main ){
        HashMap<Character,Integer> map=new HashMap<>();
       for (int i=0; i<s1.length(); i++){
           char ch=s1.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
       }
       boolean ans=true;
       for (int i=0; i<main.length(); i++){
           char ch=main.charAt(i);
           if (map.containsKey(ch) && map.get(ch)>0){
               map.put(ch, map.get(ch)-1);
           }
           else {
               ans=false;
               break;
           }
    }
       return ans;
}
}
