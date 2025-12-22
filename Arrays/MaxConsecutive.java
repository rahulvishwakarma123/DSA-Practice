public class MaxConsecutive {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCons = 0;
        int cons = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                cons++;
                System.out.println(maxCons);
            }
            else{
                cons = 0;
            }
            maxCons = Math.max(maxCons, cons);
        }
        return maxCons;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,0,0,0,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
