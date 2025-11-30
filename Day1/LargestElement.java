class LargestElement{
    public static void main(String args[]){
        int arr[] = {5, 9, 3, 15, 2};
        int largestNumber = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }
        System.out.println("your largest number of the array is - " + largestNumber);
    }
}