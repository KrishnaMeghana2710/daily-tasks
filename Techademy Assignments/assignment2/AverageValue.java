import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        //creating a scanner object
        Scanner sc = new Scanner(System.in);
        //taking the size of array
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        int iterator = 0;
        int sum= 0;
        //taking values that are to be added into the array
        System.out.println("Enter " + size + " values that are to be added into the array");
        //taking input values into the array
        while(iterator<size){
            array[iterator] = sc.nextInt();
            //adding all the element values to the sum variable
            sum+= array[iterator++];
        }
        iterator = 0;
        float average = 0;
        // taking average of all the elements
        //since average can have floating values
        average = (float) (sum) / size;
        //printing the answer
        System.out.print("Average of ");
        while(iterator < size){
            System.out.print(array[iterator++]+" ");
        }
        System.out.println("is " + average);
        //closing the scanner object
        sc.close();

}
    
}
