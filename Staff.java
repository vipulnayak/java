import java.util.Scanner;S

class Details
{
	Scanner sc=new Scanner(System.in);	
	String name,staff_id,salary,phone;
	
	void getdata()
	{
		
		System.out.println("Name:");
		name=sc.nextLine();
		System.out.println("Salary:");
		salary=sc.nextLine();
		System.out.println("Phone no:");
		phone=sc.nextLine();
		System.out.println("Staff id:");
		staff_id=sc.nextLine();
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("Phone no:"+phone);
		System.out.println("Staff id:"+staff_id);
	}

}
class tea extends Details
{
	Scanner sc=new Scanner(System.in);
	String domain,pub;
	void getDataA()
	{
		System.out.println("Domain:");
		domain=sc.nextLine();
		System.out.println("Publication:");
		pub=sc.nextLine();
	}
	void displayA(){
		System.out.println("Domain:"+domain);
		System.out.println("Publication:"+pub);
	}
}
class tech extends Details
{
	Scanner sc=new Scanner(System.in);
	String skill;
	 
	void getDataB()
	{
		System.out.printline("Skill:");
		skill=sc.nextLine();
	}
	void displayB()
	{
		System.out.println("skill:"+skill);
	}
}
class con extends Details
{
	Scanner sc=new Scanner(System.in);
	int p;
	void getDataC(){
		System.out.println("Priod:");
		p=sc.nextInt();
	}
	void displayC(){
		System.out.println("Priod:"+p);
	}
}
class MainStaff
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,i;
		Tea t1[] = new Tea[10];
		Tech t2[] =new Tech[10];
		Con c1[]=new Con[10];
		System.out.println("Enter the number of staff details ");
		n=sc.nextInt();
			t1[i]=new Tea();
			t2[i]=new Tech();
			c1[i]=new Con();	

		for(i=0;i<n;i++)
		{
			t1[i].getData();
			t1[i].getDataA();
			t2[i].getDataB();
			c1[i].getDataC();

		}
		for(i=0;i<n;i++)
		{
			t1[i].display();
			t1[i].displayA();
			t2[i].displayB();
			c1[i].displayC();
		}
}
	
