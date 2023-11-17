package ki_304.Kisil.Lab6;

public class Book implements IObj
{
private String bookName;
private int usedTimes;
private int size;

public Book(String bName, int bUsed, int bSize)

{
bookName = bName;
usedTimes = bUsed;
size = bSize;
}

public int getSize()
{
return size;
}
public int compareTo(IObj p)
{
Integer s = size;
return s.compareTo(p.getSize());
}
public void print()
{
System.out.print("Book: " + bookName + ", Times used: " + usedTimes +
", Book Size: " + size + ";\n");
}
}