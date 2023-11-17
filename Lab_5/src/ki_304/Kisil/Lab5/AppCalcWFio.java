package ki_304.Kisil.Lab5;
import static java.lang.System.out;

import java.io.*;
import java.util.*;

public class AppCalcWFio {
	/**
	* @param args
	*/
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
	// TODO Auto-generated method stub

	Equations one = new Equations();
	CalcWFio obj = new CalcWFio();
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter data: ");
	double data = scan.nextDouble();
	
		try {
	double result = one.calculate(data);
	obj.insertInCalcWFio(result);
	System.out.println("Result is: " + result);
	obj.writeResTxt("textRes.txt");
	obj.writeResBin("BinRes.bin");
	obj.readResBin("BinRes.bin");
	System.out.println("Result is: " + obj.getResult());
	obj.readResTxt("textRes.txt");
	System.out.println("Result is: " + obj.getResult());
		}
		catch (CalcException ex)
		{
		// Блок перехоплює помилки обчислень виразу
		out.print(ex.getMessage());
		}
		}
		}
