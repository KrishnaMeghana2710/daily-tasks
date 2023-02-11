import java.util.Scanner;

import javax.swing.ImageIcon;

public class AccessArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size eof the array");
        int n= sc.nextInt();
        int a[]= new int[n];
        int i=0;
        while(i<n){
            a[i++]= sc.nextInt();
        }
        i= 0;
        while(i<n){
            System.out.println(i+" element is "+a[i++]);
        }
        sc.close();
    }
}
