class newthread implements Runnable{
	String name;
	Thread t;
	newthread(String threadname){
		name=threadname;
		t=new Thread(this,name);
		System.out.println("new thread"+t);
		t.start();
	}

	public void run(){
		try{
			for (int i=5; ; ) {
				
			}
		}
	}
}
