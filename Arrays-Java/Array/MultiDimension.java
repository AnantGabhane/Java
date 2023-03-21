import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //decleration of array
        int[][] arr = new int[3][3];
        // int [][] arr2D = {
        //     {1,2,3}, //0th index
        //     {4,5}, //1st index
        //     {6,7,8,9} //2nd index arr2D [2] = 6 7 8 9;
        // };

        // array.length = no of rows
            System.out.println(arr.length);
            //input array
            for (int i = 0; i < arr.length; i++){
                //for each col in each row  
                for(int j=0; j < arr[i].length; j++){
                    arr[i][j] = in.nextInt();
                };
            }

            //output array
            // for (int i = 0; i < arr.length; i++){
            //     //for each col in each row  
            //     for(int j=0; j < arr[i].length; j++){
            //         System.out.print(arr[i][j] + " ");
            //     };
            //     System.out.println();
            // }
            // for (int i = 0; i < arr.length; i++){
            //     System.out.println(Arrays.toString(arr[i]));
            // }

            //enhanced for loop
            for(int[] a : arr){
                System.out.println(Arrays.toString(a));

            }

    }
}


//output
// ip : 1 23 45 1 5 6 7 8 9 
// op: [1, 23, 45]
// [1, 5, 6]
// [7, 8, 9]