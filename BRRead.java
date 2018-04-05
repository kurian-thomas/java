import java.io.*;
class BRRead{

	public static void main(String[] args) throws IOException {
		String c;
		int b;
		b='A';
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter characters: q to quit");
		do{
			//c=(char)System.in.read();
			//c=(char)ir.read();
			c=(String)br.readLine();
			System.out.println(c);
			System.out.write(b);

		}while(!c.equals("stop"));
	}
}