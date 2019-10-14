package test1;
import java.io.IOException;
import	java.io.InputStreamReader;
import	java.io.BufferedReader;

public class
FiveZiQi {
    private static int BOARD_SIZE=15;
    private String[][] board;
    public void initBoard(){
        board=new String[BOARD_SIZE][BOARD_SIZE];
        for(int i=0;i<BOARD_SIZE;i++){
            for(int j=0;j<BOARD_SIZE;j++){
                board[i][j]="+";
            }
        }
    }
    public void printBoard(){
        for(int i=0;i<BOARD_SIZE;i++){
            for(int j=0;j<BOARD_SIZE;j++){
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        FiveZiQi ff=new FiveZiQi();
        ff.initBoard();
        ff.printBoard();
        System.out.println("请输入你下棋的坐标，应以（x，y）的格式：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr=null;
        while((inputStr=br.readLine())!=null){

            String[] pssStrArr=inputStr.split(",");
            int xPos=Integer.parseInt(pssStrArr[0]);
            int yPos=Integer.parseInt(pssStrArr[1]);
            if((ff.board[yPos-1][xPos-1].equals("0"))){
                System.out.println("该坐标已有棋子，请重新输入坐标");
                continue;
            }
            ff.board[yPos-1][xPos-1]="0";
            ff.printBoard();

        }
    }
}
