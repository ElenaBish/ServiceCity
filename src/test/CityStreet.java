package test;

/**
 * Created by elena on 02.05.2017.
 */
public class CityStreet {
   private String nameStreet;
   private int widthStreet;
   private int lengthStreet;

    public CityStreet(String nameStreet, int widthStreet, int lengthStreet) {
        this.nameStreet = nameStreet;
        this.widthStreet = widthStreet;
        this.lengthStreet = lengthStreet;
    }

    public int calcArea(int widthStreet,int lengthStreet){
     return widthStreet*lengthStreet;
    }
}
