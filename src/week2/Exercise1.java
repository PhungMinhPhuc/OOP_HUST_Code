/*Bài tập 1: Viết chương trình tráo đổi ngẫu nhiên vị trí một dãy số cho trước
• Để lấy một số int ngẫu nhiên từ 0 đến n-1 ta dùng lệnh
• int i = Random.nextInt(n); */

package week2;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int array[] = new int [n];
        Random random = new Random();
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Before shuffle:");
        for(int i : array){
            System.out.print(i + " ");
        }
        for(int i = n-1; i > 0; i--){
            int j = random.nextInt(i+1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("\nAfter shuffle:");
        for(int i: array){
            System.out.print(i + " ");
        }
        sc.close();
    }
}