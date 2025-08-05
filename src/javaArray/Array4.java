package javaArray;

public class Array4 {
    public static void main(String[] args) {
        //defining multi dimensional Array
        int a[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};

        //total number of rows
        int row = a.length;
        System.out.println("Total No. of rows are: " + row);

        //total number of columns
        int column = a[0].length;
        System.out.println("Total No. of columns are: " + column);

        //Print all data
        //Outer loop
        for (int i=0; i<row; i++){
            {
                //inner loop
                for (int j=0; j<column; j++){
                    System.out.print(a[i][j] + "  ");
                }
                System.out.println();

            }
        }
    }
}
