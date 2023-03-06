public class StringMethods {
    public static void main(String[] args) {
        String word = "Meghana";
        String word2= "Kala";
        System.out.println();
        //concatination using concat()
        String word3= word.concat(word2);
        System.out.println(word3);

        //uppercase
        String upperCase = word.toUpperCase();
        System.out.println(upperCase);

        //lowercase
        String lowerCase = word.toLowerCase();
        System.out.println(lowerCase);


        //replace function
        //replacing 'a' with 'e' in String Meghana -> Meghene
        String replace = word.replace('a', 'e');
        System.out.println(replace);
    }    
}
