import java.util.*;

/*
    Given a sorted array a of size n.
    Print the frequency of all the elements
    present in the array.

    Input:
    6
    10 10 10 25 30 30

    Output:
    10 3
    25 1
    30 2
*/

class FrequenciesInSortedArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        freq(a, n);
        sc.close();
    }

    static void freq(int a[], int n){
        int ele = a[0];
        int cnt = 1;
        for(int i=1; i<n; i++){
            if(a[i]!=ele){
                System.out.println(ele+" "+cnt);
                ele = a[i];
                cnt = 1;
            }else{
                cnt++;
            }
        }
        System.out.println(ele+" "+cnt);
    }

}