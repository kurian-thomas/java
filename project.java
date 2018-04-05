class Author {
	private String name;
	private String email;
	private char gender;
   	public String getauthordetails(){
		return "author name: "+name+" email: "+email+" gender: "+gender;
	}
	Author(String name,String email,char gender){

		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book{
	private String bname;
	private Author author;
	private double price;
	private int qty;

	Book(String bname,Author author,double price,int qty){

		this.bname=bname;
		this.author=author;
		this.price=price;
		this.qty=qty;

	}

	public String getbookdetails(){
		return "book name: "+bname+" price: "+price+" quantity: "+qty;
	}
	public String getdetails(){
		return "book name: "+bname+" price: "+price+" quantity: "+qty+System.lineSeparator()+" author details: "+author.getauthordetails();
	}
}


class cs extends Book{
	private String department="CS";
	cs(String name,Author author,double price,int qty){

		super(name,author,price,qty);

	}
	public String getbookdetails(){
	return department+" : "+System.lineSeparator()+super.getbookdetails();
	}
}

class ec extends Book{
	private String department="EC";
	ec(String name,Author author,double price,int qty){

		super(name,author,price,qty);

	}
	public String getbookdetails(){
	return department+" : "+System.lineSeparator()+super.getbookdetails();
	}
}

class ee extends Book{
	private String department="EE";
	ee(String name,Author author,double price,int qty){

		super(name,author,price,qty);

	}
	public String getbookdetails(){
	return department+" : "+System.lineSeparator()+super.getbookdetails();
	}
}



class project{

     public static void main(String[] args) {

     	Book obj[]=new Book[3];
     	Author auth1=new Author("kurian","kuriant719@gmail.com",'m');
     	Author auth2=new Author("augustine","augu719@gmail.com",'m');
        Author auth3=new Author("adarsh","adarsh719@gmail.com",'m');
        cs obj1=new cs("book1",auth1,22.2,2);
        ec obj2=new ec("book2",auth2,88.2,79);
        ee obj3=new ee("book3",auth3,35.2,7);
        System.out.println(obj1.getbookdetails());
        System.out.println("");
        System.out.println(obj2.getbookdetails());
        System.out.println("");
        System.out.println(obj3.getbookdetails());
        System.out.println("");
        System.out.println("");
        System.out.println("                             ALL BOOK DETAILS                           ");

        obj[0]=new cs("book1",auth1,22.2,2);
        obj[1]=new ec("book2",auth2,88.2,79);
        obj[2]=new ee("book3",auth3,35.2,7);
        for(int i=0;i<4;i++)
        {
        	System.out.println("");
        	System.out.println(obj[i].getdetails());
        }
     }
}