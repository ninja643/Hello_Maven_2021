package rs.ac.ni.pmf.oop3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoExceptions2
{
	public static void main(String[] args)
	{
		try
		{
			final Circle circle = new Circle(0, 0, -5);

			System.out.println(circle.toString());
		}
		catch (final BadCircleException e)
		{
			System.out.println("Error " + e.getMessage());
		}
	}
}
