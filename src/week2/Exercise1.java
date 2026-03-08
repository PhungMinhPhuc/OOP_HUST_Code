package week2;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        int array[] = new int [10];
        int n = array.length;
        Random random = new Random(n);
        for(int i = 0; i < n; i++){
            array[i] = i;
            // System.out.println(array[i]);
        }
        int a = random.nextInt(n);
        int b = random.nextInt(n);
        System.out.println("Vi tri ban dau");
        for(int i : array){
            System.out.print(i + " ");
        }
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        System.out.println("\nVi tri luc sau");
        for(int i: array){
            System.out.print(i + " ");
        }
    }
}