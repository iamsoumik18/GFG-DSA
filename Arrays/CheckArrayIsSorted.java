import java.util.*;

class CheckArrayIsSorted{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        if(checkSorted(a, n)){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
        sc.close();
    }

    static boolean checkSorted(int a[], int n){
        for(int i=1; i<n; i++){
            if(a[i-1]>a[i]){
                return false;
            }
        }
        return true;
    }

}