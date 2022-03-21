/*
    Given an array arr[] of N positive integers, where elements are consecutive (sorted). 
    Also, there is a single element which is repeating X (any variable) number of times. 
    Now, the task is to find the element which is repeated and number of times it is repeated.

    Note: If there's no repeating element, Return {-1,-1}.

    Input:
    5
    1 2 3 3 4

    Output:
    3 2
*/

import java.awt.Point;
import java.util.Scanner;

public class CountOnlyRepeated {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Point p = findRepeating(a, n);
        System.out.println(p.x+" "+p.y);
        sc.close();
    }

    static Point findRepeating(int a[],int n){
        int l = 0, r = n-1;
        while(l<r){
            int m = (l+r)/2;
            if(a[m]>=m+a[0]){
                l = m+1;
            }else{
                r = m;
            }
        }
        if(n-(a[n-1]-a[0])>1){
            return new Point(a[l],n-(a[n-1]-a[0]));
        }
        return new Point(-1,-1);
    } 
    
}
