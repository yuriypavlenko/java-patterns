package patterns.generative.builder;

public class Burger {
    enum BREAD_TYPE {
        WHITE,
        BLACK
    }

    enum MEAT_TYPE {
        SINGLE,
        DOUBLE
    }

    enum SOUSE_TYPE {
        KETCHUP,
        MAYONNAISE
    }

    private BREAD_TYPE bread;
    private MEAT_TYPE meat;
    private boolean extraCheese;
    private SOUSE_TYPE souse;

    public BREAD_TYPE getBread() {
        return bread;
    }

    public void setBread(BREAD_TYPE bread) {
        this.bread = bread;
    }

    public MEAT_TYPE getMeat() {
        return meat;
    }

    public void setMeat(MEAT_TYPE meat) {
        this.meat = meat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public SOUSE_TYPE getSouse() {
        return souse;
    }

    public void setSouse(SOUSE_TYPE souse) {
        this.souse = souse;
    }
}
