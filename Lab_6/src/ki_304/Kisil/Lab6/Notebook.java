package ki_304.Kisil.Lab6;

public class Notebook implements IObj
{
private String notebookName;
private int notebookSize;
public Notebook(String nName, int nSize)
{
notebookName = nName;
notebookSize = nSize;
}

public int getSize()
{
return notebookSize;
}
public int compareTo(IObj p)
{
Integer s = notebookSize;
return s.compareTo(p.getSize());
}
public void print()
{
System.out.print("Notebook Name: " + notebookName + ", Photo File Size: " + notebookSize + ";\n");
}
}
