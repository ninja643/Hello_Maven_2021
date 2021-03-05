package rs.ac.ni.pmf.oop3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Circle
{
	private double x;
	private double y;
	private double r;

	public Circle(double x, double y, double r) throws BadCircleException
	{
		this.x = x;
		this.y = y;

		if (r <= 0)
		{
//			throw new IllegalArgumentException("Radius of a circle must be a positive number");
			throw new BadCircleException("Radius of a circle must be a positive number");
		}

		this.r = r;
	}

	public boolean intersects(final Circle other)
	{
		final double dx = other.x - this.x;
		final double dy = other.y - this.y;
		final double distance = Math.sqrt(dx * dx + dy * dy);

		return distance <= this.r + other.r;
	}
}
