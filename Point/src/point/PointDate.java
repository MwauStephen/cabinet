package point;

import java.awt.Point;
import java.util.Date;

public class PointDate {

	public static void main(String[] args) {
		String message="KYLE\"STEVENS\"";
		String path="c\\windwows\\...";
		String path1="c\n windwows\\...";
		Date now=new Date();
		Point point1=new Point(1 ,1);
		Point point2=point1;
		point1.x=2;
		System.out.println(now);
		System.out.println(point2);
		System.out.println(message);
		System.out.println(path);
		System.out.println(path1);

	}

}
