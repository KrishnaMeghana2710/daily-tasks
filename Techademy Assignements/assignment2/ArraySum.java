import java.util.Scanner;

class ArraySum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int a[]= new int[n];
        int i=0;
        int sum= 0;
        while(i<n){
            a[i]= sc.nextInt();
            sum+= a[i++];
        }
        System.out.println("Sum of all the elements is "+sum);
        sc.close();


    }
}