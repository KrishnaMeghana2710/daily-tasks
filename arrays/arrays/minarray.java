package arrays;
import java.util.Scanner;
public class minarray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        min(a);
        sc.close();
    }
    static void min(int a[]){
        int min= a[0];
        for(int i=1; i<a.length; i++){
            if(min>a[i]){
                min= a[i];
            }
        }
        System.out.println(min);
    }

}