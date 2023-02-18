public class Rectangle2 {
    //declaring length and breadth values
    int length;
    int breadth;

    //parameterized constructor to initialize length and breadth
    Rectangle2(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    //this method flips the length and breadth values
    static Rectangle2 flipRectangle(Rectangle2 rect){
        //storing the breadth value in a temporary variable to not loose the breadth value
       int temporary = rect.breadth;
         //giving length value to the breadth variable
        rect.breadth = rect.length;
        // giving the breadth value which is stored in temporary variable
        rect.length = temporary;

        //returning the rectangle with new values
          return rect;
    }
    public static void main(String[] args) {
        //creating a rectangle and passing length and breadth values
        Rectangle2 one = new Rectangle2(10, 20);
        //printing the initial length and breadth values
        System.out.println("The parameters of the rectangle before flipping \n"
        +" length: "+one.length+", breadth: "+one.breadth);

        //this statement initializes the rectangle with new values 
        one= flipRectangle(one);
        //printing the updated values
        System.out.println("The parameters of the rectangle after flipping \n"
        +" length: "+one.length+", breadth: "+one.breadth);
        
    }
}
