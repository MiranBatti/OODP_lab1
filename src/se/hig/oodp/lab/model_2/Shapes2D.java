package se.hig.oodp.lab.model_2;

public abstract class Shapes2D {
	protected Vertex2D p0, centre;
	
	public abstract void moveBy(double d_x, double d_y);
	
	public abstract void scale(double factor_x, double factor_y);
	
	public abstract Vertex2D getP0();
	
	public abstract Vertex2D getCentre();
	
	public abstract String toString();
}// end class
