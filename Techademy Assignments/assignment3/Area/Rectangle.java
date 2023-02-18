package Area;

public class Rectangle extends Shape{
    Rectangle(double dim1, double dim2){
        this.dim1= dim1;
        this.dim2= dim2;
    }
    void calculateArea(){
        double area = dim1 * dim2;
        System.out.println("Area of the Rectangle is " + area);
    }
}
