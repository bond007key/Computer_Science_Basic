import java.util.*;

/**
 * finding maximum value in an array using Bubble Sort (comparing adjacent elements in an array) method.
 */
public class FindMaxVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements in an array: ");
        int []arr=new int[n];
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Your array is: "+Arrays.toString(arr));
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("/***********************************************/");
        System.out.println("Main Program Starts executing");
        int max=arr[0];
        for (int i = 0; i < n-1; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The biggest element in the array is: "+max);
        sc.close();  
    } 
}

/**
 * Giving wrong output
 * [1, 4, 5, 6, 6, 78, 43, 34, 2, 3, 532, 543, 2, 23, 3, 55, 7, 88, 3, 2, 3, 5, 6, 6, 7, 99, 8, 323, 52, 2352, 5, 523, 55, 5, 556, 990]
 */