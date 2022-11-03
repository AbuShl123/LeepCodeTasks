package easy.toeplitz_matrix;

public class Solution {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length-1; i++){
            if (!compareArrays(matrix[i], matrix[i+1])) return false;
        }
        return true;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        for (int i = arr1.length-2, j = arr2.length-1; i >= 0; i--, j--) {
            if (arr1[i] != arr2[j]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {0, 1, 2, 3}, {4, 0, 1, 2}}));
        /*
        [
	    [44,35,39],
	    [15,44,35],
	    [17,15,44],
	    [80,17,15],
	    [43,80,00],
	    [77,43,80]
	    ]*/
    }

    // others' solution:
    public boolean other1(int[][] matrix) { // least memory and the fastest! I am so stupid...
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++) {
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }


}
