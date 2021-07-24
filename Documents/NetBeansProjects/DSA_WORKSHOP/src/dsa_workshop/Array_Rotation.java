

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rotation {
     public void rotate_array(int d , int n, int arr[])
   {
      for(int i=0;i<d;i++){
          rotate(arr,n);
      }
   }
   public void rotate(int arr[] , int n){
       int temp = arr[0];
       for(int i=0;i<n-1;i++){
           arr[i] = arr[i+1];
       }
       arr[n-1] = temp;
       
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
       Array_Rotation obj = new Array_Rotation();
      obj.rotate_array(d, n, arr);
        System.out.println("Array after rotations :"+ Arrays.toString(arr));
       
    }
    
}
      
