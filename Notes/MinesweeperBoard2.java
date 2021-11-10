
/**
 * Write a description of class MInesweeperBoard2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class MinesweeperBoard2
{
    Cell[][] board; 
    int rows;
    int columns; 
    public MinesweeperBoard2(int row, int col){
        //Put the constructor here.
        rows = row;
        columns = col;
        board = new Cell[rows][columns];
        //These pieces are for the GUI.
        JFrame frame = new JFrame();                      
        frame.add(addCells());
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard2(){
        this(10,10);
    }

    public void addMines(int mines) throws Exception{
        for(int i = 0; i < mines; i++){
            int r = (int)(Math.random() * rows*columns);
            int c = (int)(Math.random() * rows*columns);
            if(board[r][c].getValue()==0){
                board[r][c].createMines();
                board[r][c].isMine();                
            }else{
                i--;
            }
        }
    }

    public void addNums(){
        for(int r = 0; r < rows; r++){             
            for(int c = 0; c < columns; c++){
                if(!board[r][c].isMine()){
                    if(c < columns-1 && board[r][c+1].isMine()){
                        board[r][c].increaseValue();
                    }
                    if(r % columns != 0 && r-1 >= 0 && board[r-1][c].isMine()){
                        board[r][c].increaseValue();
                    }
                    if(c % columns != 0 && c-1 >= 0 && board[r][c-1].isMine()){
                        board[r][c].increaseValue();
                    }
                    if(r+1 < rows && board[r+1][c].isMine()){
                        board[r][c].increaseValue();
                    }
                    if(c+1 <= columns && r % rows != 0 && r-1 >= 0 && c+1 < board.length && board[r-1][c+1].isMine()){
                        board[r][c].increaseValue();
                    }
                    if(c % columns != 0 && r % rows != 0 && r-1 >= 0 && c - 1 >= 0 && board[r-1][c-1].isMine()){
                      board[r][c].increaseValue();
                    }
                } 
                board[r][c].getValue();
            }                     
        }
    }
      
    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){ 
        for(int r = 0; r < rows;r++){
            for(int c = 0; c < columns;c++){
                int numVal = board[r][c].getValue();
                if(board[r][c].isMine()){
                    System.out.print("X ");
                }else{
                    System.out.print(numVal + " "); 
                }
            }
            System.out.println();
        }
    }

    public JPanel addCells(){
        JPanel panel = new JPanel(new GridLayout(rows,columns));
        for(int i = 0; i < rows*columns; i++){
            board[i]= new Cell[rows*columns];
            panel.add(board[rows*columns][i].getButton());
        }
        return panel;
    }
}
