class PTToStrings{
	public static void main(String args[])
	{
		byte d = 127;
		String e = Byte.toString(d);
		System.out.println(e);
		String f= String.valueOf(e);
		System.out.println(f);
		
		short a = 32767;
		String b = Short.toString(a);
		System.out.println(b);
		String c = String.valueOf(b);
		System.out.println(c);
		
		int g = 1421015127;
		String h = Integer.toString(g);
		System.out.println(h);
		String i = String.valueOf(h);
		System.out.println(i);
		
		long j = 14210151279882388L;
		String k = Long.toString(j);
		System.out.println(k);
		String l = String.valueOf(k);
		System.out.println(l);
		
		float m = 1421015127f;
		String n = Float.toString(m);
		System.out.println(n);
		String o = String.valueOf(n);
		System.out.println(o);
		
		double p = 14210151279828388d;
		String q = Double.toString(p);
		System.out.println(q);
		String r = String.valueOf(q);
		System.out.println(r);
	}
}
