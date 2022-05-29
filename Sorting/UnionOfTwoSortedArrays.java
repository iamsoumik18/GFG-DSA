/*
    Given two sorted array. Print the union of the two arrays. Don't print duplicate elements.

    input:
    8
    1 1 2 3 3 5 8 8
    4
    3 5 5 6

    Output:
    1 2 3 5 6 8
*/
import java.util.*;

public class UnionOfTwoSortedArrays {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> list = union(a,b,n,m);
        for(int num: list){
            System.out.print(num+" ");
        }
        sc.close();
    }

    static ArrayList<Integer> union(int a[], int b[], int n, int m){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            if(i>0 && a[i]==a[i-1]){
                i++;
            }else if(j>0 && b[j]==b[j-1]){
                j++;
            }else if(a[i]<b[j]){
                list.add(a[i]);
                i++;
            }else if(a[i]>b[j]){
                list.add(b[j]);
                j++;
            }else{
                list.add(a[i]);
                i++;
                j++;
            }
        }
        while(i<n){
            if(i==0){
                list.add(a[i]);
            }
            if(i>0 && a[i]!=a[i-1]){
                list.add(a[i]);
            }
            i++;
        }
        while(j<m){
            if(j==0){
                list.add(b[j]);
            }
            if(j>0 && b[j]!=b[j-1]){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }

}
