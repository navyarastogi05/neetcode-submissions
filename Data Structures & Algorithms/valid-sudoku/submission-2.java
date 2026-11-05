class Solution 
{//start of class
    public boolean isValidSudoku(char[][] board) 
    {//start of method

        HashSet<Character> row = new HashSet<>();
        HashSet<Character> column = new HashSet<>();
        HashSet<String> box = new HashSet<>();
        boolean flag = true;

        for (int i = 0 ; i<9;i++)
        {
            if (flag)
            {
            for (int j = 0 ; j <9;j++)
            {
                if (board[i][j]!='.')
                {
                if (!row.add(board[i][j]) ||
                !box.add(board[i][j]+""+(i/3)+""+(j/3)))
                {
                    flag = false;
                    break;
                }
                }
            }
            row.clear();
            }
            else
            break;
        }
        if (flag)
        {
           for (int i = 0 ; i<9;i++)
        {
            if (flag)
            {
            for (int j = 0 ; j <9;j++)
            {
                if (board[j][i]!='.')
                {
                if (!column.add(board[j][i]))
                {
                    flag = false;
                    break;
                }
                }
            }
            column.clear();
            }
            else
            break;
        } 
        }

        return flag;
    }//end of method
}//end of class
