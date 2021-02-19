package rs.ac.ni.pmf.oop3;

public class Circle
{
	private double x;
	private double y;
	private double r;

	public Circle(double x, double y, double r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public double getR()
	{
		return r;
	}

	public boolean intersects(final Circle other)
	{
		final double dx = other.x - this.x;
		final double dy = other.y - this.y;
		final double distance = Math.sqrt(dx * dx + dy * dy);

		return distance <= this.r + other.r;
	}
}
