package Practice;
import java.util.*;
public class Clock {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int hour=s.nextInt();
		int min=s.nextInt();
		float angle=30*hour;
		if(min!=0) {
			if(angle>min*6) {
				angle+=(float)min/2;
				angle-=6*min;
				}
			else {
				angle-=6*min-(float)min/2;
				}
		}
		System.out.println("clock wise angle btw hour and minute hand is "+Math.abs(angle));
		float smallestAngle=Math.abs(angle);
		if(smallestAngle>180) {
			smallestAngle=360-smallestAngle;
		}
		System.out.println("smallest angle btw hour and minute hand is "+smallestAngle);
	}

}
