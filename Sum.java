import java.util.Arrays;

class Sum {
    /*
     * Given an array of integers numbers and an integer target, return indices of the two numbers such that they add up to target
     *You may assume that each input would have exactly one solution, and you may not use the same element more than once.
     */

    public static void main(String[] args) {
        int[] numbers = {0, 1, 10, 2, 4, 7, 3, 15};
        int target = 8;
        System.out.println(Arrays.toString(calculate(numbers, target)));
    }

    static int[] calculate(int[] numbers, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}