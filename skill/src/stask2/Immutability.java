package stask2;

public class Immutability {

	public Immutability() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original String: " + original);   // Hello
        System.out.println("Modified String: " + modified);   // Hello World

	}

}
