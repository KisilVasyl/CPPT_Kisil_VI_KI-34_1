package ki304.Kisil.Lab2;

/**
* Class <code>Button</code> implements camera button
*/

public class Button
{
	// Button clicks resource
private int btnResource;
/**
* Constructor
*/
public Button()
{
btnResource = 100000;
}

/**
* Constructor
* @param <code>res</code> Button clicks resource
*/
public Button(int res)
{
btnResource = res;	
}

/**
* Method simulates Button clicking
*/
public boolean clickButton()
{if(btnResource>0)
{
btnResource--;	
return true;
}
else {
System.out.print("Broken button"+"\n");
return false;}
}

/**
 * Method returns button clicks resource available
 * @return Button clicks resource available
 */
public int getButtonResource()
{
	return btnResource;
}
}
