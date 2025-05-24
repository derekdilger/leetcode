class Solution {
    public int thirdMax(int[] nums) {
        {
            int firstMax = 0;
            boolean hasFirst = false;
            int secondMax = 0;
            boolean hasSecond = false;
            int thirdMax = 0;
            boolean hasThird = false;
            int iter = 0;
            while (iter < nums.length) {
                int current = nums[iter];
                if ((hasFirst && current == firstMax) ||
                        (hasSecond && current == secondMax) ||
                        (hasThird && current == thirdMax)) 
                {
                    ++iter;
                    continue;
                }
                if (current > firstMax || !hasFirst) {
                    thirdMax = secondMax;
                    if (secondMax + thirdMax != secondMax) {
                        hasThird = true;
                    }
                    secondMax = firstMax;
                    if (firstMax + secondMax != firstMax) {
                        hasSecond = true;
                    }
                    firstMax = current;
                    hasFirst = true;
                    ++iter;
                    continue;
                }
                else if (current > secondMax || !hasSecond) {
                    thirdMax = secondMax;
                    if (secondMax + thirdMax != secondMax) {
                        hasThird = true;
                    }
                    secondMax = current;
                    hasSecond = true;
                    ++iter;
                    continue;
                }
                else if (current > thirdMax || !hasThird) {
                    thirdMax = current ;
                    hasThird = true;
                    ++iter;
                    continue;
                }
                ++iter;
            }
            return hasThird ? thirdMax : firstMax;
        }
    }
}
