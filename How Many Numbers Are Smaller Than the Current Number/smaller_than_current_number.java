class Solution {
    static int[] smallerNumbersThanCurrent(int[] nums) {

        int one[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    counter++;
            }
            one[i] = counter;
        }
        
        return one;
    }
}
