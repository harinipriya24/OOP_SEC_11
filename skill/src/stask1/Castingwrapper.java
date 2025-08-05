package stask1;

public class Castingwrapper {

	public Castingwrapper() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Double doubleValue = 12.34;
	        int intValue = doubleValue.intValue(); // casting double to int
	        float floatValue = doubleValue.floatValue(); // casting double to float

	        System.out.println("Double: " + doubleValue);
	        System.out.println("Converted to int: " + intValue);
	        System.out.println("Converted to float: " + floatValue);

	}

}
