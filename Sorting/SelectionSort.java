import java.util.*;

public class SelectionSort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sort(a, n);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    //unstable sort
    static void sort(int a[], int n){
        for(int i=0; i<n-1; i++){
            int minIdx = i;
            for(int j=i+1; j<n; j++){
                if(a[j]<a[minIdx]){
                    minIdx = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = temp;
        }
    }
    
}
