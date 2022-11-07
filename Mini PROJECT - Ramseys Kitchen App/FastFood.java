public class FastFood extends Food {
    private double calories;
    private double limitedTimeOffer;
    private boolean extraSauce;
    private boolean extraCheese;

    FastFood(String name, int quantity, String rating, double price, double calories, double limitedTimeOffer, boolean extraSauce, boolean extraCheese){
        super(name,quantity,rating,price);
        this.calories = calories;
        this.limitedTimeOffer = limitedTimeOffer;
        this.extraCheese = extraCheese;
        this.extraSauce = extraSauce;
    }

    public double getLTO(){
        return limitedTimeOffer;
    }



    public double getCalorie(){
        return calories;
    } 

    public void addExtraSauce(){
        extraSauce = true;
    }
    public void addExtraCheese(){
        extraCheese = true;
    }

    public void displayDetails(){
        System.out.println("Name : " + itemName);
        System.out.println("Rating : " + itemRating);
        System.out.println("Price RM : " + itemPrice);
        System.out.println("Calories : " + calories + " Cal" );
        
        double offer = limitedTimeOffer*100;
        System.out.println("Limited Time Offer : " + offer + " % off" );
    }

    public void displayReceipt(){
        super.displayReceipt();
        double price = itemPrice;
       

        if(extraSauce){
            System.out.println("With extra sauce");

        }else{
            System.out.println("No extra sauce");
        }


        if(extraCheese){
            System.out.println("With extra cheese");


        }else{
            System.out.println("No extra cheese");
        }

        
        price = price - (limitedTimeOffer*price);
        price = price + 2;


        System.out.println("Total Price : " + price + " (Including delivery fee + " + limitedTimeOffer +" % off)");



    }



}
