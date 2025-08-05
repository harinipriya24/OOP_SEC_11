package stask1;

public class Primitivetoobject {

	public Primitivetoobject() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a=20;  
		   Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		   Integer j=a; //autoboxing, now compiler will write Integer.valueOf(a) internally  
		   System.out.println(a+" "+i+" "+j);  
		

	}

}
