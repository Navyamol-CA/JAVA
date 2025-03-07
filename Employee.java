import java.util.Scanner;
class Employee1{
	int eno;
	String ename;
	String esalary;
	
	Employee1(int eno,String ename,String esalary){
		this.eno=eno;
		this.ename=ename;
		this.esalary=esalary;
	}
	public void display(){
	System.out.println("EMPLOYEE NO:"+" "+this.eno+" "+"NAME:"+this.ename+" "+"SALARY:"+this.esalary);
	System.out.print("\n");
	}
}	
class Employee{
	
	public static void main(String []args){
	int i,flag=1;
		Scanner ip=new Scanner(System.in);
		Employee1 emp[]=new Employee1[3];
		System.out.println("Enter the following details :");
		for(i=0;i<3;i++)
		{
			
			System.out.print("EMPLOYEE NO: ");
			int r=ip.nextInt();
			ip.nextLine();
			System.out.print("NAME: ");
			String n=ip.nextLine();
			System.out.print("SALARY: ");
			String s=ip.nextLine();	
			emp[i]=new Employee1(r,n,s);
			
		}
		System.out.println("Entered details :");
		for(i=0;i<3;i++)
		{
		emp[i].display();
		}
		System.out.println("Enter employee no to search :");
		int s_no=ip.nextInt();
		for(i=0;i<3;i++)
		{
			if(emp[i].eno==s_no)
			{
			System.out.println("Employee found !");
			emp[i].display();
			flag=0;
			break;
			}
		}
		if(flag==1)
		System.out.println("Employee not found!");
	}
}

