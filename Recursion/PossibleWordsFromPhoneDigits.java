import java.io.*;
import java.util.*;

public class PossibleWordsFromPhoneDigits{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        ArrayList<String> list = possibleWords(a, n);
        for(String s: list){
            System.out.println(s);
        }
        sc.close();
    }

    static ArrayList<String> possibleWords(int a[], int n){
        Map<Integer,String> mp = new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
        Deque<Character> dq = new ArrayDeque<>();
        ArrayList<String> list = new ArrayList<>();
        helper(a, 0, n, mp, dq, list);
        return list;
    }

    static void helper(int a[], int i, int n, Map<Integer,String> mp, Deque<Character> dq, ArrayList<String> list){
        if(dq.size()==n){
            StringBuilder sb = new StringBuilder();
            for(char ch: dq){
                sb.append(ch);
            }
            list.add(sb.toString());
            return;
        }
        for(char ch: mp.get(a[i]).toCharArray()){
            dq.addLast(ch);
            helper(a, i+1, n, mp, dq, list);
            dq.removeLast();
        }
    }

}