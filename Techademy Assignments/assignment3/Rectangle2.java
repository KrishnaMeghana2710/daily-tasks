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
    //method to display length and breadth values
    public static void display(Rectangle2 rect){
        System.out.println("\nLength of the rectangle is : "+rect.length
        +"\n Breadth of the rectangle is "+rect.breadth);
    }
    public static void main(String[] args) {
        //creating a rectangle and passing length and breadth values
        Rectangle2 one = new Rectangle2(10, 20);
    
        display(one);

        //this statement updates the rectangle with new values 
        one= flipRectangle(one);

        System.out.println("\nAfter updating : ");
        //printing the updated values
        display(one);
        
        
    }
}
