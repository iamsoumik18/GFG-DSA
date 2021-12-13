import java.util.*;

/*
    Given a binary array, we need to find the minimum of number of group 
    flips to make all array elements same.  In a group flip, we can flip 
    any set of consecutive 1s or 0s.

    Input:
    11
    1 0 0 0 1 1 0 0 1 1 1

    Output:
    From 2 to 4
    From 7 to 8
*/

class MinimumConsecutiveFlips{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        flips(a, n);
        sc.close();
    }

    //We will always get minimum flip if we choose the second group.
    static void flips(int a[], int n){
        int ele = 0;
        if(a[0]==ele){
            ele = 1;
        }
        boolean flipStart = false;
        for(int i=0; i<n; i++){
            if(a[i]==ele && !flipStart){
                System.out.print("From "+(i+1)+" to ");
                flipStart = true;
            }else if(a[i]!=ele && flipStart){
                System.out.println((i));
                flipStart = false;
            }
        }
        if(flipStart){
            System.out.println(n);
        }
    }

}