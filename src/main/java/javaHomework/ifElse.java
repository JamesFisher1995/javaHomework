package javaHomework;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class ifElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N%2 ==1){
            System.out.print("weird");
        }
        if(N%2==0 && N<=5 && N>=2){
            System.out.print("not weird");
        }
        if(N%2==0 && N<=20 && N>=6){
            System.out.print("weird");
        }
        if(N%2==0 && N>20 ){
            System.out.print("weird");
        }
    }
}
