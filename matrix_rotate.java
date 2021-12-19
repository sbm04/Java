package assignment;
import java.util.*;
 //class Clock
/*({
	   int row;
	   int col;
	  
	   public int getRow() {
		return row;
	   }
	   public int getCol() {
		return col;
	   }
	   
	   public void setRow(Integer row) {
		  this.row = row;
	    }
	   public void setCol(Integer col) {
		this.col = col;
	    }
	   public void rotate(int n,int m,int arr[][])
	   {};
	   
}*/
class Clockwise 
{
	
		
	   /*public Clockwise(int row,int col)
	    {
	    	setRow(row);
	    	setCol(col);
	    }*/
	  static int R;
	  static int C;
	   static void rotate(int n ,int m,int mat[][]) {
		   //transpose
		  int r =0,c=0;
		  int prev, curr; 
		  int lastRow= n;
	      int lastCol= m;
	      
//		  while (r < lastRow && c < lastCol) 
//		  {      
//			    if (r + 1 == lastRow || c + 1 == lastCol)  break;   
//			    prev = mat[r + 1][c]; 
//		        //for the first row which is in bounds
//		        for (int i = c; i < lastCol; i++) 
//		        { 
//		            curr = mat[r][i]; 
//		            mat[r][i] = prev; 
//		            prev = curr; 
//		        } 
//		        r++; 
//		        //for the last column which is in bounds
//		        for (int i = r; i < lastRow; i++) 
//		        { 
//		            curr = mat[i][lastCol-1]; 
//		            mat[i][lastCol-1] = prev; 
//		            prev = curr; 
//		        } 
//		        lastCol--;   
//		      //for the last row which is in bounds
//		        if (r < lastRow) 
//		        { 
//		            for (int i = lastCol-1; i >= c; i--) 
//		            { 
//		                curr = mat[lastRow-1][i]; 
//		                mat[lastRow-1][i] = prev; 
//		                prev = curr; 
//		            } 
//		        } 
//		        lastRow--;
//		      //for the first row which is in bounds
//		        if (c < lastCol) 
//		        { 
//		            for (int i = lastRow-1; i >= r; i--) 
//		            { 
//		                curr = mat[i][c]; 
//		                mat[i][c] = prev; 
//		                prev = curr; 
//		            } 
//		        } 
//		        c++; 
//		        
//		    
//		  }
//		  for (int i=0; i<n; i++) 
//		    { 
//		        for (int j=0; j<m ;j++) 
////		        
//		        	System.out.print(mat[i][j] +" ");
//		            System.out.println();
//		    } 
		   
		       // int row = 0, col = 0;
		       // int prev, curr;
		 
		        /*
		        row - Starting row index
		        m - ending row index
		        col - starting column index
		        n - ending column index
		        i - iterator
		        */
		       // while (row < m && col < n)
		       while (r < lastRow && c < lastCol) 
		        {
		     
		            if (r + 1 == m || c + 1 == n)
		                break;
		     
		            // Store the first element of next
		            // row, this element will replace
		            // first element of current row
		            prev = mat[r + 1][c];
		     
		            // Move elements of first row
		            // from the remaining rows
		            for (int i = c; i < n; i++)
		            {
		                curr = mat[r][i];
		                mat[r][i] = prev;
		                prev = curr;
		            }
		            r++;
		     
		            // Move elements of last column
		            // from the remaining columns
		            for (int i = r; i < m; i++)
		            {
		                curr = mat[i][n-1];
		                mat[i][n-1] = prev;
		                prev = curr;
		            }
		            n--;
		     
		            // Move elements of last row
		            // from the remaining rows
		            if (r < m)
		            {
		                for (int i = n-1; i >= c; i--)
		                {
		                    curr = mat[m-1][i];
		                    mat[m-1][i] = prev;
		                    prev = curr;
		                }
		            }
		            m--;
		     
		            // Move elements of first column
		            // from the remaining rows
		            if (c < n)
		            {
		                for (int i = m-1; i >= r; i--)
		                {
		                    curr = mat[i][c];
		                    mat[i][c] = prev;
		                    prev = curr;
		                }
		            }
		            c++;
		        }
		 
		            // Print rotated matrix
		            for (int i = 0; i < R; i++)
		            {
		                for (int j = 0; j < C; j++)
		                System.out.print( mat[i][j] + " ");
		                System.out.print("\n");
		            }
		
	}
	   
}
//Todo Anticlock Wise
public class matrix_rotate {
	  
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//row
		int row = sc.nextInt();
		//col
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
		 rotate(row, col, arr);
		//Clockwise c1= new Clockwise(row,col);
		//for(int i=0;i<n;i++)
		//c1.rotate(row,col,arr);

	}

}
