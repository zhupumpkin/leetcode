package ContainerWithMostWater;

public class Solution {

    private int min(int x, int y){
        return  x < y? x:y;
    }


    private int findNextLeft(int left, int[] height){
        for(int index = left; index < height.length; index ++){
            if( height[index] > height[left] ) return index;
        }
        return height.length - 1;
    }

    private int findNextRight(int right, int[] height){
        for(int index = right; index >=0; index--){
            if( height[index] > height[right] ) return index;
        }
        return 0;
    }

    public int maxArea(int[] height) {
        int left = 0,right =height.length - 1;
        int max = 0;
        int temp;
        while (left < right){
            int hleft = height[left];
            int hright = height[right];
            temp = (right - left) * min ( hleft,hright );
            if(temp > max) max = temp;
            if(hleft < hright) {
                left = findNextLeft(left,height);
                continue;
            }else {
                right  = findNextRight(right,height);
                continue;
            }

        }
        return max;
    }
}
