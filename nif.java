interface in{

	public void pr();
	public void hel();
	interface nes{
		public void nesp();
	} 
}
	
class A implements in.nes{

	/*public void pr(){                         //only if we implements from in
		System.out.println("method 1");
	}
	public void hel(){
		System.out.println("method 2");
	}*/
    public void nesp(){
    	System.out.println("nested interface method 1"); //implements from in.nes

    }
}	
class nif{
	public static void main(String[] args) {
		
	}
}