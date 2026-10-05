import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N>=2 && N<=20){
            for(int i=1; i<=10; i++){
                int result = N*i;
                System.out.println(N+" "+"x"+" "+i+" "+"="+" "+result);
            }
        }
        else{
            System.out.println("out of range please enter n value between 2 and 20");
        }
        
        bufferedReader.close();
    }
}
