import java.io.*;
import java.util.*;

public class FindNoOfDigitsInNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int d = (int)Math.floor((double)Math.log10(n)+1);
        System.out.println(d);
        sc.close();
    }
    
}
