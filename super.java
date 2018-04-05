class a{
	int i,j;
	a(int a,int b)
	{
		this.i=a;
		this.j=b;
	}
}

class b extends a{
	int k;
	b(int a,int b)
	{
		super(a,b);
		this.k=8;
	}
}

class Super{

    public static void main(String a[]){
     	b obj=new b(4,5);
    	System.out.println("obj.k= "+obj.i+"   "+"obj.j= "+obj.j+"   "+"objb.k= "+obj.k);
    }
}