package java_lang_basics;

public class DataTypesAndMaxValues {
	public static void main(String[] args) {
		Byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		
		Short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		
		int minInt = Integer.MIN_VALUE;
		Integer maxInt = Integer.MAX_VALUE;
		
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		
		boolean minBoolean = Boolean.FALSE;
		boolean maxBoolean = Boolean.TRUE;
		
		//Write code for finding the mimimum and maximum values for long, float, double, boolean
		
		
		System.out.println("Minimum Byte value:"+ minByte);
		System.out.println("Maximum Byte value:"+ maxByte);
		
		System.out.println("Minimum short value:"+minShort);
		System.out.println("Maximum short value:"+maxShort);
		
		System.out.println("Minimum integer value:"+minInt);
		System.out.println("Maximum integer value:"+maxInt);
		
		System.out.println("Minimum long value:"+minLong);
		System.out.println("Maximum long value:"+maxLong);
		
		System.out.println("Minimum float value:"+minFloat);
		System.out.println("Maximum float value:"+maxFloat);
		
		System.out.println("Minimum double value:"+minDouble);
		System.out.println("Maximum double value:"+maxDouble);

		System.out.println("Minimum boolean value:"+minBoolean);
		System.out.println("Maximum boolean value:"+maxBoolean);

	}
}
