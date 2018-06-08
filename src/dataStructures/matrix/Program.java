package dataStructures.matrix;

public class Program {

	public static void main(String[] args) throws Exception{

		/*
		 * https://de.wikipedia.org/wiki/Matrix_(Mathematik) Erstellen Sie einen
		 * Datentypen (Klasses) für eine m*n-Matrix. Implementieren Sie folgende
		 * Methoden: - setzen und lesen von Werten an der Stelle x, y - Matrixaddition -
		 * Skalarmultiplikation - Matrixmultiplikation - Transponierte Matrix
		 * 
		 * Zusatz: Erstellen Sie folgende statische (static) Matrizien: - Einheitsmatrix
		 * 
		 */
					
		Matrix m1 = new Matrix(3, 3);
		Matrix m2 = new Matrix(3, 3);

		Matrix m3 = new Matrix(3, 3);
		
		m3.setMatrix(new double[][] { 
										{ 1.1, 1.2, 1.9 }, 
										{ 1.7, 2.1, 3.3 }, 
										{ 6.0, 7.2, 3.4 } 
		});
		
		m3.set(0, 0, 1.0);
		m3.get(0, 0); // 1.0*/

		double temp1[][] = { 
							{ 1.1, 1.2, 1.9 }, 
							{ 1.7, 2.1, 3.3 }, 
							{ 6.0, 7.2, 3.4 } 
							};

		double temp2[][] = { 
							{ 4.0, 8.2, 5.9 }, 
							{ 7.7, 2.3, 1.7 }, 
							{ 1.2, 7.1, 1.8 } 
							};

		// set and get matrix
		m1.setMatrix(temp1);
		m2.setMatrix(temp2);

		
		m1.getMatrix();
		m2.getMatrix();

		System.out.println("---------- matrix print m1, m2-----------");
		System.out.println(m1);
		System.out.println(m2);
		
		System.out.println("-----------matrix print m3 -------------- ");
		System.out.println(m3);
		
		System.out.println("---------- m1 add m2 -----------");
		System.out.println(m1.add(m2));
		
		System.out.println("---------- m1 sub m2 -----------");
		System.out.println(m1.sub(m2));
		
		System.out.println("---------- m1 scalar multiplication-------");
		double factor = 3.1;
		System.out.println(m1.scale(factor));
		
		//System.out.println("---------- m1 multiplication m2-------");
		//System.out.println(m1.multiple(m2));
		
		System.out.println("---------- transposing m1-----------");							
		System.out.println(m1.transpose());
		
		System.out.println("---------- identity matrix-----------");		
		int index =  3;
		Matrix m5 = new Matrix(index, index);
		m5.setIdentityMatrix();
		System.out.println(m5);
		
		
		
		/*
		System.out.println(0.3 + 0.6);
		System.out.println(0.9);
		System.out.println(0.9 == 0.3 + 0.6);
		*/
		
		//System.out.println(String.format("%.2f", 0.0049)); 
		// result is 0,00
		//System.out.println(String.format("%.2f", 0.00509));		
		//result is 0,01		
		//System.out.println(String.format("%.3f", 0.00419));
		//0,004
		
		//-------------------------------
		
		Matrix m8 = new Matrix(2,4);
		m8.setMatrix( new double [][]{
			{ -1, 1},
			{ 3, -4},
			{ 4, -3},
			{ 5, -2}
		});
		
		Matrix m9 = new Matrix(3,2);
		m9.setMatrix( new double [][]{
			{ 0, 6,  2},						
			{ 1, -4, 3}
		});
		
		Matrix m10 = new Matrix(3,2);
		m10.setMatrix( new double [][]{
			{ 2, 3, 4},
			{ -3, 5, -2},						
		});
		
		Matrix m11 = new Matrix(4,3);
		m11.setMatrix( new double [][]{
			{ 0, 6,  4, 7},						
			{ 1, 5, 3, -1},
			{ 2, 8, 9, -3},			
		});
		
						
		//print m8 and m9
		System.out.println("--------print m8 ----------");
		System.out.println(m8);
		
		System.out.println("--------print m9 ----------");
		System.out.println(m9);
		
		System.out.println("---------- m8 x m9 -----------");
		//m8.multiple(m9);
		System.out.println(m8.multiple(m9));
		
		
		System.out.println("--------print m10 ----------");
		System.out.println(m10);
		
		System.out.println("--------print m11 ----------");
		System.out.println(m11);
		
		System.out.println("---------- m10 x m11 -----------");
		System.out.println(m10.multiple(m11));
		
		//Matrix m0 = new Matrix(0, -1);
		
	}
}
