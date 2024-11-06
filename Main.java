import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
	    Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    int n=sc.nextInt();
	    
	    for(double i=1 ; i<=n ; i++){
	        double x=Math.pow(i, 2);
	        double y=Math.pow(i, 3);
	        System.out.printf("%.0f " + "%.0f " + "%.0f%n", i, x, y);
	        }
	        sc.close();
	    }
}
