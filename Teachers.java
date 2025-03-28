import java.util.Scanner;

class Person{
    String pname;
    String gender;
    String address;
    int age;

    Person(String pname,String gender,String address,int age)
    {
        this.pname=pname;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
    void displayPerson()
    {
        System.out.println("Name :"+pname);
        System.out.println("Gender :"+gender);
        System.out.println("Address :"+address);
        System.out.println("Age :"+age);
    }
}

class Employee extends Person{
    int emp_id;
    String com_name;
    String quali;
    int salary;

    Employee(String pname,String gender,String address,int age,int emp_id,String com_name,String quali,int salary){
    super(pname,gender,address,age);
        this.emp_id=emp_id;
        this.com_name=com_name;
        this.quali=quali;
        this.salary=salary;
    }
    void displayEmployee()
    {
        super.displayPerson();
        System.out.println("Emp id :"+emp_id);
        System.out.println("Company Name :"+com_name);
        System.out.println("Qualification :"+quali);
        System.out.println("Salary :"+salary);
    }
}

class Teacher extends Employee{
    String sub;
    String dept;
    int id;

    Teacher(String pname,String gender,String address,int age,int emp_id,String com_name,String quali,int salary,String sub,String dept,int id){
        super(pname,gender,address,age,emp_id,com_name,quali,salary);
        this.sub=sub;
        this.dept=dept;
        this.id=id;
    }
    void displayTeacher()
    {
        super.displayEmployee();
        System.out.println("Subject :"+sub);
        System.out.println("Department :"+dept);
        System.out.println("Teacher id :"+id);
    }
}

class Teachers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the no of teachers :");
        int n=sc.nextInt();
        Teacher tch[]=new Teacher[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the following details ");
            System.out.println("Enter  name :");
            String a=sc.nextLine();
            System.out.println("Enter gender:");
            String b=sc.nextLine();
            System.out.println("Enter address :");
            String c=sc.nextLine();
            System.out.println("Enter age :");
            String d=sc.nextInt();
            System.out.println("Enter EmpID :");
            String d=sc.nextInt();
            System.out.println("Enter salary :");
            String d=sc.nextInt();
            System.out.println("Enter TeacherID :");
            String d=sc.nextInt();
        }
    }
}