package ki_304.Kisil.Lab6;
import java.util.*;
import java.util.ArrayList;

public class Box <T extends IObj>
{
private ArrayList<T> arr;

public Box()
{
arr = new ArrayList<T>();
}

public void clear()
{
	arr = new ArrayList<T>();
}

public T findMin()
{
if (!arr.isEmpty())
{
T min = arr.get(0);
for (int i=1; i< arr.size(); i++)
{
if ( arr.get(i).compareTo(min) < 0 )
min = arr.get(i);
}
return min;
}
return null;
}

public void sortSize()
{
	Collections.sort(arr);	
}

public void AddData(T data)
{
arr.add(data);
System.out.print("Element added: ");
data.print();
}

public void printContent()
{for(int i=0; i<arr.size();i++)
	{IObj res = arr.get(i);
	res.print();}
}

public void DeleteData(int i)
{
arr.remove(i);
}
}