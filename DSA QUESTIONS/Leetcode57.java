import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode57 {
    public static int[][] mergeIntervals(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> resultList = new ArrayList<>();
        // int j = 0;
        int i = 0;
        while (i < arr.length) {
            if (i < arr.length - 1 && arr[i][1] >= arr[i + 1][0]) {
                int first = arr[i][0];
                i++;
                int last = Math.max(arr[i-1][1], arr[i][1]);
                while (i < arr.length - 1 && arr[i][1] >= arr[i + 1][0]) {
                    i++;
                    last = Math.max(last, arr[i][1]);
                }
                resultList.add(Arrays.asList(first, last));
                
            } else {
                int first = arr[i][0];
                int last = arr[i][1];
                resultList.add(Arrays.asList(first, last));
            }
            i++;
        }
        return convertTo2DArray(resultList);

    }

    public static int[][] convertTo2DArray(List<List<Integer>> list) {
        int[][] array = new int[list.size()][];

        for (int i = 0; i < list.size(); i++) {
            List<Integer> row = list.get(i);
            array[i] = new int[row.size()];
            for (int j = 0; j < row.size(); j++) {
                array[i][j] = row.get(j); // Auto-unboxing converts Integer to int
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 0,6 },
                { 1,4 },
                { 1,12 },
                { 2,5 },
                {5,9 },
                {14, 17}
        };

        int[][] ans = mergeIntervals(arr);
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}
