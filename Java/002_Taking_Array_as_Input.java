import java.util.*;

class Solution {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
    }
}
