import java.util.*;

/*
    Given an array of integers and a number K. Find the count of 
    distinct elements in every window of size K in the array.

    Input:
    7
    1 2 1 3 4 3 3
    4
    
    Output: 
    3 4 3 2 
*/

public class CountDistinctElementsInEveryWindowK {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> list = getCount(a, n, k);
        for(int num: list){
            System.out.print(num+" ");
        }
        sc.close();
    }

    static ArrayList<Integer> getCount(int a[], int n, int k){
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<k; i++){
            mp.put(a[i], mp.getOrDefault(a[i], 0)+1);
        }
        int cnt = mp.keySet().size();
        list.add(cnt);
        for(int i=k; i<n; i++){
            mp.put(a[i], mp.getOrDefault(a[i], 0)+1);
            if(mp.get(a[i-k])==1){
                mp.remove(a[i-k]);
            }else{
                mp.put(a[i-k], mp.getOrDefault(a[i-k], 0)-1);
            }
            cnt = mp.keySet().size();
            list.add(cnt);
        }
        return list;
    }
    
}
