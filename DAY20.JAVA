
// import java.util.*;

// class Matrix {
//     public static void main(String[] args) {
//         int[][] mat = new int[3][3];
//         int n = mat.length;
//         int m = mat[0].length;

//         Scanner input = new Scanner(System.in);

//         // Taking input
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 mat[i][j] = input.nextInt();
//             }
//         }

//         // Printing matrix
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(mat[i][j] + " ");
//             }
//             System.out.println(); // new line after each row
//         }
//     }
// }


///spiral matrix
// class Matrix{
//     public static void SpiralMAt(int matrix[][]){
//         int top = 0;
//         int left = 0;
//         int bottom = matrix.length-1;
//         int right = matrix[0].length-1;

//         while(top<=bottom && left<=right){
//             for(int i = left; i<=right; i++){
//                 System.out.println(matrix[top][i]);

//             }
//             top++;
//             for(int j = top; j<=bottom; j++){
//                 System.out.println(matrix[j][right]);
//             }
//             right--;
//             if(top<=bottom){
//                 for(int i = right; i>=left; i--){
//                     System.out.println(matrix[bottom][i]);
//                 }
//                 bottom--;
//             }
//             if(left<right){
//                 for(int i = bottom; i>=top; i--){
//                     System.out.println(matrix[i][left]);
//                 }
//                 left++;
//             }

//         }

//     }
//     public static void main(String[]args){
//         int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         SpiralMAt( matrix);


//     }
// }DAY20.JAVA
