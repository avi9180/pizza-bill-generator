public class Pizza {
    private int price;
    private boolean veg;
    private int ExtraCheesePrice = 100;
    private int ExtraToppingsPrice = 100;
    private int BackpackPrice = 100;
    //creating Constructor


    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;//for veg pizza
        } else {
            this.price = 400;//for non veg pizza
        }
    }

    public void addExtraCheese() {
        System.out.println("Extra Chesse added");
        this.price += ExtraCheesePrice;
    }

    public void addExtraToppings() {
        System.out.println("Extra Toppings added");
        this.price += ExtraToppingsPrice;
    }
    public void TakeAway() {
        System.out.println("Take Backpack");
        this.price += BackpackPrice;
    }
    public void getbill(){
        System.out.println(this.price);
    }
}

