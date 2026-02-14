// package DSA QUESTIONS;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetcode136 {
    public static int singleNumber(int arr[]){
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                hm.replace(arr[i], false);
            }else{
                hm.put(arr[i], true);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i])) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        int ans = singleNumber(arr);
        System.out.println(ans);
    }
}
