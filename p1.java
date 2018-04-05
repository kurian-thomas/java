import java.util.Scanner;
class Author{
	String name="author",email="auther@gmail.com";
	char gender='m';
}

class Book {
	 String name;
	Author author;
	double price;
	int qty=0;

	Book(String n,Author auth,double pr){
		this.name=n;
		this.author=auth;
		this.price=pr;
	}
	Book(String n,Author auth,double pr,int qt){
		this.name=n;
		this.author=auth;
		this.price=pr;
		this.qty=qt;
	}
	public String getname(){
		return this.name;

	}
	public double getprice(){
		return this.price;
	}
	public Author author(){
		return this.author;
	}
	public void setprice(){
		this.price=10;
	}
	public int getqty(){
		return this.qty;
	}
	public void setqty(){
		this.qty=98;
	}
	public void tostring(){

		System.out.println("name: "+this.getname());
		System.out.println("price: "+this.getprice());
		System.out.println("quantity: "+this.getqty());
	}


}

class p1{
	public static void main(String arg[]){
		Author auth=new Author();
		Scanner sc=new Scanner(System.in);
		String st;
		int i;
		int[] arry=new int[4];
		/*for(i=0;i<4;i++)
		{
			System.out.println("enter element:");
			arry[i]=sc.nextInt();
		}*/
		st=sc.next();
		Book obj1=new Book("kurian",auth,45.78,10);
		System.out.println("price of book:"+obj1.getprice());
		System.out.println("main output");
		obj1.tostring();
		System.out.println("testing"+st);
		System.out.println("array elements:");
		System.out.println(obj1.name);
		//for(i=0;i<4;i++)
		//	System.out.print(arry[i]);

	}
} 