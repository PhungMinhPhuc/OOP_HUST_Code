/*Bài tập 3: Viết chương trình nhập chiều cao h từ bàn phím, sau đó hiển thị các tam giác hình sao có chiều cao h như dưới đây. Chú ý có kiểm tra điều kiện của h: 2<=h<=10. Nếu h nằm ngoài đoạn trên, yêu cầu người dùng nhập lại. 
    *
   ***
  *****
 *******
*********
*/

package week2;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int height;
        while(true){
            height = sc.nextInt();
            if(height >=2 && height <= 10){
                break;
            }
            else{
                System.out.println("Please enter a height between 2 and 10.");
                System.out.print("Enter the height: ");
            }
        }
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height - i - 1 ; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i + 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}