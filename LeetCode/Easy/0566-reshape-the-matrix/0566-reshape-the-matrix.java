class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c)
        {
            return mat;
        }
        
        int newMat[][]=new int[r][c];
        for(int index=0;index<m*n;index++)

        {
            newMat[index/c][index%c]=mat[index/n][index%n];

        }
        return newMat;       
        
        
    }
}