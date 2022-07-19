import java.util.HashMap;

public class Merge {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],i);
        }
        return  hashMap.size() != nums.length;
    }

    public static void main(String[] args) {
        System.out.println(new Merge().containsDuplicate(new int[]{1,4,3,2}));
    }
}
