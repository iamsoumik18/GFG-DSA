import java.util.*; 

/*
    Given an array of integers arr, return true if we can 
    partition the array into three non-empty parts with equal sums.

    Input:
    11
    0 2 1 -6 6 -7 9 1 2 0 1

    Output:
    YES
*/

public class PartitionArrayIntoThreePartsWithEqualSum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        boolean ans = threeEqualParts(a, n);
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }

    static boolean threeEqualParts(int a[], int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i];
        }
        if(sum%3!=0){
            return false;
        }
        int curSum = 0, p = 0;
        for(int i=0; i<n; i++){
            curSum += a[i];
            if(curSum==sum/3){
                curSum = 0;
                p++;
            }
        }
        return p>=3;
    }
    
}
