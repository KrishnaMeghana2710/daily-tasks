import java.util.HashMap;


public class CountMap {
    public static void main(String[] args) {
        //initializing a map which has key of type integer and its value as string
        HashMap<Integer, String> map= new HashMap<>();

        System.out.println("\nThis is a map representing the names of some of my friends: \n");
        
        //map.put() function adds the key and value to the map
        map.put(1, "Meghana");
        map.put(2, "Mounika");
        map.put(3, "Bhavana");
        map.put(4, "Reshma");

        //printing the map values
        for(int iterator: map.keySet()){
            System.out.println(iterator+" : "+map.get(iterator));
        }
        //printing the size of the map using size() function
        System.out.println("\nSize of the map is "+map.size()+" \n\n");
    }
    
}
