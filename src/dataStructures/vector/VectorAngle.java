package dataStructures.vector;

	public class VectorAngle {

		public double getAngle(int x, int y) {
			
						
			//conversation to grad		 		    
			double grad = calculateAngle(x, y);
			long roundGrad = roundGrad(grad);
			return roundGrad;
		}

		public long getAngleBetweenVectors (int x, int y, int x1, int y1) {					
			
			double grad = calculateAngle(y,x) - calculateAngle(y1,x1);			
			
			long roundGrad = roundGrad(grad);			
			
			return roundGrad;
					
		}
		
		
		//utils
		
		//return round number
		private long roundGrad(double grad) {
			
			long roundGrad = Math.round(grad);
			
			return roundGrad;
		}
		
		
		//return angle 
		private double calculateAngle(int x, int y) {
			
			/*
			 *  _alpha = ( ( Math.atan (y/x) ) * 180 ) / Math.PI;			 *  
			 *  https://stackoverflow.com/questions/5763841/convert-from-radians-to-degrees-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa				
			 */ 			
			
			double grad = Math.toDegrees(Math.atan2(y, x));
			
			return grad;
		}
		
	
	
}
