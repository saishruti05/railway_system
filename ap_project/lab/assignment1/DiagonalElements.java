import java.util.Scanner;
public class DiagonalElements{
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
	void sumofDiagonalElements()
	{
		int sum=0;
		for (int i=0;i<row ;i++ ) {
			sum+=a[i][i];
		}
		System.out.print("sum = "+sum);

	}

	void display(){
		System.out.print("\nDiagonal Elements= ");
		for (int i=0;i<row ;i++ ) {
			System.out.print(a[i][i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row and column of matrix:");
		DiagonalElements d =new DiagonalElements();
		d.row=sc.nextInt();d.column=sc.nextInt();
		d.intialise(d.row,d.column);
		d.sumofDiagonalElements();
		d.display();
	}
}