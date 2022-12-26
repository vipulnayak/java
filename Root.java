import java.io.*;
class Root
{
	public static void main(String args[]) throws IOException
	{
	double a,b,c,d,root1,root2,real,imaginary;
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	a=Double.parseDouble(br.readLine());
	b=Double.parseDouble(br.readLine());
	c=Double.parseDouble(br.readLine());
	d=b*b-4*a*c;
	if(d>0)
		{
		root1=(-b+Math.sqrt(d))/(2*a);
		root2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("Roots are : " +root1+root2);
		}
	if(d==0)
			{
			root1=root2=(-b)/(2*a);
			System.out.println("Roots are : " +root1);
			}
	else
		{
		real=(-b)/(2*a);
		imaginary=(Math.sqrt(-d))/(2*a);
		System.out.println("Roots1 : " +real);
		System.out.println("Roots2 : " +imaginary);
		}
	}
}
