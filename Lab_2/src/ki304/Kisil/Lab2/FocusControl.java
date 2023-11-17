package ki304.Kisil.Lab2;


/**
 * Class <code>FocusControl</code> implement focus adjustment scroller
 */
public class FocusControl
{
	private int length;
	private int maxlength;
	private int minlength;
	
	/**
	 * Constructor
	 */
	 public FocusControl()
	 {
		 length = 15;
		 minlength = 1;
		 maxlength = 30;
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
		 minlength = 1;
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
