class BigSmall
{
	public static void main(String args[])
	{
	int a,b,c,d,big,small;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=Integer.parseInt(args[2]);
	d=Integer.parseInt(args[3]);
	big=a;
	small=a;
	if(b>big)big=b;
	if(b<small)small=b;
	if(c>big)big=c;
	if(c<small)small=c;
	if(d>big)big=d;
	if(d<small)small=d;
	System.out.println("big="+big);
	System.out.println("small="+small);
	}
}
