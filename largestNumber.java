import java.util.Arrays;

public class largestNumber {
    public static void main(String[] args) {
        int[] nums = {13, 30, 2, 404, 4, 34, 5, 9};
        System.out.println(largest(nums));
    }

    static String largest(int[] nums) {
        StringBuilder result = new StringBuilder();
        String[] str = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(str, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        if (str[0].equals("0")) {
            return "0";
        }
        for (String s : str) {
            result.append(s);
        }

        return result.toString();
    }
}


