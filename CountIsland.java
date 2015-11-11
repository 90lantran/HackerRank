import java.util.Scanner;


public class CountIsland {
	
	static int dfs(boolean[][] matrix, boolean[][] visited, int row, int col, int maxRow, int maxCol){
		if (visited[row][col] || !matrix[row][col]) return 0;
		int result = 1;
		
		visited[row][col] = true;
		if(row - 1 >= 0){
			result += dfs(matrix, visited, row -1 , col, maxRow, maxCol);
			if (col - 1 >= 0){
				result += dfs(matrix, visited, row -1 , col - 1, maxRow, maxCol);
			}
			if (col + 1 < maxCol){
				result += dfs(matrix, visited, row -1 , col + 1, maxRow, maxCol);
			}
		}
		
		if (row + 1 < maxRow){
			result += dfs(matrix, visited, row + 1 , col, maxRow, maxCol);
			if (col - 1 >= 0){
				result += dfs(matrix, visited, row + 1 , col - 1, maxRow, maxCol);
			}
			if (col + 1 < maxCol){
				result += dfs(matrix, visited, row + 1 , col + 1, maxRow, maxCol);
			}
		}
		
		if (col + 1 < maxCol){
			result += dfs(matrix, visited, row , col + 1, maxRow, maxCol);
		}
		
		if (col - 1 > 0){
			result += dfs(matrix, visited, row , col - 1, maxRow, maxCol);
		}
		
		
		return result;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
        int numRows = Integer.parseInt(s.nextLine());
        int numCols = Integer.parseInt(s.nextLine());
        
        boolean[][] matrix = new boolean[numRows][numCols];
        boolean[][] visited = new boolean[numRows][numCols];
        
        for(int i = 0; i < numRows ; i++){
        	for(int j = 0; j < numCols; j++){
        		visited[i][j] = false;
        		matrix[i][j] = (s.nextInt() == 1);
        	}
        }
        
        int ans = 0;
        for(int i = 0; i < numRows ; i++){
        	for(int j = 0; j < numCols; j++){
        		int temp = dfs(matrix, visited,i,j,numRows, numCols);
        		ans = Math.max(temp, ans);
        	}
        }
        
       System.out.println(ans);
        
	}

}
