class Solution {
    public int uniquePaths(int m, int n) {
        int[][] mat = new int[m+1][n+1];
        mat[m-1][n-1] = 1;

        for(int j=m-1;j>=0;j--){
            for(int i=n-1;i>=0;i--){
                if(mat[j][i]!=0)    continue;
                mat[j][i] = mat[j+1][i] + mat[j][i+1];
            }
        }

        return mat[0][0];
    }
}
