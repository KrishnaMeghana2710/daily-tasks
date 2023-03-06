import java.util.Scanner;

class ArraySum{
    
    public static void main(String[] args) {
        //creating a scanner object
        Scanner sc = new Scanner(System.in);
        //taking the size of the array
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        //initializing the array with the given size
        int array[] = new int[size];
        int iterator=0;
        int sum = 0;
        //iterating the array
        System.out.println("Enter " + size + " elements into the array");
        while(iterator<size){
            array[iterator] = sc.nextInt();
            //adding every element to the sum value
            sum+= array[iterator++];
        }
        //printng the sum
        System.out.println("Sum of all the elements is " + sum);
        //closing the scanner object
        sc.close();


    }
}