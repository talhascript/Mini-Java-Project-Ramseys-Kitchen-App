public class IndianFood extends Food {
    private int spiceLevel;
    private String discountCoupon = "India100";
    private boolean discountApplied = false;
    private boolean isVegetarian;

    IndianFood(String name, int quantity, String rating, double price ,int spiceLevel, boolean isVegetarian){
        super(name,quantity,rating,price);
        this.spiceLevel = spiceLevel;
        this.isVegetarian = isVegetarian;
    }

    public int getSpiceLevel(){
        return spiceLevel;
    }

    public void setSpiceLevel(int level){
        spiceLevel = level;

    }

    public String getDiscountCoupon(){
        return discountCoupon;
    }

    public void IsDiscountApplied(boolean val){
        discountApplied = val;
    }

    public boolean vegetarianStatus(){
        return isVegetarian;
    }

    public void displayDetails(){
        System.out.println("Name : " + itemName);
        System.out.println("Rating : " + itemRating);
        System.out.println("Price RM : " + itemPrice);

        if(isVegetarian){
            System.out.println("It is vegetarian");
        }else{
            System.out.println("It is NOT vegetarian");
        }
    }

    public void displayReceipt(){
        super.displayReceipt();
        
        if(isVegetarian){
            System.out.println("*VEGETARIAN*");
        }else{
            System.out.println("*NOT VEGETARIAN*");
        }
        System.out.println("Spice level : " + spiceLevel);

        if(discountApplied){
            double discountPrice;
            discountPrice = itemPrice - (0.15*itemPrice);
            discountPrice = discountPrice + 2;
            System.out.println("Total Price = " + discountPrice + " (Including 15% discount and 2RM delivery fee)" );}
            else{
                double price;
                price = itemPrice + 2;
    
                System.out.println("Total Price = " + price+ " (Including 2RM delivery fee)" );
            }



    }





    


}
