package ki_304.Kisil.Lab4;

	import java.util.Scanner;
	import java.io.*;
	import static java.lang.System.out;
public class ExpressionCalculation {
	
	/**
	* Class <code>EquationsApp</code> Implements driver for Equations class
	* @author EOM Stuff
	* @version 1.0
	*/
	
	/**
	* @param args
	*/
	public static void main(String[] args)
	{
	try
	{
		double res;
	out.print("Enter file name: ");
	Scanner in = new Scanner(System.in);
	String fName = in.nextLine();
	PrintWriter fout = new PrintWriter(new File(fName));
	try
	{
	try
	{
	Equations eq = new Equations();
	out.print("Enter X: ");
	res = eq.calculate(in.nextDouble());
	fout.print(res);
	out.print(res);
	}
	finally
	{
	// Цей блок виконається за будь-яких обставин
	fout.flush();
	fout.close();
	}
	}
	catch (CalcException ex)
	{
	// Блок перехоплює помилки обчислень виразу
	out.print(ex.getMessage());
	}
	}
	catch (FileNotFoundException ex)
	{
	// Блок перехоплює помилки роботи з файлом навіть якщо вони
	// виникли у блоці finally
	out.print("Exception reason: Perhaps wrong file path");
	}
	}
	}
	/**
	* Class <code>CalcException</code> more precises ArithmeticException
	* @author EOM Stuff
	* @version 1.0
	*/
	class CalcException extends ArithmeticException
	{
	public CalcException(){}
	public CalcException(String cause)
	{
	super(cause);
	}
	}
	/**
	* Class <code>Equations</code> implements method for ((2 / tg(x)) / x) expression
	* calculation
	* @author EOM Stuff
	* @version 1.0
	*/
	class Equations
	{
	/**
	* Method calculates the ((2 / tg(x)) / x) expression
	* @param <code>x</code> Angle in degrees
	* @throws CalcException
	*/
	public double calculate(double x) throws CalcException
	{
	double y, rad, rad1;
	rad = x * Math.PI / 180.0;
	rad1=(2*x-4)* Math.PI / 180.0;
	try
	{
	
	y = Math.sin(rad) / Math.sin(rad1);
	// Якщо результат не є числом, то генеруємо виключення
	if (y==Double.NaN || y==Double.NEGATIVE_INFINITY ||
	y==Double.POSITIVE_INFINITY || x==90 || x== -90)
	throw new ArithmeticException();
	}
	catch (ArithmeticException ex)
	{
	// створимо виключення вищого рівня з поясненням причини
	// виникнення помилки
	if (Math.sin(rad1)==0)
	throw new CalcException("Exception reason: denominator = 0");
	else
	throw new CalcException("Unknown reason of the exception during exception calculation");
	}
	return y;
	}
}
