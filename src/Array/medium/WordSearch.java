package Array.medium;

public class WordSearch {

    int[] di = {-1,0,1,0};
    int[] dj = {0,-1,0,1};

    public boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]!=word.charAt(0)) continue;
                boolean res = explore(board,word,0
                        ,i,j);
                if(res) return res;
            }
        }
        return false;
    }




    boolean explore(char[][] board, String word, int si, int i, int j){

        if(word.length() == si) return true;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length) return false;

        if(word.charAt(si) != board[i][j]) return false;

        char temp =board[i][j];
        board[i][j] ='@';
        for(int d=0;d<4;d++){
            boolean res = explore(board,word,si+1,i+di[d],j+dj[d]);
            if(res){
                board[i][j] = temp;
                return true;
            }
        }
        board[i][j] = temp;
        return false;

    }

    public static void main(String[] args) {
         WordSearch wordSearch = new WordSearch();
        boolean exist = wordSearch.exist(new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}},"ABCCED");
        System.out.println(exist);
    }

}
