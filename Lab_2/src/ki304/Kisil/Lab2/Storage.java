package ki304.Kisil.Lab2;
/**
 * <code>Storage</code> implement storage of camera
 */
public class Storage
{
int photoNumber;
int maxNumber;

/**
 * Constructor
 */
public Storage()
{
photoNumber = 0;
maxNumber = 1000;
}

/**
 * @param <code>num</code> numbers of photos
 */
public Storage(int num)
{
photoNumber = num;	
maxNumber = 10000;
}
/**
 * @param <code>num</code> numbers of photos
 * @param<code>max</code> max numbers of photo
 */
public Storage(int num, int max)
{
photoNumber = num;	
maxNumber = max;
}

/**
 * Method simulate deleting photo
 */
public boolean deletePhoto()
{
	if(photoNumber>0) {
photoNumber--;	
return true;}
	else
	{System.out.print("Storage Error"+"\n");
	return false;}
}
/**
 * Method simulate making photo
 */
public boolean makePhoto()
{if(photoNumber<maxNumber)
{
photoNumber++;	
return true;
}
else
{
	System.out.print("Storage Error"+"\n");
	return false;
}

}
/**
 * Method returns numbers of photos in storage
 * @return current number of photos
 */
public int getPhotoNumber()
{
	return photoNumber;
}

/**
 * Method returns numbers of photos in storage
 * @return current number of photos
 */
public int getPhotoNumberLeft()
{
	return maxNumber-photoNumber;
}

}