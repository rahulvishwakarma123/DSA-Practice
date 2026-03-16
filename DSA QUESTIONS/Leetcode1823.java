import java.util.ArrayList;

public class Leetcode1823 {

    public static int findWinner(ArrayList<Integer> list, int k, int i){
        int n = list.size();
        if(n == 1){
            return list.get(0);
        }

        i = (i + k - 1) % n;
        list.remove(i);
        return findWinner(list, k, i);
    }
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        for(int j = 1; j <= n; j++){
            list.add(j);
        }
        return findWinner(list,k,i);
    }

    public static void main(String[] args) {
        System.out.println();
    }
}