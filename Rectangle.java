package graphics;

public class Rectangle implements Figure{
    int l,b;
    public void area(){
        System.out.println("Area of the Rectangle is : "+(l*b));
    }
}