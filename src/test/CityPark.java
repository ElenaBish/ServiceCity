package test;

/**
 * Created by elena on 02.05.2017.
 */
public class CityPark {
    private  String namePark;
    private  int widthPark;
    private  int lengthPark;

    public CityPark(String namePark, int widthPark, int lengthPark) {
        this.namePark = namePark;
        this.widthPark = widthPark;
        this.lengthPark = lengthPark;
    }

    public int calcArea(int widthPark,int lengthPark){
        return widthPark*lengthPark;
    }
}
