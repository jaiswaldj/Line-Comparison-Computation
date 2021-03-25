import java.util.Scanner;
public class GeometryUC1 {
    public static void main(String args[])
    {
        double lengthofLine = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x1-coordinates");
        int x1=sc.nextInt();
        System.out.println("Enter the y2-coordinates");
        int y1=sc.nextInt();
        System.out.println("Enter the x2-coordinates");
        int x2=sc.nextInt();
        System.out.println("Enter the y2-coordinates");
        int y2=sc.nextInt();
        System.out.println("("+x1+", "+y1+")");
        System.out.println("("+x2+", "+y2+")");
        lengthofLine=(int)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("length Of Line is="+lengthofLine);

    }
    
}

