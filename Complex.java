import java.util.Scanner;
public class Complex{
	public static void main(String []args)
	{
		Scanner input=new Scanner(System.in);
		int real1,real2,img1,img2,sumr,sumi;
		System.out.println("Enter the real part of complex no 1 :");
		real1=input.nextInt();
		System.out.println("Enter the imaginary part of complex no 1 :");
		img1=input.nextInt();
		System.out.println("Enter the real part of complex no 2 :");
		real2=input.nextInt();
		System.out.println("Enter the imaginary part of complex no 2 :");
		img2=input.nextInt();
		System.out.println("Sum of the given complex numbers is :");
		sumr=real1+real2;
		sumi=img1+img2;
		System.out.println(sumr+" + "+sumi+"i");
	}
}
