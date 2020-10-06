public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        //Initializes the ranges of the array
        int middleIndex = data.length / 2;
        int low = 0;
        int high = data.length - 1;

        //Checks the middle number of the array to see if the requested number matches.
        //Performs binary search until number is found.
        for (int i = 0; i < data.length; i++) {
            if (target == data[middleIndex])
                return middleIndex;
            if (target > data[middleIndex]) {
                int increaseMiddleBy = (high - middleIndex) / 2;
                low = middleIndex;
                middleIndex = middleIndex + increaseMiddleBy;
            } else {
                int decreaseMiddleBy = (middleIndex - low) / 2;
                high = middleIndex;
                middleIndex = middleIndex - decreaseMiddleBy;
            }
        }
        return -1; // Place holder
    }
}
