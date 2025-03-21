public class Shapes {
    void area(double r)
    {
        System.out.println("Area of the circle with radius "+r+" is "+3.14*r*r);
    }
    void area(int l,int b)
    {
        System.out.println("Area of the rectangle with length and breadth "+l+","+b+" is "+l*b);
    }
    void area(int s)
    {
        System.out.println("Area of the square with side "+s+" is "+s*s);
    }
    void area(double b,double h)
    {
        System.out.println("Area of the triangle with base and height "+b+","+h+" is "+0.5*b*h);
    } 
    public static void main(String args[])
    {
        Shapes obj=new Shapes();
        obj.area(3.0);
        obj.area(3);
        obj.area(3,4);
        obj.area(6.0,2.0);

    }
}

