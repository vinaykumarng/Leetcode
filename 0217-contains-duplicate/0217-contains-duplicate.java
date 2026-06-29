class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();

        for(int num : nums)
        {
            if(intSet.contains(num))
                return true;

            intSet.add(num);
        }

        // int arrSize = nums.length;
        // int setSize = intSet.size();

        // if(arrSize == setSize)
        //     return false;
        // else
        //     return true;\

        return false;
    }
}