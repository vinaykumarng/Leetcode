class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int max = len/2;

        Map<Integer, Integer> freqMap = new HashMap<>();
        
        int maxFreq = 0;
        int mostFrequentElement = nums[0];

        for (int num : nums) {
            // Increment the count of the element
            int currentFreq = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, currentFreq);

            // Update max frequency tracking variables
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                if(maxFreq > max){
                    return num;
                }
                mostFrequentElement = num;
            }
        }

    return 0;

    }
}