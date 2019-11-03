class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows=matrix.length;
        
        if(rows==0)
            return false;
        
        int cols=matrix[0].length;
        
        int start=0;
        int end=rows*cols-1;
        
        while(start<=end){
            
            int mid=start+(end-start)/2;
            
            int midElement=matrix[mid/cols][mid%cols];
            
            if(target==midElement)
                return true;
            else if(midElement<target)
                start=mid+1;
            else
                end=mid-1;
        }
        
        return false;
    }
}