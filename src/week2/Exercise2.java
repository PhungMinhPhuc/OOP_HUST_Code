package week2;

import java.util.*;

public class Exercise2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        for(int i:arr){
            System.out.print(i + " ");
        }

        // Close the Scanner to avoid resource leak
        sc.close();
    }
}