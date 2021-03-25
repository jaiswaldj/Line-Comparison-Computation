
import java.util.Scanner;
public class GeometryUC2 {
    private static final String Len1 = null;
	private static final String Len2 = null;

	public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the x1-coordinates");
			int x1=sc.nextInt();
			System.out.println("Enter the y2-coordinates");
			int y1=sc.nextInt();
			System.out.println("Enter the x2-coordinates");
			int x2=sc.nextInt();
			System.out.println("Enter the y2-coordinates");
			int y2=sc.nextInt();
			System.out.println("Enter the p1-coordinates");
			int p1=sc.nextInt();
			System.out.println("Enter the p2-coordinates");
			int p2=sc.nextInt();
			System.out.println("Enter the q1-coordinates");
			int q1=sc.nextInt();
			System.out.println("Enter the q2-coordinates");
			int q2=sc.nextInt();

			System.out.println("("+x1+", "+y1+")");
			System.out.println("("+x2+", "+y2+")");

			System.out.println("("+p1+", "+p2+")");
			System.out.println("("+q1+", "+q2+")");

			        int len1=(int)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
			        int len2=(int)Math.sqrt(Math.pow((p2-p1),2)+Math.pow((q2-q1),2));

			System.out.println("length Of Line1 is="+len1);
			System.out.println("length of line2 is="+len2);
		}
        Integer L1 = Integer.valueOf(Len1);
        Integer L2 = Integer.valueOf(Len2);
        System.out.println(L1.equals(L2));

    }
}
