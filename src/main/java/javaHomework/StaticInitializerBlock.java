package javaHomework;
//couldnt get this working either
import java.util.Scanner;
 
public class StaticInitializerBlock {
    public void area(int a, int b){
        System.out.print(a * b);
    }

    


    public static void main(String[]args) {
      //  StaticInitializerBlock a = s;
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        
      //  a.area(A,B);
    }
}
