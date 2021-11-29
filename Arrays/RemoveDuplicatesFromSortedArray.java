import java.util.*;

class RemoveDuplicatesFromSortedArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sz = removeDuplicates(a, n);
        for(int i=0; i<sz; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    static int removeDuplicates(int a[], int n){
        int cur = 1;
        for(int i=1; i<n; i++){
            if(a[cur-1]!=a[i]){
                a[cur] = a[i];
                cur++;
            }
        }
        return cur;
    }

}