package ki_304.Kisil.Lab5;

public class Equations {
	
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

class CalcException extends ArithmeticException
{
public CalcException(){}
public CalcException(String cause)
{
super(cause);
}
}
