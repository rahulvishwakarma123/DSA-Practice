package Hashmaps;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
public class GroupAnagrams {
     public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arrayList = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(hm.containsKey(s)){
                List<String> list = hm.get(s);
                list.add(strs[i]);
                hm.put(s, list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hm.put(s, list);
            }
        }
        Set<String> keys = hm.keySet();
        for(String key : keys){
            List<String> list = hm.get(key);
            arrayList.add(list);
        }
        return arrayList;
    }
    public static void main(String[] args) {
        String arr[] = {"act", "cat", "stop", "pots", "tops","hat"};
        List<List<String>> list = groupAnagrams(arr);
        System.out.println(list);
    }
}
