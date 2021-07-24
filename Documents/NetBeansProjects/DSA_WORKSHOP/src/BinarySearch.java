
public class BinarySearch {
    public int binary_search(int arr[], int n , int x){
        int l = 0;
        int r = n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] < x){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return -1;
    }
       public static void main(String[] args) {
           int n =8;
           int arr[] = {23,45,21,34,67,89,12,122};
           int x  = 122;
           BinarySearch obj = new BinarySearch();
           System.out.println("Index of " + x +" is "+obj.binary_search(arr, n, x));
        
    } 
    }
        
    

