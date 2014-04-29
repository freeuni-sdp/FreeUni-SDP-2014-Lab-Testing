package source;

import java.util.Arrays;
import java.util.Comparator;

public class OverlappingRectangles {
	public static boolean Check(Rectangle first, Rectangle second){
		RectLine[] lines = new RectLine[4];
		lines[0] = first.getFrontLine();
		lines[1] = first.getBackLine();
		lines[2] = second.getFrontLine();
		lines[3] = second.getBackLine();
		Arrays.sort(lines, new Comparator<RectLine>() {
			@Override
			public int compare(RectLine o1, RectLine o2) {
				if(o1.getX() == o2.getX())
					if(o1.isFront())
						return -1;
					else
						return 1;
				else if(o1.getX() < o2.getX())
					return -1;
				else
					return 1;
			}
		});
		if(lines[1].isFront())
			return lines[0].overlapsWith(lines[1]);
		return false;
	}
}
