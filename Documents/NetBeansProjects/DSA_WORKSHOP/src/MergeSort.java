import java.util.Arrays;

public class MergeSort {
    int temp[];
    int array[];
    int len;
    public static void main(String[] args) {
        int arr[] = {12,4,5,56,21,45,2,0};
        System.out.println("Array before sorting : "+ Arrays.toString(arr));
        MergeSort obj = new MergeSort();
        obj.sort(arr);
        System.out.println();
        System.out.println("Array after sorting : "+ Arrays.toString(arr));

    }
    public void sort(int arr[]){
        this.array= arr;
        this.len= arr.length;
        this.temp = new int[len];

        divideArray(0,len-1);


    }
    public void divideArray(int low,int high){
        int middle = (low+high)/2;
        if(low<high){
            divideArray(low,middle);
            // it will divide the left subarray
            divideArray(middle+1,high);
            // it will divide the right subarray

            mergeArray(low,middle,high);
        }
    }
    public void mergeArray(int low,int middle,int high){
        for(int i=low;i<=high;i++){
            temp[i] = array[i];
        }
        int i = low;
        int j = middle+1;
        int k = low;
        while(i<=middle && j<=high){
            if(temp[i]< temp[j]){
                array[k] = temp[i];
                i++;
            }
            else{
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=middle){
            array[k] = temp[i];
            i++;
            k++;
        }

    }
}
