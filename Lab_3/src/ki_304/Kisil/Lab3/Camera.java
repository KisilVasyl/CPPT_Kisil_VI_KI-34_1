package ki_304.Kisil.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
* Class <code>Camera</code> implements camera
*/
public abstract class Camera {
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
public abstract void distanceUp();

/**
 * Method simulate increasing focus distance
 */
public abstract void distanceDown();

/**
 * Method simulate checking camera focus distance
 */
public abstract void viewDistance();

/**
 * Method simulate checking camera focus distance parameters
 */
public abstract void viewFocusParameters();
/**
 * Method simulate photographing
 */
public abstract void makeAPhoto();

/**
 * Method simulate photographing many times
 */
public abstract void makeAPhoto(int amount);



/**
 * Method simulate deleting photo
 */
public abstract void deleteAPhoto();

/**
 * Method simulate checking camera storage
 */
public abstract void viewStorage();

/**
 * Method simulate checking camera storage
 */
public abstract void viewStorageSpace();
/**
 * Method simulate checking button resources
 */
public abstract void viewButtonRes();

/**
 * Method releases used recourses
 */
public abstract void dispose();

}