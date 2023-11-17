import java.io.*;
import java.util.*;
/**
* Клас Lab1 реалізує приклад програми до лабораторної роботи №1
*/
public class Lab1KisilKI_304
{
/**
* Статичний метод main є точкою входу в програму
* 
* @param args
* @throws FileNotFoundException
* 
*/
public static void main(String[] args) throws FileNotFoundException
{
int nRows;

char[][] arr;
String filler;
Scanner in = new Scanner(System.in);
File dataFile = new File("MyFile.txt");
PrintWriter fout = new PrintWriter(dataFile);
System.out.print("Enter the size of the square matrix:");
nRows = in.nextInt();
in.nextLine();
/* створення рядків матриці */
arr = new char[nRows][];
for(int i = 0; i < nRows/2; i++)
{
arr[i]= new char[i+1];
}
int c=nRows/2;
/* створення стовпців матриці для парних і непарних рядків */
if (nRows%2==0) {
for(int i = nRows/2; i<nRows;i++)
{
arr[i]=new char[c];	
c--;
}
}
else
{
	for(int i = nRows/2; i<nRows;i++)
	{
	arr[i]=new char[c+1];	
	c--;
	}	
}
System.out.print("\nEnter a placeholder character: ");
filler = in.nextLine();
exit:
	 /* заповнення матриці */
	for (int i=0;i<nRows;i++)
{
	for(int k = 0; k<nRows-arr[i].length;k++) {
		System.out.print("  ");	
	}
	for (int j=0; j<arr[i].length;j++)
	{if(filler.length() == 1)
	{
		arr[i][j] = (char) filler.codePointAt(0);
		System.out.print(arr[i][j] + " ");
		fout.print(arr[i][j] + " ");
		}
		else if (filler.length() == 0)
		{
		System.out.print("\nNo placeholder character entered");
		break exit;
		}
		else 
		{
		System.out.print("\nToo many placeholder characters");
		break exit;
		}}
	System.out.print("\n");
	fout.print("\n");
}
fout.flush();
fout.close();
}
}