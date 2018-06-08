package dataStructures.vector;

public class VectorFunc {
		
	
	public int getSumX(int x,  int x1) {
		
		int sumX = x + x1;
		
		return sumX;
	}
	
	public int getSumY(int y,  int y1) {
		
		int sumY = y + y1;
		
		return sumY;
	}
	
	public int getDifX(int x,  int x1) {
		
		int difX = Math.abs(x - x1);
		
		return difX;
	}
	
	public int getDifY(int y,  int y1) {
		
		int difY = Math.abs(y + y1);
		
		return difY;
	}
	
	public int getScalarX(int x, int scalar) {
		int scalarX = x*scalar;
		return scalarX;
	}

	public int getScalarY(int y, int scalar) {
		int scalarY = y*scalar;
		return scalarY;
	}	
	
}
