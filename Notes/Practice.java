
/**
 * Write a description of class PArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice
{
    String[][] pArray;
    public Practice(){
        pArray = new String[5][7];
        for(int r = 0; r < pArray.length; r++){
            for(int c = 0; c < pArray[0].length;c++){
                pArray[r][c]= "5";
            }           
        }
        for(String[] row:pArray){
            for(String str : row){
                System.out.print(str+ " ");
            }
            System.out.println();
        }
        }
}
    

