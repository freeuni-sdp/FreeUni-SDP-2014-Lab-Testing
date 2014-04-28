package source;

public class Rectangle {
	private Point l;
	private Point r;
	public Rectangle(double x0, double y0, double x1, double y1){
		this.l = new Point(x0, y0);
		this.r = new Point(x1, y1);
	}
	public Rectangle(Point l, Point r){
		this.l = l;
		this.r = r;
	}
	public Rectangle(Point l, double width, double height){
		this.l = l;
		this.r = new Point(this.l.getX() + width,
				this.l.getY() + height);
	}
	boolean isInside(Point p){
		return false;
	}
	public double getPerimeter(){
		return 0;
	}
	public double getArea(){
		return this.getHeight() * this.getWidht();
	}
	public double getWidht(){
		return this.r.getX() - this.l.getX();
	}
	public double getHeight(){
		return this.r.getY() - this.l.getY();
	}
	public Point getL() {
		return l;
	}
	public void setL(Point l) {
		this.l = l;
	}
	public Point getR() {
		return r;
	}
	public void setR(Point r) {
		this.r = r;
	}
	
}
