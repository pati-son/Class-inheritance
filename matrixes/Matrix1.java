package lab_3.matrixes;
import lab_3.exceptions.*;
public class Matrix{
	
	protected int row;
	protected int column;
	protected int[][] matrix;
	

	public Matrix(int row, int column){

		if(row <= 0 || column <= 0){
			throw new MatrixException("Error. Incorrect matrix size");
		}
		else{
			this.row = row;
			this.column = column;
			matrix = new int[row][column];

			for(int i = 0; i < row; i++)
				for(int j = 0; j < column; j++)
					matrix[i][j] = 0;
		}
	}

	public Matrix sum(Matrix m){

		Matrix matrix = new Matrix(row, column);
			for(int i = 0; i < row; i++)
				for(int j = 0; j < column; j++)
					matrix.setElement(i,j,0);

		if(row != m.row || column != m.column){
			throw new MatrixException("Error. Matrixes must be the same size");
		}
		else{

			for(int i = 0; i < row; i++)
				for(int j = 0; j < column; j++)
					matrix.setElement(i,j,this.getElement(i,j) + m.getElement(i,j));
					//matrix.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
		}
		System.out.println(matrix);
		return matrix;
	}	

	public final Matrix product(Matrix m){

		Matrix matrix = new Matrix(row, m.column);
			for(int i = 0; i < row; i++)
				for(int j = 0; j < m.column; j++)
					matrix.setElement(i,j,0);

		if(column != m.row){
			throw new MatrixException("Error. Matrixes must be consistent");// бросить исключение
		}

		else{
			for(int i = 0; i < row; i++)
				for(int j = 0; j < m.column; j++)
					for(int k = 0; k < column; k++)
						matrix.setElement(i,j,matrix.getElement(i,j) + this.getElement(i,j) * m.getElement(i,j));
						//matrix.matrix[i][j] = matrix.matrix[i][j] + this.matrix[i][k] * m.matrix[k][j];
		}
		System.out.println(matrix);
		return matrix;
			

	}
	
	public void setElement(int row, int column, int value){

		if(row > this.row || column > this.column || row < 0 || column < 0)
			throw new MatrixException("Error. Inncorect size");
		else 
			matrix[row][column] = value;

	}

	public int getElement(int row, int column){

		if(row > this.row || column > this.column || row < 0 || column < 0)
			throw new MatrixException("Error. Inncorect size");
		else
			return matrix[row][column];

	}

	public final String toString(){
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				sb.append(getElement(i,j));
				sb.append(" ");
			}
			sb.append("\n");
		}
		String text = sb.toString();

		return text;
	}

	public final boolean equals(Matrix m){

		if (row != this.row || column != this.column)
			return false;
		for(int i = 0; i < row; i++)
			for(int j = 0; j < column; j++)
				if (m.getElement(i,j) != this.getElement(i,j));
					return false;
		return true;
	}
}

