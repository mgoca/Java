public class PositionOfMinimumElement {

    public int positionOfMinEl(int[] arr) {

        int index = 0;
        int min = arr[index];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
