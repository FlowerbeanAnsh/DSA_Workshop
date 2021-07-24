
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation2 {
    public void ReverseArray(int arr[] , int start , int end){
        while(start < end){
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
     public void RotateArray(int arr[] , int d , int n){   
            if(d == 0){
                return;
            }
            ReverseArray(arr,0,d-1);
            ReverseArray(arr,d,n-1);
            ReverseArray(arr,0,n-1);
        }
     public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
       int n = kb.nextInt();  //size pf array
       int d = kb.nextInt();  // no of rotations
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = kb.nextInt();
       }
        System.out.println("Array before rotations :"+ Arrays.toString(arr));
       ArrayRotation2 obj = new ArrayRotation2();
     obj.RotateArray(arr, d, n);
        System.out.println("Array after rotations :"+ Arrays.toString(arr));
       
    }
}
