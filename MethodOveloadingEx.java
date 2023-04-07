public class MethodOveloadingEx {
	public static void main(String[] args){
     System.out.println("Sum : " +sum(3,4));
	 sum(3.5,5.6,7.8);
	}

	public static int sum(int a, int b){
		int c = a+b;
		return c;
	}

	public static void sum(double a , double b, double c){
		double d = a+b+c;
		System.out.println("D : " +d);
	}
}
