package task1;

public class Controlstructure {

	public Controlstructure() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={10,25,30,45,50,65,54 ,65, 96};
        for (int i=0; i < numbers.length; i++){
            if (numbers[i]%2==0) {
                System.out.println("Even number:"+numbers[i]);
            }
        }
	       
	}

}
