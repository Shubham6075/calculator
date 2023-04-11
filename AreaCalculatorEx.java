public class AreaCalculatorEx {
	public static void main(String[] args) {
		System.out.println("Area : " +area(7.0));
		System.out.println("Area = " +area(8.0,9.0));
	}
	public static double area(double radius) {

		if (radius < 0) {
			return -1.0;
		}

		return radius * radius * Math.PI;
	}

	public static double area(double x, double y) {

		if ((x < 0) || (y < 0) || (x < 0 && y < 0)) {

			return -1.0;
		}

		return x * y;
	}
}
