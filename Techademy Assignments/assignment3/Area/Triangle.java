package Area;
public class Triangle extends Shape{
    Triangle(double base, double height){
        this.dim1= base;
        this.dim2= height;
    }
    void calculateArea(){
        double area = (dim1 * dim2)/2;
        System.out.println("Area of the Triangle is " + area);
    }
}