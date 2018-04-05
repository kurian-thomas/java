class bird{

	double mx,my;

     public double move(){

     	return mx+1%20;
     }

     public void br(){
     	System.out.print("*");
     }
}

class env{

	double ex=1,ey=5;

	public void move_en(){

			ex=(ex++)%20;


	}

}

class flappy{

	public static void main(String[] args) {
		
		env en=new env();
		bird b=new bird();
		double a,i;
		int c=4,u;
		while(c==4){

			a=b.move();
			u=0;
			while(u<=1000)
				u++;

			for(i=a;i>=0;i++)
			b.br();

		}
	}
}