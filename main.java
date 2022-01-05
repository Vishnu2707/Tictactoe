import java.util.Scanner;
class Hunger {
    public static void main(String args[]) {
        char[][] board = { 
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' }};
        Scanner ob = new Scanner(System.in);
        while(true){
            int pos1 = 0, pos2 = 0; 
            System.out.println("Enter the position Player 1");
            pos1 = ob.nextInt();
            playerA(board, pos1);
            outLine(board);
            check(board); 
            System.out.println("Enter the position Player 2");
            pos2 = ob.nextInt();
            playerB(board, pos2);
            outLine(board);
            check(board);
        }
    }
    public static void outLine(char[][] board){
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void playerA(char[][] board, int pos1){
        switch (pos1) {
            case 1:
                board[0][0]='X';
                break;
            case 2:
                board[0][2]='X';
                break;
            case 3:
                board[0][4]='X';
                break;
            case 4:
                board[2][0]='X';
                break;
            case 5:
                board[2][2]='X';
                break;
            case 6:
                board[2][4]='X';
                break;
            case 7:
                board[4][0]='X';
                break;
            case 8:
                board[4][2]='X';
                break;
            case 9:
                board[4][4]='X';
                break;
            default:
                System.out.println("Enter a valid number. Start from the beginning");
                System.exit(0);
        }
    }
    public static void playerB(char[][] board, int pos2){
        switch (pos2) {
            case 1:
                board[0][0]='O';
                break;
            case 2:
                board[0][2]='O';
                break;
            case 3:
                board[0][4]='O';
                break;
            case 4:
                board[2][0]='O';
                break;
            case 5:
                board[2][2]='O';
                break;
            case 6:
                board[2][4]='O';
                break;
            case 7:
                board[4][0]='O';
                break;
            case 8:
                board[4][2]='O';
                break;
            case 9:
                board[4][4]='O';
                break;
            default:
                System.out.println("Enter a valid number");
                System.exit(0);
        }
    }
    public static void check(char[][] board){
        boolean b = false, b1 = false;
        if(board[0][0]=='X' && board[0][2]=='X' && board[0][4]=='X')
        {
            b = true;
        }
        else if(board[2][0]=='X' && board[2][2]=='X' && board[2][4]=='X')
        {
            b = true;
        }
        else if(board[4][0]=='X' && board[4][2]=='X' && board[4][4]=='X')
        {
            b = true;
        }

        else if(board[0][0]=='X' && board[2][0]=='X' && board[4][0]=='X')
        {
            b = true;
        }
        else if(board[0][2]=='X' && board[2][2]=='X' && board[4][2]=='X')
        {
            b = true;
        }
        else if(board[0][4]=='X' && board[2][4]=='X' && board[4][4]=='X')
        {
            b = true;
        }
        if(b==true){
            System.out.println("Congrats!! Player1 has won the game.");
            System.exit(0);
        }
        else if(board[0][0]=='O' && board[2][2]=='O' && board[4][4]=='O')
        {
            b = true;
        }
        else if(board[0][4]=='O' && board[2][2]=='O' && board[4][0]=='O')
        {
            b = true;
        }
//player1 winning
        if(board[0][0]=='O' && board[0][2]=='O' && board[0][4]=='O')
        {
            b1 = true;
        }
        else if(board[2][0]=='O' && board[2][2]=='O' && board[2][4]=='O')
        {
            b1 = true;
        }
        else if(board[4][0]=='O' && board[4][2]=='O' && board[4][4]=='O')
        {
            b1 = true;
        }

        else if(board[0][0]=='O' && board[2][0]=='O' && board[4][0]=='O')
        {
            b1 = true;
        }
        else if(board[0][2]=='O' && board[2][2]=='O' && board[4][2]=='O')
        {
            b1 = true;
        }
        else if(board[0][4]=='O' && board[2][4]=='O' && board[4][4]=='O')
        {
            b1 = true;
        }
        else if(board[0][0]=='O' && board[2][2]=='O' && board[4][4]=='O')
        {
            b1 = true;
        }
        else if(board[0][4]=='O' && board[2][2]=='O' && board[4][0]=='O')
        {
            b1 = true;
        }
        if(b==true){
            System.out.println("Congrats!! Player2 has won the game.");
            System.exit(0);
        }


    }
    

}