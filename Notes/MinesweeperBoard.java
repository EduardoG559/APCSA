
/**
 * Write a description of class Minesweeper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MinesweeperBoard{
    Cell[] board;
    int rows;
    int columns;
    //random index, 0-however many slots, method to change the value of the cell,
    //maybe a mutator method
    //need a for loop, need an index; board.length is how many cells
    public MinesweeperBoard(int row, int col){
        //Put the constructor here.

        rows = row;
        columns = col;
        board = new Cell[row*col];
        //These pieces are for the GUI.
        JFrame frame = new JFrame();
        frame.add(addCells());

        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public MinesweeperBoard(){
        this(10,10);
    }

    public void addMines(int mines) throws Exception{
        for(int i = 0; i != mines; i++){
            int randMines = (int)(Math.random() * rows*columns);
            if(board[randMines].value==0){
                board[randMines].createMines();
                board[randMines].isMine();

            }else{
                i--;

            }

        }
    }

    public void addNums(){
        int num = 0;
        for(int i = 0;i < board.length;i++){
            
            
        }
    }

    /**This method is used for testing and will be deleted if using the GUI.
     *  It is still required for all students.
     */
    public void printBoard(){ 

        for(int j = 0; j < rows;j++){
            for(int i = 0; i < columns;i++){
                int numVal = board[i].value;
                if(board[i].isMine()){
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
        for(int i = 0; i< rows*columns; i++){
            board[i]= new Cell();
            panel.add(board[i].getButton());
        }
        return panel;
    }

}
