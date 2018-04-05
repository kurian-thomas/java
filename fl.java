import java.io.*;
class fl{
	public static void main(String[] args) {

		byte i;
		FileInputStream fin;
		try {
			fin = new FileInputStream("elephant.txt");

	do {
		i =(byte)fin.read();
		if(i != -1) System.out.println((char)i);
	} while(i != -1);
	} catch(IOException e) {
	System.out.println("Error Reading File");
	}


		
		
	}
}