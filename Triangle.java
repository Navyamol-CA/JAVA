package graphics;

public class Triangle implements Figure{
    public int base,h;
    public void area(){
        System.out.println("Area of the Triangle is : "+(0.5*base*h));
    }
}
