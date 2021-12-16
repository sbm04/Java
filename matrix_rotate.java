package assignment;
import java.util.*;
public class matrix_rotate {
	   abstract class matrix_rotation
	   {
		   private int row;
		   private int col;
		   public int[][] arr;
		   public int getRow() {
			return row;
		   }
		   public int getCol() {
			return col;
		   }
		   public int[][] getArr() {
			return arr;
		   }
		   public void setArr(int[][] arr) {
			this.arr = arr;
		}
		   
		   public void setRow(Integer row) {
			  this.row = row;
		    }
		   public void setCol(Integer col) {
			this.col = col;
		    }
		   public abstract void clockwise(int arr);
		   
	   }
	   class clockWise extends matrix_rotation
	   {
		    public clockWise(int row,int col)
		    {
		    	setRow(row);
		    	setCol(col);
		    }
		   @Override
		public void clockwise(int arr) {
			   //transpose
			   int r=getRow();
			   int c=getCol();
			   
			   for(int i=0;i<arr.length;i++)
			   {
				   for(int j=i;i<arr[0].length;j++)
				   {
					   int temp =arr[i][j];
					   arr[i][j]=arr[j][i];
					   arr[j][i]=temp;
				   }
			   }
			   for(int i=0;i<arr.length;i++) {
				   int li =0;
				   int ri=arr[i].length-1;
				   while(li<ri) {
					   int temp =arr[i][li];
					   arr[i][li] = arr[i][ri];
					   arr[i][ri] =temp;
					   li++;
					   ri--;
					   
				   }
			   }
			
		}
		   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int [][] arr =new int [row][col];
		for(int i=0; i<arr.length;i++)
		{
			for(int j =i;j<arr[0].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		//number of times rotations
		int n=sc.nextInt();

	}

}
