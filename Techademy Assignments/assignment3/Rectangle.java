class Rectangle{

    int length;
    int breadth;
    //default constructor to give default value 10 for length and breadth
    Rectangle(){
        length = 10;
        breadth = 10;
    }

    // parameterized constructor to pass values for length and breadth
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public static void main(String[] args) {
        //creating an object for Rectangle class and calling default constructor

        Rectangle one = new Rectangle();

        //printing default values of length and breadth

        System.out.println("\nThe length and breadth values of the rectangle "
        +"declared in a default constructor are : \n"
        +"length : "+one.length+" \nbreadth: "+one.breadth);

        //creating an object for rectangle class and passing values
        // through parameterized constructor

        Rectangle two= new Rectangle(20, 40);

        //printing the rectangle length and breadth values 
        System.out.println("The length and breadth values of the rectangle declared "
        +"in a parameterized constructor are : \n"
        +"length : "+two.length+" \nbreadth: "+two.breadth);
    }
}
