
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double discountRate = 0.0;

	      int purchase = 1250;

	      char cust = 'N';

	 

	      if (purchase > 1000)

	         if (cust == 'Y')

	             discountRate = 0.05;

	         else

	             discountRate = 0.04;

	      else if (purchase > 750)

	         if (cust == 'Y')

	             discountRate = 0.04;

	         else

	             discountRate = 0.03;

	      else

	         discountRate = 0.0;
	      
	      System.out.println(discountRate);
	}

}
