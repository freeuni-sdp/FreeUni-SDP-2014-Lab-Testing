package source;

public class RectLine {
	private Point p;
	private double height;
	private boolean front; // this flag shows whether it is end line or start

	public RectLine(double x, double y, double height, boolean front) {
		this.p = new Point(x, y);
		this.height = height;
		this.front = front;
	}

	public Point getPoint() {
		return this.p;
	}

	public boolean isFront() {
		return front;
	}

	public void setFront(boolean front) {
		this.front = front;
	}

	public double getX() {
		return this.p.getX();
	}

	public void setX(double x) {
		this.p.setX(x);
	}

	public double getY() {
		return this.p.getY();
	}

	public void setY(double y) {
		this.p.setY(y);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return this.p.toString() + " height: " + this.height + " front: "
				+ this.front;
	}
	public boolean overlapsWith(RectLine l){
		return (l.getY() >= this.getY() && l.getY() <= l.getY() + this.getHeight()) || 
				(this.getY() >= l.getY() && this.getY() <= l.getY() + l.getHeight());
	}
}
