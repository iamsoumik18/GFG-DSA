import java.util.*;

/*
    Given an array A of positive integers. 
    Your task is to find the leaders in the array. 
    An element of array is leader if it is greater 
    than or equal to all the elements to its right side. 
    The rightmost element is always a leader.

    Input:
    7
    7 10 4 3 6 5 2

    Output:
    10 6 5 2
*/

class LeadersInAnArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> list = leaders(a, n);
        for(int num: list){
            System.out.print(num+" ");
        }
        sc.close();
    }

    static ArrayList<Integer> leaders(int a[], int n){
        ArrayList<Integer> list = new ArrayList<>();
        int prev = a[n-1];
        for(int i=n-2; i>=0; i--){
            if(a[i]>=prev){
                list.add(prev);
                prev = a[i];
            }
        }
        list.add(prev);
        Collections.reverse(list);
        return list;
    }

}