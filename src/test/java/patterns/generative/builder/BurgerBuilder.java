package patterns.generative.builder;

public class BurgerBuilder {
    private Burger burger;

    public BurgerBuilder() {
        burger = new Burger();
        burger.setBread(Burger.BREAD_TYPE.WHITE);
        burger.setMeat(Burger.MEAT_TYPE.SINGLE);
        burger.setSouse(Burger.SOUSE_TYPE.KETCHUP);
        burger.setExtraCheese(false);
    }

    public BurgerBuilder bread(Burger.BREAD_TYPE type) {
        burger.setBread(type);
        return this;
    }

    public BurgerBuilder meat(Burger.MEAT_TYPE type) {
        burger.setMeat(type);
        return this;
    }

    public BurgerBuilder souse(Burger.SOUSE_TYPE type) {
        burger.setSouse(type);
        return this;
    }

    public BurgerBuilder extraCheese() {
        burger.setExtraCheese(true);
        return this;
    }

    public Burger build() {
        return burger;
    }
}
