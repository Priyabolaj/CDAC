class Default{
		private boolean b;
		private char c;
		private byte by;
		private short s;
		private int i;
		private float f;
		private long l;
		private double d;
		
		public void types(){
			System.out.println("Default value of boolean :" + b);
			System.out.println("Default value of char :" + c);
			System.out.println("Default value of byte :" + by);
			System.out.println("Default value of short :" + s);
			System.out.println("Default value of int :" + i);
			System.out.println("Default value of float :" + f);
			System.out.println("Default value of long :" + l);
			System.out.println("Default value of double :" + d);
		}
	}
public class Values{
	public static void main(String args[]){
		Default d = new Default();
		d.types();
	}
}
