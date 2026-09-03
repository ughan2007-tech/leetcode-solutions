import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1=nums1.length;
        int n2=nums2.length;

        int[] mer=new int[n1+n2];
        for(int i=0;i<n1;i++) {
            mer[i]=nums1[i];
        }
        for(int i=0;i<n2;i++) {
            mer[n1+i]=nums2[i];
        }

        Arrays.sort(mer);

        int n=mer.length;
        int mid=n/2;

        
        if(n%2==0) {
            return (mer[mid-1]+mer[mid])/2.0;
        }
        
        else {
            return mer[mid];
        }
    }
}