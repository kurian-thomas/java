class exp{
	public static void main(String[] args) {
		int a,d=0;
		try{

			a=33/d;
		}

		catch(ArithmeticException e){

			System.out.println("error error division by zero");
			System.out.println(e);
		}
	}
}
	
