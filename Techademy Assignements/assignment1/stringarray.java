import java.util.Scanner;

public class stringarray {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        String s[]= new String[n];
        int i=0;
        while(i<n){
            System.out.println("Enter "+i+" string ");
            s[i++]= sc.next();
        }
        i= n-1;
        while(i>=0){
            System.out.println(i+"th string is "+s[i--]);
        }
        sc.close();
    }
    
}
