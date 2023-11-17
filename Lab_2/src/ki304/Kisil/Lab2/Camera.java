package ki304.Kisil.Lab2;

import java.io.*;

/**
* Class <code>Camera</code> implements camera
*/
public class Camera {
private Button PhotoButton;
private Storage	PhotoStorage;
private FocusControl PhotoFocus;
private PrintWriter fout;
/**
* Constructor
* @throws FileNotFoundException
*/
public Camera() throws FileNotFoundException
{
	PhotoButton = new Button();
	PhotoStorage = new Storage();
	PhotoFocus = new FocusControl();
	
	fout = new PrintWriter(new File("Log.txt"));
}

/**
* Constructor
* @param <code>resource</code> Button clicks photo 
* @throws FileNotFoundException
*/

public Camera (int photo) throws FileNotFoundException
{
	PhotoButton = new Button();
	PhotoStorage = new Storage(photo);
	PhotoFocus = new FocusControl();
	
	fout = new PrintWriter(new File("Log.txt"));
}

/**
 * Method simulate increasing focus distance
 */
public void distanceUp()
{

if(PhotoFocus.scrollUp() == true)
{
System.out.print("Focus distance increased by 1 point"+"\n");
fout.print("Focus distance increased by 1 point"+"\n");
}
}
/**
 * Method simulate increasing focus distance
 */
public void distanceDown()
{

if(PhotoFocus.scrollDown() == true)
{
System.out.print("Focus distance decreased by 1 point"+"\n");
fout.print("Focus distance decreased by 1 point"+"\n");
}
}

/**
 * Method simulate checking camera focus distance
 */
public void viewDistance()
{
	System.out.print("Distance now " + PhotoFocus.getFocusDistance() +"\n");
	fout.print ("Distance now  " + PhotoFocus.getFocusDistance() +"\n");
	fout.flush();
}

/**
 * Method simulate checking camera focus distance parameters
 */
public void viewFocusParameters()
{
	System.out.print("Max focus distance " + PhotoFocus.getMaxFocusDistance() 
	+"\n"+"Min focus distance  " + PhotoFocus.getMinFocusDistance() +"\n");
	fout.print ("Max focus distance " + PhotoFocus.getMaxFocusDistance() 
	+"\n"+"Min focus distance  " + PhotoFocus.getMinFocusDistance() +"\n");
	fout.flush();
}

/**
 * Method simulate photographing
 */
public void makeAPhoto()
{
	if(	PhotoButton.clickButton()==true) 
	{
	if (PhotoStorage.makePhoto()==true)
	{
	System.out.print("You make a photo"+"\n");
	fout.print("Photo deleted"+"\n");
	}
	}
}

/**
 * Method simulate photographing many times
 */
public void makeAPhoto(int amount)
{
	for(int i = 0; i<amount;i++) 
{	
	if(	PhotoButton.clickButton()==true) 
	{
	if (PhotoStorage.makePhoto()==true)
	{
	System.out.print("You make a photo"+"\n");
	fout.print("Photo deleted"+"\n");
	}
	}
}
}


/**
 * Method simulate deleting photo
 */
public void deleteAPhoto()
{
	if (PhotoStorage.deletePhoto() == true)
	{
	System.out.print("Photo deleted"+"\n");
	fout.print("Photo deleted"+"\n");
	}
}

/**
 * Method simulate checking camera storage
 */
public void viewStorage()
{
System.out.print("There are " + PhotoStorage.getPhotoNumber() +" photoes in storage"+"\n");
fout.print ("There are " + PhotoStorage.getPhotoNumber() +" photoes in storage"+"\n");
fout.flush();
}

/**
 * Method simulate checking camera storage
 */
public void viewStorageSpace()
{
System.out.print("There are " + PhotoStorage.getPhotoNumberLeft() +" space for photoes in storage"+"\n");
fout.print ("There are " + PhotoStorage.getPhotoNumberLeft() +" space for photoes in storage"+"\n");
fout.flush();
}
/**
 * Method simulate checking button resources
 */
public void viewButtonRes()
{
	System.out.print("There are " + PhotoButton.getButtonResource() +" resources of button left"+"\n");
	fout.print ("There are " + PhotoButton.getButtonResource() +" resources of button left "+"\n");
	fout.flush();
}

/**
 * Method releases used recourses
 */
public void dispose()
{
fout.close();	
}

}