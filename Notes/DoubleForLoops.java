
/**
 * Write a description of class DoubleForLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleForLoops
{
    public static void main(){
        for (int i = 1; i < 6; i++){
            for(int j = 1; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main2(){
        for (int i = 1; i < 6; i++){
            for(int j = 5; j <  i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main3(){
        for (int i = 1; i < 6; i++){
            for(int j = 1; j < 7 - i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main4(){
        for (int i = 1; i < 6; i++){
            for(int j = 1; j < 1 + i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main5(){
        for (int i = 5; i <+ 1; i--){
            for(int j = 1; j <  i; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}  

