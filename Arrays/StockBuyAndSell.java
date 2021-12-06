import java.util.*;

/*
    Given an array a of size n.
    The array represents the prizes of
    stock in each day. You have to buy 
    and sell stocks and make maximum profit 
    out of it.

    Input:
    5
    1 5 3 8 12

    Ouput:
    13

    Explanation:
    You can buy stock on 1st day and sell
    it on 2nd day making a profit of (5 - 1) = 4.
    Then you can buy stock on 3rd day and sell 
    it on 5th day making a profit of (12 - 3) = 9.
    Hence, total profit is (4 + 9) = 13. This is the
    maximum profit you can earn.
*/

class StockBuyAndSell{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int profit = maxProfit(a, n);
        System.out.println(profit);
        sc.close();
    }

    static int maxProfit(int a[], int n){
        int profit = 0;
        for(int i=1; i<n; i++){
            if(a[i]>a[i-1]){
                profit += (a[i]- a[i-1]);
            }
        }
        return profit;
    }

}