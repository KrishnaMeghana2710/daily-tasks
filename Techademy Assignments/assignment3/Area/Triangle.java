package Area;
public class Triangle extends Shape{
    Triangle(double dim1, double dim2){
        this.dim1= dim1;
        this.dim2= dim2;
    }
    void calculateArea(){
        double area = (dim1 * dim2)/2;
        System.out.println("Area of the Triangle is " + area);
    }
}