/*Bài tập 4: Nhập vào kích thước ô vuông n*n, kiểm tra 3 <= n <= 8. Hiển thị ra màn hình kết quả như ví dụ sau. 
1  2  3  4  
12 13 14 5
11 16 15 6
10 9  8  7
*/

package week2;

import java.util.*;

public class Exercise4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of square matrix: ");
        int n;
        while(true){
            n = sc.nextInt();
            if(n >= 3 && n <= 8) break;
            else{
                System.out.println("Please enter a size between 3 and 8.");
                System.out.print("Enter the size of square matrix: ");
            }
        }
        int[][] a = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1;
        int num = 1;
        while(num <= n*n){
            for(int i=left; i<=right; i++){ //Left to Right, Top++
                a[top][i] = num++;
            }
            top++;
            for(int i=top; i<=bottom; i++){ //Top to bottom, Right--
                a[i][right] = num++;
            }
            right--;
            for(int i=right; i>=left; i--){ //Right to left, Bottom--
                a[bottom][i] = num++;
            }
            bottom--;
            for(int i=bottom; i>=top; i--){ //Bottom to top, Left++
                a[i][left] = num++;
            }
            left++;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%-3d", a[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
