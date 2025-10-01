class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double med;
        int[] newArray = new int[nums1.length + nums2.length];
        for(int i = 0; i<nums1.length; i++){
            newArray[i] = nums1[i];
        }
        for(int i = 0; i<nums2.length; i++){
            newArray[i+nums1.length] = nums2[i];
        }
        Arrays.sort(newArray);
        if(newArray.length % 2 == 0){
            int num1 = newArray[newArray.length/2-1];
            int num2 = newArray[newArray.length/2];
            med = (num1+num2) / 2.0;
        }else{
            med = newArray[(int)Math.floor(newArray.length/2)];
        }
        return med;
    }
}