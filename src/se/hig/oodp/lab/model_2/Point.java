package se.hig.oodp.lab.model_2;

public class Point{
	private Vertex2D p0;
	/**
	 * Creates a simple vertex for a point
	 * @param x
	 * @param y
	 */
	public Point(double x, double y){
		p0 = new Vertex2D(x, y);
	}
	/**
	 * Moves point
	 * @param factor_x
	 * @param factor_y
	 */
	public void moveBy(double d_x, double d_y){
		p0 = p0.moveBy(d_x, d_y);
	}
	/**
	 * Gives point/vertex new coordinates
	 */
	public void moveTo(double x, double y){
		p0 = p0.moveTo(x, y);
	}
	public Vertex2D getPoint(){
		return p0;
	}
	@Override
	public String toString(){
		return "P0:" + p0.toString();
	}
}//end class
