package whileLoops;

public class firstAndLatDigit {

	public static void main(String[] args) {
	System.out.println(sumFirstAndLastDigit(125));
	}
	 public static int sumFirstAndLastDigit( int number){
	        int lastDigit= number%10;
	        int firstDigit= 0;
	        if (number <0){
	            return -1;
	        }
	        while(number>0){
	            firstDigit= number%10;
	            System.out.println(firstDigit);
	            number /= 10;
	            }
	            return firstDigit+lastDigit;
	    } 

}
