import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {

        int[] input = new int[] {3, 2, 5, 6, 4, 10, 22, 9};
        int[] input2 = new int[] {3, 2, 5};
        int[] input3 = new int[] {3,1};

        Problem2.bubbleSort(input);
        for (int i = 0; i < input.length-1; i++){
            assertTrue(input[i]<input[i+1]);
        }

        Problem2.bubbleSort(input2);
        for (int i = 0; i < input2.length-1; i++){
            assertTrue(input2[i]<input2[i+1]);
        }

        Problem2.bubbleSort(input3);
        for (int i = 0; i < input3.length-1; i++){
            assertTrue(input3[i]<input3[i+1]);
        }
    }
}
