 package moz.org;

public class Triangle {
	
	//Instead of instatiating the PointClass Manually ,
	//Spring will hnadle the object creationwhich is Dependence Injection
    private  point pointA;
    private  point pointB;
    private  point pointC;
    
	public point getPointA() {
		return pointA;
	}

	public void setPointA(point pointA) {
		this.pointA = pointA;
	}

	public point getPointB() {
		return pointB;
	}

	public void setPointB(point pointB) {
		this.pointB = pointB;
	}

	public point getPointC() {
		return pointC;
	}

	public void setPointC(point pointC) {
		this.pointC = pointC;
		
	}

	public void draw(){
		System.out.println ( "POINT A =(" + getPointA().getX() + "," + getPointA().getY() + ")" );
		System.out.println ( "POINT B =(" + getPointB().getX() + "," + getPointB().getY() + ")" );
		System.out.println ( "POINT C =(" + getPointC().getX() + "," + getPointC().getY() + ")" );
	}
}
