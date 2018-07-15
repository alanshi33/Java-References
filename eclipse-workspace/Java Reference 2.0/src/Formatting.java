
public class Formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
		
		int degrees = 30;
		double radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", 
				degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
		
		degrees = 60;
		radians = Math.toRadians(degrees);
		System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", 
				degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
	}

}
