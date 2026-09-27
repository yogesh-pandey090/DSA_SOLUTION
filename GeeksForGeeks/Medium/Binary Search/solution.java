class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int l = 0;
        int r= arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]<k){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return false;
    }
}