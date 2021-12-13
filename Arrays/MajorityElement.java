import java.util.*;

/*
    Given an array a of n elements. Find the majority element 
    in the array. A majority element in an array a of size n 
    is an element that appears more than n/2 times in the array.

    Input 1:
    3
    1 2 3

    Output 1:
    -1

    Input 2:
    5
    3 1 3 3 2

    Output 2:
    3
*/

class MajorityElement{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int major = findMajor(a, n);
        System.out.println(major);
        sc.close();
    }

    //Moore's Voting Algorithm
    static int findMajor(int a[], int n){
        int ele = 0, cnt = 0;
        for(int i=0; i<n; i++){
            if(cnt==0){
                ele = a[i];
            }
            if(a[i]==ele){
                cnt++;
            }else{
                cnt--;
            }
        }
        //We count here if the selected element occurs more than n/2 times.
        cnt = 0;
        for(int i=0; i<n; i++){
            if(a[i]==ele){
                cnt++;
            }
        }
        //If count is less than n/2 times then return -1 else the majority element.
        if(cnt<=n/2){
            return -1;
        }
        return ele;
    }

}