import java.util.Scanner;
public class AccessArray {
    public static void main(String[] args) {
        //creating a scanner object
        Scanner sc = new Scanner(System.in);
	    //taking the size of the array from the user
        System.out.println("Enter size of the array");
        int arraySize = sc.nextInt();
	    // creating the array of size given from the user
        int array[] = new int[arraySize];
        //initializing the iterator to 0
        int iterator = 0;
	    //taking the array elements input from the user
        while(iterator<arraySize){
            array[iterator++] = sc.nextInt();
        }
        //again making the iterator variable to 0 for traversing the array
        iterator = 0;
         // printing the elements in the array
        while(iterator < arraySize){
            if(iterator == 1){
                System.out.println(iterator + "st index element is " + array[iterator++]);
            } else if(iterator == 2){
                System.out.println(iterator + "nd index element is " + array[iterator++]);
            } else if(iterator == 3){
                System.out.println(iterator + "rd index element is " + array[iterator++]);
            }else{
            System.out.println(iterator + "th index element is " + array[iterator++]);
            }
        }
       //closing the scanner object
        sc.close();
    }
}
