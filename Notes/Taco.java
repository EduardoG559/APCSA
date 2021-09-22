
/**
 * Write a description of class Tacos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Taco
{
    private String meat;
    private boolean salsa;
    private int amountOfTacos;
    private double price;
    private boolean lettuce;
    //Constructors
    public Taco(String typeOfMeat, boolean wantSalsa, int tacoAmount,
    double cost, boolean wantLettuce){
        meat = typeOfMeat;
        salsa = wantSalsa;
        amountOfTacos = tacoAmount;
        price = cost;
        lettuce = wantLettuce;

    }

    public Taco(){
        meat = "Asada";
        salsa = true;
        amountOfTacos = 3;
        price = 1.50;
        lettuce = true;

    }
    //Accessors
    public String getMeat(){
        return meat;
    }

    public boolean wantSalsa(){
        return salsa;
    }

    public int getAmountTacos(){
        return amountOfTacos;
    }

    public double getPrice(){
        return price;
    }

    public boolean wantLettuce(){
        return lettuce;

    }
    //Mutator Methods
    public void eat(){
        amountOfTacos --;
        System.out.print("You get hungry and eat 1 taco");
    }

    public void changeMeat(String newMeat){
        meat = newMeat;
    }

    public void wantOrTakeOffSalsa(){
        if (salsa){
            salsa = false;
        }else{
            salsa = true;
        }
    }

    public void wantOrTakeOffLettuce(){
        if (lettuce){
            lettuce = false;
        }else{
            lettuce = true;
        }
    }
    public void moreTacos(double increaseCost){
        price += increaseCost;
    }
}
                                           
