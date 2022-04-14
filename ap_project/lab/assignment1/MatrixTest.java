import java.util.*;
class Matrix{
	Scanner sc=new Scanner(System.in);
	int a[][];
	int row,column;

	void displayMatix(){
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<column ;j++ ) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	void intialise(int row ,int column)
	{
		a=new int[row][column];
		this.row=row;
		this.column=column;
		for (int i=0;i<row ;i++ ) {
			System.out.printf("Element of %d row :",i+1);
			for (int j=0;j<column ;j++ ) {
				a[i][j]=sc.nextInt();
			}
		}
	}
	void sumofDiagonalElements()
	{
		int sum=0;
		for (int i=0;i<row ;i++ ) {
			sum+=a[i][i];
		}
		System.out.print("sum = "+sum);

	}
	void trace()
	{
		int sum=0;
		for (int i=0;i<row ;i++ ) {
			sum+=a[i][i];
		}
		System.out.print("\nTrace of matrix= "+sum);
	}
	void displayDiagonal(){
		System.out.print("\nDiagonal Elements= ");
		for (int i=0;i<row ;i++ ) {
			System.out.print(a[i][i]+" ");
		}
	}
	int transpose()
	{	
		int t;
		int b[][]=new int[column][row];
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<column ;j++ ) {
				t=a[i][j];a[i][j]=b[j][i];b[j][i]=t;
			}
		}
		for ( int j=0;j<column;j++ ) {
			for (int i=0;i<row ;i++ ) {
				System.out.print(b[j][i]+" ");
			}
			System.out.println();
		}
		return b;
	}

}

public class MatrixTest extends Matrix{
	public static void main(String[] args) {
		Matrix a=new Matrix(),b=new Matrix();
		a.intialise(3,4);
		a.displayMatix();
		a.displayDiagonal();
		b=a.transpose();
		b.displayMatix();
	}
}