
public class DEBUGthirdmax {
    public static void main(String[] args) {
        int[] input = {2, 2, 3, 1};
        int returned = thirdMax(input);
        System.out.println(returned);
    }

    public static int thirdMax(int[] nums) {
        int firstMax = 0;
        boolean hasFirstMaxBeenSet = false;
        int secondMax = 0;
        boolean hasSecondMaxBeenSet = false;
        int thirdMax = 0;
        boolean hasThirdMaxBeenSet = false;
        int iter = 0;
        while (iter < nums.length) {
            int current = nums[iter];
            if ((hasFirstMaxBeenSet && current == firstMax) ||
                    (hasSecondMaxBeenSet && current == secondMax) ||
                    (hasThirdMaxBeenSet && current == thirdMax)) 
            {
                ++iter;
                continue;
            }
            if (current > firstMax || !hasFirstMaxBeenSet) {
                thirdMax = secondMax;
                if (secondMax + thirdMax != secondMax) {
                    hasThirdMaxBeenSet = true;
                }
                secondMax = firstMax;
                if (firstMax + secondMax != firstMax) {
                    hasSecondMaxBeenSet = true;
                }
                firstMax = current;
                hasFirstMaxBeenSet = true;
                ++iter;
                continue;
            }
            else if (current > secondMax || !hasSecondMaxBeenSet) {
                thirdMax = secondMax;
                if (secondMax + thirdMax != secondMax) {
                    hasThirdMaxBeenSet = true;
                }
                secondMax = current;
                hasSecondMaxBeenSet = true;
                ++iter;
                continue;
            }
            else if (current > thirdMax || !hasThirdMaxBeenSet) {
                thirdMax = current ;
                hasThirdMaxBeenSet = true;
                ++iter;
                continue;
            }
            ++iter;
        }
        return hasThirdMaxBeenSet ? thirdMax : firstMax;
    }
}

