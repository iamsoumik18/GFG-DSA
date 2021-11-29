import java.util.*;

class SecondLargestElementInTheArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = secondLargestElement(a, n);
        if(ans==Integer.MIN_VALUE){
            System.out.println("No Second Largest Element Exists!");
        }else{
            System.out.println(ans);
        }
        sc.close();
    }

    static int secondLargestElement(int a[], int n){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(a[i]>first){
                second = first;
                first = a[i];
            }else if(a[i]>second && first!=a[i]){
                second = a[i];
            }
        }
        return second;
    }

}