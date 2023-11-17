package ki_304.Kisil.Lab3;

public class Storage
{
	final int STANDART_NUMB_PHOTO = 1000;
	final int NO_PHOTO = 0;
int photoNumber;
int maxNumber;

/**
 * Constructor
 */
public Storage()
{
photoNumber = NO_PHOTO;
maxNumber = STANDART_NUMB_PHOTO;
}

/**
 * @param <code>num</code> numbers of photos
 */
public Storage(int num)
{
photoNumber = num;	
maxNumber = STANDART_NUMB_PHOTO;
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

public boolean makeVid()
{if(photoNumber<maxNumber)
{
photoNumber=photoNumber+100;
if(photoNumber>maxNumber)
{System.out.print("Storage Error"+"\n");
return false;}
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