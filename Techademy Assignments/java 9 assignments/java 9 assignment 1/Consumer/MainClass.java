package Consumer;
import java.util.*;
import java.util.stream.Stream;
class MainClass{
    public static void main(String[] args) {
        //creating an arraylist of type Consumer
        ArrayList<Consumer> list = new ArrayList<>();
        //creating a scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of customers you want to add : ");
        int number = scan.nextInt();
        if(number == 0)
        System.out.println("Invalid input ");
        String id, name;
        int units;

        
        while(number-->0)
        {

            //taking user input for the details
           System.out.println("Enter details:");
           System.out.println("Enter id :");
            id = scan.next();
            System.out.println("Enter name: ");
            name = scan.next();
            System.out.println("Enter units consumed :");
            units = scan.nextInt();
            //creating and 
            //passing the values into the consumer object
            Consumer obj = new Consumer(id, name, units);
            list.add(obj);
           }
           
        scan.close();

           //printing the consumer details
           for(Consumer iterator : list){
            System.out.println(iterator.toString());
        }
        
        //we can print the values using streams with the below statement
        //Stream.of(list).forEach(s->System.out.println(s.toString()));

        //printing using forEach
        //list.forEach(System.out::println);
        
    }
}