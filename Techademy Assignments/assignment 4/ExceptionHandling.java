public class ExceptionHandling {
    public static void main(String[] args) {

        //arrayIndex out of bound exception 
        //creating an array of size 3 and trying to access 5th element
        //this will throw an exception because array size is only 3 
        try{
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nArray index out of bound exception "+e);
        }
        System.out.println();
        //numberformatException
        //numberFormatException occurs when a string cannot be converted into a integer
        try{
            String name = "Meghana";
            System.out.println(Integer.parseInt(name));

        }
        catch(NumberFormatException e){
            System.out.println("Number format exception when a string cannot be converted into an integer "+e);
            System.out.println();
        }
        

        finally{
            System.out.println("This block will be always executed \n");
        }
    }
}
