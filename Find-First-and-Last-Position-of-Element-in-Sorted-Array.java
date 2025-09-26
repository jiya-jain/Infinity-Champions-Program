class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int s=0;
        int first= -1, last=-1;
        int e = nums.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target){
                first = mid;
                e = mid-1;
            }else if(nums[mid]<target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }


        s=0; e = nums.length-1;
         while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid]==target){
                last = mid;
                s = mid+1;
            }else if(nums[mid]<target){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }

        return new int[]{first,last};
    }
}
