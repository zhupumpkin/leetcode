package FindMedianSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int lengA = nums1.length;
       int lengB = nums2.length;
       if(lengA == 0){
           return getMiddleFromVector(nums2);
       }
       if(lengB == 0){
           return getMiddleFromVector ( nums1 );
       }
       int i,j;
       int startI ,endI;
       double res;
       if(lengA > lengB){
           int[] temp = nums2; nums2 = nums1;nums1 = temp;
           lengA = nums1.length; lengB = nums2.length;
       }
       startI = 0;
       endI = lengA;

       while (startI<endI){
           i = getMiddleIndex(startI,endI);
           j = getJFromI ( i,lengA,lengB );
           if(i == 0){
               if(nums2[j-1] <= nums1[i]){
                   res=getMiddle(i,j,nums1,nums2);
                   return  res;
               }else {
                   startI = i+1;
                   endI = endI;
                   continue;
               }
           }
           if(i == lengA){
               if(nums1[i-1] <= nums2[j]){
                   res=getMiddle(i,j,nums1,nums2);
                   return res;
               }else {
                   startI = startI;
                   endI = i;
                   continue;
               }

           }
           if(j == 0){
               if(nums1[i-1] <= nums2[j]){
                   res=getMiddle(i,j,nums1,nums2);
                   return res;
               }else {
                   startI = startI;
                   endI = i;
                   continue;
               }
           }

           if(nums1[i-1] <= nums2[j] && nums2[j-1] <= nums1[i] ){
               res=getMiddle(i,j,nums1,nums2);
               return res;
           }
           //here needs continue
           if(nums1[i-1] > nums2[j] ){
               startI = startI;
               endI = i;
               continue;
           }else if(nums2[j-1] > nums1[i]){
               startI = i+1;
               endI = endI;
               continue;
           }

       }
       return  getMiddle(startI,getJFromI(startI,lengA,lengB),nums1,nums2);
    }

    private int getJFromI(int i, int lengthA, int lengthB ){
        int total = lengthA + lengthB;
        if(total %2 ==0){
            return total/2 -i;
        }else {
            return (total-1)/2 - i;
        }

    }

    private  double getMiddle(int i,int j,int[] nums1,int[] nums2){
        boolean iseven = ((nums1.length + nums2.length)%2 == 0);
        int left,right;
        if(i == 0){
            if(iseven) {
                left = nums2[j-1];
                if(j!=nums2.length) right = minTwoNumber ( nums1[i],nums2[j] );
                else right = nums1[i];
                return (double)(left+right)/2;
            }else {
                if(j!=nums2.length) right = minTwoNumber ( nums1[i],nums2[j] );
                else right = nums1[i];
                return right;
            }
        }
        //if i ==nums1.length j == 0
        if(i == nums1.length){
            if(iseven){
                if(j!=0) left = maxTwoNumber ( nums1[i-1],nums2[j-1] );
                else left = nums1[i-1];
                right = nums2[j];
                return (double)(left + right)/2;
            }else {
                return nums2[j];
            }
        }
        /*if(j == 0){
            if(iseven){
                left = nums1[nums1.length-1];
                right = nums2[0];
                return ((left+right)/2);
            }else {
                right = nums2[0];
                return right;
            }
         }*/
        if(j == nums2.length){
            if(iseven){
                left = nums2[j-1];
                right = nums1[0];
                return (double)(left + right)/2;
            }else {
                right = nums1[0];
                return right;
            }
        }
        if(iseven){
            left = maxTwoNumber ( nums1[i-1],nums2[j-1] );
            right = minTwoNumber ( nums1[i],nums2[j] );
            return (double)(left+right)/2;
        }else {
            return minTwoNumber ( nums1[i],nums2[j] );
        }
        }

    private int getMiddleIndex(int start,int end){
          return (start + end )/2;
    }

    private  int maxTwoNumber(int a , int b){
        return a>=b?a:b;
    }

    private  int minTwoNumber(int a, int b){
        return a<=b?a:b;
    }

    private double getMiddleFromVector(int[] nums){
        if(nums.length %2 ==0) {
            int left = nums[nums.length/2-1];
            int right = nums[nums.length/2];
            return  (double)(left + right)/2;
        }else {
            int index = (nums.length-1)/2;
            return (double)(nums[index]);
        }

    }
}
