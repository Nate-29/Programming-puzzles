import java.util.HashMap;

class ContainsDuplicate {
    public static void main(String[] args){
        int [] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsDuplicate(nums, k));
    }
    static boolean containsDuplicate(int[] nums, int k) {
        if(nums.length < 2) {
            return false;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]) && (Math.abs(map.get(nums[i]) - i) <= k)) {
                return true;
            }
            else
            {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}