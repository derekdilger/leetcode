public class mergeTest {
    public static void main(String[] args) {
        int[] arr1 = {0,0,0,0,0};
        int m = 0;
        int[] arr2 = {1,2,3,4,5};
        int n = 5;

        merge(arr1, m, arr2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int lowestUnkwn1 = 0;
        int lowestUnkwn2 = 0;

        if (nums1.length == 1 && nums2.length > 0) {
            nums1[0] = nums2[0];
        }

        while (lowestUnkwn2 <= n - 1) {
            if (nums1[lowestUnkwn1] <= nums2[lowestUnkwn2]) {
                while (nums1[lowestUnkwn1] <= nums2[lowestUnkwn2] 
                        && lowestUnkwn1 <= (m - 1 + lowestUnkwn2)) {
                    lowestUnkwn1++;
                        }
                int lowestIdxToShift = lowestUnkwn1;

                for (int i =(m + n)- 1; i > lowestIdxToShift; i--) {
                    nums1[i] = nums1[i - 1];
                }
                //System.out.println("lowestUnknwn1 is " + lowestUnkwn1);
                //System.out.println("lowestUnknwn2 is " + lowestUnkwn2);
                nums1[lowestUnkwn1] = nums2[lowestUnkwn2];
                lowestUnkwn2++;
            }

            if (lowestUnkwn2 <= n - 1
                    && nums1[lowestUnkwn1] > nums2[lowestUnkwn2]) {
                for (int i =(m + n) - 1; i > lowestUnkwn1; i--) {
                    nums1[i] = nums1[i - 1];
                }
                nums1[lowestUnkwn1] = nums2[lowestUnkwn2];
                lowestUnkwn1++;
                lowestUnkwn2++;
                    }
        }
        //System.out.println(nums1);
        //for (int index : nums1) {
        //System.out.println("index is " + index); 
        //}
    }
}
