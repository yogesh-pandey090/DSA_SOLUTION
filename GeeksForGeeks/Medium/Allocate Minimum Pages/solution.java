class Solution {
    public int findPages(int[] arr, int k) {
        // code here

        int n = arr.length;
        if(k>n){
            return -1;
        }

        long low = 0;
        long high = 0;

        for(int pages : arr){
            low = Math.max(low, pages);
            high += pages;
        }

        while(low<=high){
            long mid = low+(high-low)/2;
            if(isPossible(arr, k, mid)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return (int)low;
    }
    public static boolean isPossible(int[]arr, int k, long limit){
        int s = 1;
        long pages = 0;
        for(int book : arr){
            if(pages+book<=limit){
                pages+=book;
            }
            else{
                s++;
                pages=book;

                if(s > k){
                    return false;
                }
            }
        }
        return true;
    }
}