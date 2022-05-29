import java.util.*;

public class MergeSort{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        mergeSort(a, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    static void mergeSort(int a[], int l, int r){
        if(l<r){
            int m = l+(r-l)/2;
            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(int a[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0; i<n1; i++){
            L[i] = a[l+i];
        }
        for(int i=0; i<n2; i++){
            R[i] = a[m+1+i];
        }
        int i=0, j = 0;
        int k = l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                a[k] = L[i];
                i++;
            }else{
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k] = R[j];
            j++;
            k++;
        }
    }

}