package dataStructures.vector;

public class Program {
	
	private static void print(Vector arr, String option){
				
		if(option == "sum") {
			System.out.println("Vector sum is:" +"  x="+ arr.getX() +"  y="+arr.getY());
		}else if(option == "sub") {
			System.out.println("Vector sub is:"+"  x="+ arr.getX() +"  y="+arr.getY());
		}else if(option == "length") { 
			System.out.println("Length of the vector: "+ " : " + arr.length());
		}else if( option == "scale") {
			System.out.println("Vector scale is:"+ " : " +"  x="+ arr.getX() +"  y="+arr.getY());
		}else if(option == "getXY") {
			System.out.println("Vector is:" +"  x="+ arr.getX() +"  y="+arr.getY());
		}else if(option=="grad") {
			System.out.println("grad vector is: " + arr.getAngle());
		}		
		
		//System.out.printf("%s vector: x= %s , y= %s \n", "sum", arr.getX(), arr.getY());
	}

	
	
	
	public static void main(String[] args) {
		//PublicClass a = new PublicClass();
		//PublicClass b = new PublicClass(5);
		
		//System.out.println(a.getValue());
		//System.out.println(b.getValue());
		// PackageClass b = new PackageClass();
		//return;
		
		
		
		// Vector v1 = new Vector();
		// v1.setX(2);
		// v1.setY(4);
		Vector v1 = new Vector(2, 4);
		print(v1, "getXY");
		
		//Vector v2 = new Vector();
		//v2.setX(-4);
		//v2.setY(-1);
		Vector v2 = new Vector(-4, -1);
		print(v2, "getXY");
		
		//length
		print(v1, "length");
		//System.out.println("length v1 is: " + v1.length());
		//System.out.println("length v2 is: " + v2.length());		
		
		//Sum vectors
		//VectorFunc func = new VectorFunc();
		//System.out.println( "sum is: x=" + func.getSumX(v1.getX(),v2.getX()) + "  y=" + func.getSumY(v1.getY(), v2.getY()) );
				
		Vector v3 = v1.add(v2);
		//System.out.println( "sum is: x=" + v3.getX() + "  y=" + v3.getY() );
		print(v3, "sum");		
				
		//Differenz vectors
		//System.out.println( "diff is: x=" + func.getDifX(v1.getX(),v2.getX()) + "  y=" + func.getDifY(v1.getY(), v2.getY()) );
		
		Vector v4 = v1.sub(v2);
		//System.out.println( "sub is: x=" + v4.getX() + "  y=" + v4.getY());
		print(v4, "sub");

		//scalar
		
		int scale = 3;
		//System.out.println( "scalar is: x=" + func.getScalarX(v1.getX(), scalarNum) + "  y="+ func.getScalarY(v1.getY(), scalarNum));		
		Vector v5 = v1.scale(scale);
		print(v5, "scale");
		//System.out.println( "scalar is: x=" + v5.getX() + "  y="+ v5.getY());
		
		
		
		
		//grad 		
		//double grad = v1.getAngle();
		//System.out.println("grad for vector is: " + grad);
		//VectorAngle angle = new VectorAngle();
		//System.out.println("grad vector is: " + angle.getAngle(v1.getX(), v1.getY()));
		print(v1, "grad");
		
		
		//angle between 2 vectors
		Vector v6 = new Vector(-1, 1);
		//v6.setX(-1);
		//v6.setY(1);		
		double grad2 = v6.getAngle();
		Vector v7 = new Vector(-1, -1);
		//v7.setX(-1);
		//v7.setY(-1);		
		double grad3 = v7.getAngle();
			
		
		//System.out.println("Angle between 2 vectors is: "+ angle.getAngleBetweenVectors(v1.getX(), v1.getY(), v2.getX(), v2.getY())+" grad");
		System.out.println("Angle between 2 vectors is: "+ v1.getAngleBetweenVectors(v2)+ "  grad");
		
		
		//v1.multiply(v2)
		System.out.println("Multiplay 2 vectors is: "+ v6.multiplay(v7));
		

		Vector[] ary = {
			new Vector(1, 2),
			new Vector(2, 4),
			new Vector(-1, 7),
			new Vector(1, 2)
		};
		
		System.out.println(v7);
		System.out.println(v1);
		
		
		
	}
}
