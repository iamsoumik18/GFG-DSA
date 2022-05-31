/*
    Given a collection of Intervals, the task is to merge all of the overlapping Intervals.

    Input:
    4
    2 4
    1 3
    9 10
    6 8

    Output:
    1 4
    6 8
    9 10
*/

import java.util.*;

public class OverlappingIntervals{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int intervals[][] = new int[n][2];
        for(int i=0; i<n; i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int res[][] = overlappedInterval(intervals);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i][0]+" "+res[i][1]);
        }
        sc.close();
    }

    static int[][] overlappedInterval(int [][] intervals){
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int[] set: intervals){
            if(set[0]<=end){
                end = Math.max(end, set[1]);
            }else{
                list.add(new int[]{start,end});
                start = set[0];
                end = set[1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }

}