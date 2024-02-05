package entities;

public class Bill {
    private final int GENDER_MALE = 10;
    private final int GENDER_FEMALE = 8;
    private final double BEER = 5;
    private final double SOFT_DRINK = 3;
    private final double BARBECUE = 7;
    private final double COVER = 4;
    private final double WITHOUT_COVER = 0;

    private char gender;
    private int beer;
    private int barbecue;
    private int softDrink;

    public Bill() {
    }

    public Bill(char gender, int beer, int barbecue, int softDrink) {
        this.gender = gender;
        this.beer = beer;
        this.barbecue = barbecue;
        this.softDrink = softDrink;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBarbecue() {
        return barbecue;
    }

    public void setBarbecue(int barbecue) {
        this.barbecue = barbecue;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double feeding() {
        return (getBeer() * BEER) + (getSoftDrink() * SOFT_DRINK) + (getBarbecue() * BARBECUE);
    }

    public double ticket() {
        if (getGender() == 'F') {
            return GENDER_FEMALE;
        } else {
            return GENDER_MALE;
        }
    }

    public double cover() {
        if (feeding() > 30) {
            return WITHOUT_COVER;
        }
        return COVER;
    }

    public double total() {
        return feeding() + ticket() + cover();
    }
}
