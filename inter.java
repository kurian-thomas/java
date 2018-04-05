interface callback{
	void call_back();
}

class client implements callback{

	public void call_back(){
		System.out.println("hello from the interface side");
	}
}

class inter{
	public static void main(String[] args) {
		callback c=new client();
		c.call_back();
	}
}