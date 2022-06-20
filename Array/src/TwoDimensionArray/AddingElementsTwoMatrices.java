package TwoDimensionArray;

public class AddingElementsTwoMatrices {
    public static void main(String[] args) {

        int first[][]={{1,2,3},{4,5,6},{7,8,9}};
        int second[][]={{1,1,1},{2,2,2},{3,3,3}};
        int[][] third=new int[3][3];

        System.out.println("Sum of two matrices is: ");
        for (int i = 0; i <first.length ; i++) {
            for (int j = 0; j <first[i].length ; j++) {
                third[i][j]=first[i][j]+second[i][j];
                System.out.print(third[i][j]+", ");
            }
            System.out.println();
        }
    }
}
