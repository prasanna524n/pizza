public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 120;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isOptedForTakeAway = false;
    private Boolean isExtraCheeseAdded = false;  
    private int backPack = 20;
    private int basePizzaPrice;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.basePizzaPrice = this.price;
    }

    public void getpizzaprice() {
        System.out.println(this.price);
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += backPack;
    }

    public void getBillo() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded){ bill += "Extra cheese added: " + extraCheesePrice + "\n";
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings added: " + extraToppingsPrice + "\n";
            if (isOptedForTakeAway) {
                bill += "Take away: " + backPack + "\n";
            }
            bill += "Bill: " + this.price + "\n";
            System.out.println(bill);
        }
    }
       
    }
} 