import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {12,4,34,3,23,45,67,51,17,0,1,33};
        System.out.println("Array before sorting is : "+ Arrays.toString(arr));
        int low = 0;
        int high = arr.length-1;
        QuickSort obj = new QuickSort();
        obj.quickSorting(arr,low,high);
        System.out.println("Array after sorting is : "+ Arrays.toString(arr));

    }
    // Partition
    public int partition(int arr[],int low,int high){
        int pivot = arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;

    }
    public void quickSorting(int arr[],int low,int high){
        int pi = partition(arr,low,high);
        if(low < pi-1){
            quickSorting(arr,low,pi-1);
        }
        if(pi < high){
            quickSorting(arr,pi,high);
        }
    }
}
