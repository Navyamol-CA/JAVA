import java.util.Scanner;
interface Shapes{
    public void area();
    public void perimeter();
}
class Circle implements Shapes{
        int r;
        public void area(){
            System.out.println("Area of the circle is : "+(3.14*r*r));
        }
        public void perimeter(){
            System.out.println("Perimeter of the circle is : "+(2*3.14*r));
        }
    }


    class Rectangle implements Shapes{
        int l,b;
            public void area(){
                System.out.println("Area of the Rectangle is : "+(l*b));
            }
            public void perimeter(){
                System.out.println("Perimeter of the Rectangle is : "+(2*(l+b)));
            }
        }
    


public class Shape{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle circle=new Circle();
        Rectangle rect=new Rectangle();
        while(true) {
        System.out.println("MENU");
        System.out.println("1.Area of circle\n2.Perimeter of circle\n3.Area of rectangle\n4.Perimeter of rectangle\n5.Exit\n");
        System.out.println("Enter your choice :");
        int ch=sc.nextInt();
            switch (ch) {
                case 1:
                {
                    System.out.println("Enter the radius :");
                    circle.r=sc.nextInt();
                    circle.area();
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the radius :");
                    circle.r=sc.nextInt();
                    circle.perimeter();
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the length :");
                    rect.l=sc.nextInt();
                    System.out.println("Enter the breadth :");
                    rect.b=sc.nextInt();
                    rect.area();
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the length :");
                    rect.l=sc.nextInt();
                    System.out.println("Enter the breadth :");
                    rect.b=sc.nextInt();
                    rect.perimeter();
                    break;
                }
                case 5:
                    return;
                default:
                    System.out.println("Invalid input!!");
                    break;
            }
            System.out.println("--------------------------------------------");
        }
    }
}