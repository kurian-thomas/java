class parent{
	int i,j;

}

class child extends parent{
	int k,l=super.i;


public static parent check(parent test,child c,child b){

	if(test.i<c.i)
		return c;
	else
		return b;
}

}
class inheritance{

	public static void main(String a[])
	{
		parent p=new parent(),b;
		child c=new child();
		child test=new child();
		p.i=10;
		p.j=20;
		c.i=100;
		c.j=200;
		c.k=999;
		test.i=1000;
		test.j=2000;
		
        System.out.println("child: "+c.i+" "+c.j+" "+c.k);
        b=child.check(p,test,c);
        System.out.println("return parent container:"+b.i+""+b.j);
        System.out.println("c.l :"+c.l);
         

	}
}