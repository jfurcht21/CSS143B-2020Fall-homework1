public class Problem2 {
    // Do not change signature (function name, parameters)
    //Sorts array in ascending order
    public static void bubbleSort(int[] data) {
        //Needs a nested for loop to 
        for(int i = 0;i < data.length-1;i++)
        {
            for(int j = 0;j < data.length - i -1; j++)
            {
                int temp;
                if(data[j] > data[j+1])
                {
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}
