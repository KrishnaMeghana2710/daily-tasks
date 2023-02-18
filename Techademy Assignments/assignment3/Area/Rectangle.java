package Area;

public class Rectangle extends Shape{
    Rectangle(double length, double breadth){
        this.dim1= length;
        this.dim2= breadth;
    }
    void calculateArea(){
        double area = dim1 * dim2;
        System.out.println("Area of the Rectangle is " + area);
    }
}
