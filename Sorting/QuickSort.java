import java.util.*;

public class QuickSort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        quickSort(a, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    static void quickSort(int a[], int low, int high){
        if(low<high){
            int pIndex = partition(a,low,high);
            quickSort(a,low,pIndex-1);
            quickSort(a,pIndex+1,high);
        }
    }

    static int partition(int a[], int low, int high){
        int pivot = a[high];
        int pIndex = low;
        for(int i=low; i<high; i++){
            if(a[i]<=pivot){
                int temp = a[i];
                a[i] = a[pIndex];
                a[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = a[high];
        a[high] = a[pIndex];
        a[pIndex] = temp;
        return pIndex;
    } 
    
}