import java.util.Scanner;
public class Transpose extends Matrix{
	Scanner sc=new Scanner(System.in);
	void Transpose(int row,int column)
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
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row and column of matrix:");
		Transpose d =new Transpose();
		d.row=sc.nextInt();d.column=sc.nextInt();
		d.intialise(d.row,d.column);
		d.Transpose(d.row,d.column);
	}
}

class Matrix{
	Scanner sc=new Scanner(System.in);
	int a[][];
	int row,column;
	void intialise(int row,int column)
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
}