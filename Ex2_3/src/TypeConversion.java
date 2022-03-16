
public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b + i);
		System.out.println(10 / 4);
		System.out.println(10.0 / 4);
		System.out.println((char)0x12340041);
//		line 10 case -> 0x12340041 is hexadecimal so their bit data is 32bit
//		32bit is 4byte and we have to notice typedata of char
//		char type replecent 2byte so top 2byte are skipped.
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}
}
