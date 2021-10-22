
/**
 * Write a description of class ArrayPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayPractice
{
    int[] arr;
    
    /** Create an array with x ints, starting at 1 and going to x.
     * 
     */
    public ArrayPractice(int x){
        arr = new int[x];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }
    /** Adds all the numbers in the array
     * 
     */
    public int getSum(){
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
           sum += arr[i]; 
        }
        return sum;
    }
    /** Find the average of all numbers in the array
     * 
     */
    public double getAverage(){
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
           sum += arr[i]; 
        }
        double average = sum / arr.length;
        return average;
        
    }
    /** Find the largest number in the array
     * 
     */
    public int getLargest(){
        int largest = arr[0];
        for (int i = 0; i < arr.length;i++){
            
            if(arr[i] > largest){
                largest = arr[i];
                
            }
        }
        return largest;
    }
}
