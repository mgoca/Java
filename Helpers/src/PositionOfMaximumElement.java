public class PositionOfMaximumElement {

    public int positionOfMaxEl(int[]arr){

        int index=0;
        int max = arr[index];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index=i;
            }
        }
        return index;
    }
}
