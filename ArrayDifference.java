import java.util.*;

public class ArrayDifference {
    public static List<List<Integer>> getDifferences(Set<Integer> setOne, Set<Integer> setTwo) {

        Set<Integer> onlyInOne = new HashSet<>(setOne);
        onlyInOne.removeAll(setTwo);

        Set<Integer> onlyInTwo = new HashSet<>(setTwo);
        onlyInTwo.removeAll(setOne);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(onlyInOne));
        result.add(new ArrayList<>(onlyInTwo));
        return result;
    }
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,3};
        int [] nums2 = {1,1,2,2,2};
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++)
        {
            set1.add(nums1[i]);
        }


        for(int i = 0; i < nums2.length; i++)
        {
            set2.add(nums2[i]);
        }
        System.out.println(getDifferences(set1, set2));
    }
}