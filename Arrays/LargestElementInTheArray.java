import java.util.*;

class LargestElementInTheArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = largestElement(a, n);
        System.out.println(ans);
        sc.close();
    }

    static int largestElement(int a[], int n){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]>ans){
                ans = a[i];
            }
        }
        return ans;
    }

}