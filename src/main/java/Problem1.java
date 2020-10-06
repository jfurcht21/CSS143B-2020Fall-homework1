public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        //Initializes the ranges of the array
        int middleIndex = data.length / 2;
        int low = 0;
        int high = data.length - 1;

        //Performs checks to qualify the array before it enters the for loop.
        //If the following conditions are met, these preset values are returned
        if (data == null || data.length == 0) {
            return -1;
        }
        if (data.length == 1 && target != data[0]) {
            return -1;
        }
        if (target == data[0]) {
            return 0;
        }

        //Checks the middle number of the array to see if the requested number matches.
        //Performs binary search until number is found.
        for (int i = 0; i < data.length; i++) {
            if (target == data[middleIndex])
                return middleIndex;
            if (target > data[middleIndex]) {
                low = middleIndex + 1;
                middleIndex = low;
            } else {
                high = middleIndex - 1;
                middleIndex = high;
            }
        }
        return -1; // Place holder
    }
}