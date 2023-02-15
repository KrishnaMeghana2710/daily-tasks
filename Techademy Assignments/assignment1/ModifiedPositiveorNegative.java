import java.util.Scanner;

class ModifiedPositiveorNegative{
    public static void main(String[] args) {
        //taking input value from the user
        System.out.println("Enter a number : ");
        //creating a scanner object
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        //if the number is less than 0 then it is a negatuve number
        //else it is a positive number
        if(number<0){
            System.out.println("Number is negative");
        } else{
            System.out.println("Number is positive");
        }
        sc.close();
    }
}