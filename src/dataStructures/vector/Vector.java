package dataStructures.vector;

/*
 * Erstellen Sie eine Klasse für einen Vektor in einem karthesischen Kooridinatensystem (x, Y) 
 * 
 * implementieren Sie folgende Funktionalitäten:
 * - setze X und Y (Setter)
 * - lese X, Y (Getter)
 * - Länge/Betrag eines Vektors
 * - Addition von zwei Vektoren
 * - Subtraktion von zwei Vektoren
 * - Multiplikation mit einem Skalar
 * - Slakarprodukt
 * - Winkel zwischen zwei Vektoren
 * 
 */


public class Vector {

	private int x;
	private int y;
	
	// Setter
	public void setX(int x) {
		this.x = x;
	}
	
	// Getter
	public int getX() {
		return x;
	}
	
	// Setter
	public void setY(int y) {
		this.y = y;
	}
	
	// Getter
	public int getY() {
		return y;
	}
	
	// Standardkonstruktor
	public Vector() {
		
	}
	
	public Vector(int x, int y) {
		setX(x);
		setY(y);
	}
	
		
	// Getter & Setter für Y in C#
	// public int Y { get; set; }
	
	
	//length of vector
	public double length() {
		//double num= (Math.sqrt(square(this.x) + square(this.y)));					
		return roundNum(Math.sqrt(square(this.x) + square(this.y))); 
	}

	
	private double square(int x2) {		
		return Math.pow(x2, 2);
	}
	
	public Vector add(Vector b) {
		
		// b is v2 Object
		// c is new Object
		// x inherit from v1 Object
		
		// Vector c = new Vector();
		// c.x = this.x + b.x;
		// c.y = this.y + b.y;
		// return c;
		
		return new Vector(this.x + b.x, this.y + b.y);
	}
	
	public Vector sub(Vector b) {
		
		//Vector c = new Vector( this.x - b.x, this.y - b.y);
		//c.x =this.x - b.x;
		//c.y = this.y - b.y;
		//return c;				
		
		return new Vector( this.x - b.x, this.y - b.y);
		
	}
	
	// Skalarprodukt
	public Vector scale(int s) {
		
		//Vector c = new Vector();
		//c.x = this.x * s;
		//c.y = this.y * s;
		//return c;				
		
		return new Vector(this.x * s, this.y * s);
		
	}
	
	public double multiplay(Vector b) {
		double gradBetweenVectors = getAngleBetweenVectors(b);
		double a = (this.x * b.x + this.y * b.y);		
		double cosa = Math.cos(Math.toRadians(gradBetweenVectors));
		
		return roundNum(a * cosa);		
	}
	
	
	public double getAngle(){
		//conversation to grad		 		    
		//double grad = calculateAngle(this.x, this.y);
		//long roundGrad = roundGrad(grad);
		//return roundGrad;
		return  calculateAngle(this.x, this.y);
	}
	
	
	public double getAngleBetweenVectors (Vector b) {	
		
		//double grad = calculateAngle(this.y,this.x) - calculateAngle(b.y,b.x);
		
		double grad1 = changeSign(calculateAngle(this.y,this.x));
		double grad2 = changeSign(calculateAngle(b.y,b.x));
				
		
		//long roundGrad = roundGrad(grad);
		//return roundGrad;
		
		return Math.abs(grad2 - grad1);				
	}
	
	public double changeSign(double grad) {
		if(grad<0) {
			return (360 + grad);
		}
			return grad;
	}
	
	
	
	
		
	//return round number
	private double roundNum(double grad) {
		double roundNum = (Math.round(grad*100));		 
		return roundNum/100;
	}
			
	//return angle 
	private double calculateAngle(int x, int y) {
				
	/*
	 *  _alpha = ( ( Math.atan (y/x) ) * 180 ) / Math.PI;			 *  
	 *  https://stackoverflow.com/questions/5763841/convert-from-radians-to-degrees-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa				
	 */ 			
		//double grad = roundNum(Math.toDegrees(Math.atan2(y, x)));
		//double grad = Math.toDegrees(Math.atan2(y, x));
		return roundNum(Math.toDegrees(Math.atan2(y, x)));
	}			

	//@Override
	public String toString(){
		return String.format("<%s, %s> Len: %s", x, y, length());
	}
}