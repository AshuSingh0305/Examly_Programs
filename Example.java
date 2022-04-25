package DataStructure.Examly;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int nums1[]={1,3};
        int nums2[]={2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr=new int[nums1.length+nums2.length];
        int i=0;
        for(i=i;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int j=0;
        for(j=0;j<nums2.length;j++){
            arr[i++]=nums2[j];
        }
        double k;
        Arrays.sort(arr);
        if(arr.length%2==0){
            k=(arr[(arr.length/2)]+arr[(arr.length/2)-1]);
            k=k/2;
        }else{
            int a=arr.length/2;
            k=(arr[a]);
        }
        return k;
    }
}