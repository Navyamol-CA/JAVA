public class Product{
		int price;
		int pcode;
		String pname;
	public static void main(String []args)
	{
			
		Product ob1=new Product();
		Product ob2=new Product();
		Product ob3=new Product();
		
		ob1.price=5000;
		ob1.pcode=4022;
		ob1.pname="vivo";
		
		ob2.price=3000;
		ob2.pcode=4023;
		ob2.pname="oppo";
		
		ob3.price=1000;
		ob3.pcode=4024;
		ob3.pname="1 plus";
		System.out.println("Details of the PHONE :");
		System.out.println("\n"+"Name : "+ob1.pname+"\n"+"Code : "+ob1.pcode+"\n"+"Price : "+ob1.price);
		System.out.println("\n"+"Name : "+ob2.pname+"\n"+"Code : "+ob2.pcode+"\n"+"Price : "+ob2.price);
		System.out.println("\n"+"Name : "+ob3.pname+"\n"+"Code : "+ob3.pcode+"\n"+"Price : "+ob3.price+"\n");
		
		if(ob1.price<ob2.price && ob1.price<ob3.price)
		{
		System.out.println("The lowest price has :"+"\n"+"pname : "+ob1.pname+"\n"+"pcode : "+ob1.pcode+"\n"+"price : "+ob1.price);
		}
		else if(ob2.price<ob1.price&&ob2.price<ob3.price)
		{
		System.out.println("The lowest price has :"+"\n"+"pname : "+ob2.pname+"\n"+"pcode : "+ob2.pcode+"\n"+"price : "+ob2.price);
		}
		else
		{
		System.out.println("The lowest price has : "+"\n"+"pname : "+ob3.pname+"\n"+"pcode : "+ob3.pcode+"\n"+"price : "+ob3.price);
		}
	}
}

