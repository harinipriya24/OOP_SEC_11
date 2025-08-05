package Examples;

public class NumberType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (args.length == 0) {
	            System.out.println("2");
	            return;
	        }

	        int number = Integer.parseInt(args[0]);

	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
        
	}

}
