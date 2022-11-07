public class BangaliFood extends Food{
    private String itemType;
    private String discountCoupon = "Bangla100";
    private boolean discountApplied = false;

    BangaliFood(String name, int quantity, String rating, double price, String itemType){
        super(name,quantity,rating,price);
        this.itemType = itemType;
        
    }

    public String getItemType(){
        return itemType;
    }

    public String getDiscountCoupon(){
        return discountCoupon;
    }

    public void IsDiscountApplied(boolean val){
        discountApplied = val;
    }

    public void displayDetails(){
        System.out.println("Name : " + itemName);
        System.out.println("Rating : " + itemRating);
        System.out.println("Price RM : " + itemPrice);
        System.out.println("Item Type : " + itemType);
    }

    public void displayReceipt(){
        super.displayReceipt();
        System.out.println("ItemType: " + itemType);
    
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