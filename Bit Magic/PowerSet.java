import java.io.*;
import java.util.*;

public class PowerSet {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printPowerSet(s);
        sc.close();
    }

    static void printPowerSet(String s){

        int n = s.length();
        int powSize = 1<<n;
        
        for(int counter=0; counter<powSize; counter++){
            for(int j=0; j<n; j++){
                if((counter&(1<<j))!=0){
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

    }
    
}
