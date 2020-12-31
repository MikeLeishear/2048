package Game;
import java.util.Random;

public class GameBoard {
    Block[][] board = new Block[4][4];
    public GameBoard (){

    }

    public void createBoard(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                board[i][j] = new Block();
            }
        }
        initializeRandomBlocks();
    }

    public void printBoard(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                String output = String.format("%-4d",board[i][j].value);
                System.out.print(output);
            }
            System.out.println("");
        }
    }
    /* initializes a 1-2 blocks to have values other than 0/null */
    public void initializeRandomBlocks(){
        int [] startValues = {2,2,2,2,2,2,4,4,4,4,8};

        //randomly choose 2 blocks to have start values
        Random generator = new Random();
        int innerIndex = generator.nextInt(4);
        int outerIndex = generator.nextInt(4);

        int startIndex = generator.nextInt(startValues.length);
        int startValue = startValues[startIndex];
        board[innerIndex][outerIndex].value = startValue;

        int innerIndex2 = generator.nextInt(4);
        int outerIndex2 = generator.nextInt(4);

        int startIndex2 = generator.nextInt(startValues.length);
        int startValue2 = startValues[startIndex2];
        board[innerIndex2][outerIndex2].value = startValue2;
    }

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();

        gameBoard.createBoard();
        gameBoard.printBoard();
    }
}
