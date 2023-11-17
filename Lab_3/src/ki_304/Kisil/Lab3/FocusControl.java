package ki_304.Kisil.Lab3;

/**
 * Class <code>FocusControl</code> implement focus adjustment scroller
 */
public class FocusControl
{
	final int STANDART_LENGTH = 15;
	final int MIN_STANDART_LENGTH = 1;
	final int MAX_STANDART_LENGTH = 30;
	private int length;
	private int maxlength;
	private int minlength;
	
	/**
	 * Constructor
	 */
	 public FocusControl()
	 {
		 length = STANDART_LENGTH;
		 minlength = MIN_STANDART_LENGTH;;
		 maxlength = MAX_STANDART_LENGTH;
	 }
	 
	 /**
	  * @param <code>len</code> Focus distance
	  */
	 public FocusControl(int len)
	 {
		 length = len;
		 minlength = 1;
		 maxlength = 30;
	 }
	 
	 /**
	  * @param <code>len</code> Focus distance
	  * @param <code>max</code> Max Focus distance
	  */
	 public FocusControl(int len, int max)
	 {
		 length = len;
		 minlength = MIN_STANDART_LENGTH;
		 maxlength = max;
	 }
	 /**
	  * Method simulate increasing focus distance
	  */
	 public boolean scrollUp()
	 {
		 if(length == maxlength)
		 {
			 System.out.print("Error (min length)"+"\n");
		 return false;}
		 else 
		 {
		 length=length+1;
		 return true;
		 }
	 }
	 /**
	  * Method simulate decreasing focus distance
	  */
	 public boolean scrollDown()
	 {
		 if(length == minlength)
		 {
			 System.out.print("Error (min length)"+"\n");
		 return false;
		 }
		 else 
		 {
		 length=length-1;
		 return true;	
		 }

	 }
	 /**
	  * Method returns focus distance at the moment
	  * @returns current focus distance 
	  */
	 public int getFocusDistance()
	 {
		 return length;
	 }
	 /**
	  * Method returns max focus distance
	  * @returns current focus distance 
	  */
	 public int getMaxFocusDistance()
	 {
		 return maxlength;
	 }
	 /**
	  * Method returns min focus distance
	  * @returns current focus distance 
	  */
	 public int getMinFocusDistance()
	 {
		 return minlength;
	 }
}
