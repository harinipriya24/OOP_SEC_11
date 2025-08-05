package Examples;

public class EvenOddcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
            System.out.println("enter the number");
            return;
        }

        int number = Integer.parseInt(args[1]);

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

	}

}
