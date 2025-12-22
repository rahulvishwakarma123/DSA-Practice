
package Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class Revision {

    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(nums[i])){
                return true;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // HashMap<String, Integer> hm = new HashMap<>();
        // hm.put("a", 3);
        // hm.put("b", 4);
        // System.out.println(hm.size());
        // boolean output = hm.containsKey("a");
        // System.out.println(output);

        // System.out.println(hm.isEmpty());
        // System.out.println("This is the value of key b :" + hm.get("b"));
        // // hm.clear();
        // System.out.println(hm.isEmpty());


        // Set<String> keys = hm.keySet();

        // System.out.println(keys);

        // for (String k : keys) {
        //     System.out.println("For key " + k + " values is " + hm.get(k));
        // }



        int arr[] = {1,2,3,3,4,5};
        System.out.println(hasDuplicate(arr));

    }
}
