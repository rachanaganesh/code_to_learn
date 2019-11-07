package Arrays;

public class matrix_game {
    public int[][] solution(int grid[][],int k,String[] rules){
        int corners [][] =new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
        int lc[][] = new int[grid.length][grid[0].length];
        for(int l=0;l<k;l++){
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    int count =0;
                    for(int f=0;f<8;f++){
                        int r = i,c = j;
                        r = r + corners[f][0];
                        c = c + corners[f][1];
                        if(r>=0 && r<grid.length && c>=0 && c<grid[0].length){
                            if(grid[r][c] == 1) {
                                count++;
                            }
                        }
                    }
                    lc[i][j] = count;
                    System.out.println(lc[i][j]);
                }
            }
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(rules[lc[i][j]].equals("alive")){
                        grid[i][j] = 1;
                    } else {
                        grid[i][j] = 0;
                    }

                }


            }
        }

        return grid;
    }
    public static void main(String[] args) {
        matrix_game game = new matrix_game();
         int[][] table = {{0, 0}, {1, 1}};
         String[] rules = {"dead","dead","alive","dead","alive","dead","dead","dead"};
        int[][] result =game.solution(table,3,rules);
       System.out.println(result);
    }
}
