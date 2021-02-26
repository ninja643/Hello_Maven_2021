package rs.ac.ni.pmf.oop3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle
{
	private double x;
	private double y;
	private double r;

	public boolean intersects(final Circle other)
	{
		final double dx = other.x - this.x;
		final double dy = other.y - this.y;
		final double distance = Math.sqrt(dx * dx + dy * dy);

		return distance <= this.r + other.r;
	}
}
