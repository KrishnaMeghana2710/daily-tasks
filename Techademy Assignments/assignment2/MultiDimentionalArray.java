import java.util.*;
public class MultiDimentionalArray {
    public static void main(String[] args) {
        //creating the 0th row array
        ArrayList<Integer> row0 = new ArrayList<>();
        //adding values into the array
        row0.add(10);
        row0.add(20);
        //creating 1st row array
        ArrayList<Integer> row1 = new ArrayList<>();
        //adding elemnts into it
        row1.add(30);
        row1.add(40);
        row1.add(50);

        //creating 2nd row array
        ArrayList<Integer> row2 = new ArrayList<>();
        //adding elements
        row2.add(60);
        
        //creating a multidimentional array
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        //adding row arrays into the multidimentional array
        list.add(row0);
        list.add(row1);
        list.add(row2);
        //printing the multidimentional array
        System.out.println(list);

 }
    
}
