
/**
 * Write a description of class ModArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ModArray
{
    int[] arr;
    public ModArray(){
        arr = new int[5];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 2;
    }

    public void insertNum(int num, int index){
        //insertNum(1, 2);
        //arr[2] = 1;
        for(int i = index; i > arr.length;i--){       
            arr[i] = arr[i-1];            
        }
        arr[index] = num; 
    }

    public void removeNum(int index){

        for(int i = index; i < arr.length;i++){
            arr[i] = arr[i+1];
        }
    }
    /* Start  {3,7,9,2,0}
     * Goal 1 {3,7,1,9,2}
     * Goal 2 {3,1,9,2,0}
     */
}
