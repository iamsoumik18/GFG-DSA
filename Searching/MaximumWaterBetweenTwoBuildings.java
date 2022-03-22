/*
    Given an integer array representing the heights of N buildings, the task is to 
    delete N-2 buildings such that the water that can be trapped between the remaining 
    two building is maximum.

    Note: The total water trapped between two buildings is gap between them (number of buildings removed) 
    multiplied by height of the smaller building.

    Input:
    6
    2 1 3 4 6 5

    Output:
    8

    Explanation: The heights are 2 1 3 4 6 5.
    So we choose the following buildings
    2,5  and remove others. Now gap between 
    two buildings is equal to 4, and the
    height of smaller one is 2. So answer is
    2 * gap = 2*4 = 8. There is
    no answer greater than this.
*/

import java.util.*;

public class MaximumWaterBetweenTwoBuildings {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(maxWater(a, n));
        sc.close();
    }

    static int maxWater(int a[], int n){ 
        int i = 0, j = n-1;
        int max = 0;
        while(i<j){
            max = Math.max(max,(j-i-1)*Math.min(a[i],a[j]));
            if(a[i]<a[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
    
}
