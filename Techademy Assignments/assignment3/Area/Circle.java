package Area;
public class Circle extends Shape{
    Circle(double dim1){
    this.dim1= dim1;

}
void calculateArea(){
    double radius= 3.14;
    double area = radius * dim1 * dim1;
    System.out.println("Area of the Circle is " + area);
}
}
