import java.util.Arrays;

class maxPairOfBoxes {
    public static void main(String[] args) {
        int[] weights = {1, 7, 3, 5, 9, 14, 22};
        int loadMaxWeight = 15;
        System.out.println(maximumUnits(weights, loadMaxWeight));
    }

    public static int maximumUnits(int[] boxWeight, int loadMaxWeight) {
        Arrays.sort(boxWeight);
        int left = 0;
        int right = boxWeight.length - 1;
        int units = 0;

        while (left < right) {
            if (boxWeight[left] + boxWeight[right] <= loadMaxWeight) {
                left++;
                right--;
                units++;
            } else {
                right--;
            }
        }
        return units;
    }
}