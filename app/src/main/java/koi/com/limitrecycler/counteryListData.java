package koi.com.limitrecycler;

/**
 * Created by Vibrant1 on 21-Sep-17.
 */

public class counteryListData {

    String Countery;
    String Continents;

    public counteryListData(String countery, String continents) {
        Countery = countery;
        Continents = continents;
    }

    public String getCountery() {
        return Countery;
    }

    public void setCountery(String countery) {
        Countery = countery;
    }

    public String getContinents() {
        return Continents;
    }

    public void setContinents(String continents) {
        Continents = continents;
    }
}
