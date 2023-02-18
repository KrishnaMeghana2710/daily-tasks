package Area;
public class MainClass {
    public static void main(String[] args) {
        
        Rectangle box= new Rectangle(10, 20);
        box.calculateArea();

        Circle ball= new Circle(5);
        ball.calculateArea();

        Triangle cone= new Triangle(10, 20);
        cone.calculateArea();
 }
    
}
