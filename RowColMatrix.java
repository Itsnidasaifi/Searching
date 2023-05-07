import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {18,28,37,47},
            {23,34,39,50}
        };
        System.out.println(Arrays.toString(search(matrix, 38)));
        
    }
    static int[] search(int matrix[][],int target)    {
        int row=0;
        int col=matrix.length-1;
        while(row<matrix.length-1 && col>0){
            if(matrix[row][col]==target)
            return new int[]{row,col};
            if(matrix[row][col]<target){
                row++;}
                else{
                    col--;
                }
            }
        
        return new int[]{-1,-1};
        


    }
}
