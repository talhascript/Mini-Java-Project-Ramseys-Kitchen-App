public class Food {
    protected String itemName;
    protected int quantity;
    protected String itemRating;
    protected double itemPrice;

    Food(String itemName, int quantity, String itemRating, double itemPrice){
        this.itemName = itemName;
        this.quantity = quantity;
        this.itemRating = itemRating;
        this.itemPrice = itemPrice;
    }

    public String getItemName(){
        return itemName;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getRating(){
        return itemRating;
    }

    public double getPrice(){
        return itemPrice;
    }

    public void setQuantity(int _quantity){
        quantity = _quantity;
    }

    
    public void setPrice(double _price){
        itemPrice = _price;
    }

    public void displayReceipt(){
        System.out.println(quantity + " x " + itemName);
        System.out.println("Rating : " + itemRating);
        System.out.println("Price RM : " + itemPrice * quantity);

        itemPrice = itemPrice *quantity;
    }






}
