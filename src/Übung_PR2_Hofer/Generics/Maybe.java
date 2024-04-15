package Übung_PR2_Hofer.Generics;

public class Maybe<T>  {

    private T values;
    private String description;
    /*
    *status values defindes

     */
    private int status;


    public Maybe(T values, int status) {
        this.values = values;
        this.status = status;
    }


    //Rückgabewert soll nur geliefert werden wenn
    //status den Wert 1 oder 10 hat
    public T getValueIfAllowed(){
        if(status == 1 || status == 10){
            return values;
        }
        return null;
    }
}
