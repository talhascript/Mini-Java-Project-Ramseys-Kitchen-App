import java.util.Vector;
import java.util.Scanner;

public class RamseysKitchen{
    public static void main (String [] args){

        BangaliFood b1 = new BangaliFood("Shorshe Ilish", 0, "4 STARS", 4 , "Spicy");
        BangaliFood b2 = new BangaliFood("Pantha Bhat", 0, "3.5 STARS", 2, "Spicy");
        BangaliFood b3 = new BangaliFood("Phuchka", 0, "5 STARS", 4, "Sweet and Sour");
        BangaliFood b4 = new BangaliFood("Rosh Golla", 0, "4.5 STARS", 4, "Sweet");



        IndianFood i1 = new IndianFood("Chole Bhature", 0, "4 STARS", 3, 0, true);
        IndianFood i2 = new IndianFood("Mutton Curry", 0, "5 STARS", 5, 0, false);
        IndianFood i3 = new IndianFood("Doi Bora", 0, "4 STARS", 3, 0, true);
        IndianFood i4 = new IndianFood("Upma", 0, "3 STARS", 2, 0, true);


        FastFood f1 = new FastFood("Chicken Burger", 0, "4 STARS", 3, 205, 0.15, false , false);
        FastFood f2 = new FastFood("Chicken Wings (6 pieces)", 0, "5 STARS", 3, 200, 0.7, false , false);
        FastFood f3 = new FastFood("Chicken nuggets (6 pieces)", 0, "4 STARS", 4, 150, 0.5, false , false);
        FastFood f4 = new FastFood("Pizza", 0, "5 STARS", 5, 300, 0.15, false , false);

        Customer c = new Customer("Empty", "Empty", "Empty", "Empty");


        Vector<BangaliFood> bfood = new Vector<BangaliFood>();
        Vector<IndianFood> ifood = new Vector<IndianFood>();
        Vector<FastFood> ffood = new Vector<FastFood>();
        

        bfood.add(b1);
        bfood.add(b2);
        bfood.add(b3);
        bfood.add(b4);

        ifood.add(i1);
        ifood.add(i2);
        ifood.add(i3);
        ifood.add(i4);

        ffood.add(f1);
        ffood.add(f2);
        ffood.add(f3);
        ffood.add(f4);

        Food f = b1; // TEMPORARILY Making b1 an object of Food class

        Scanner keyboard = new Scanner(System.in);


        //////DISPLAY OUTPUT//////////

////////////////////////////////////////////////////////// PAGE 1- FOOD TYPE SELECTION

        System.out.println("Welcome to Ramseys Kitchen ! ");
        System.out.println("We have delicious Bangali food, Indian food and Fast-food");
        System.out.println("We have special offers on every single fast-food items (up to 15% off) and if you apply for a ");
        System.out.println("discount coupon (that we sent you through email) you can get discounts on our Indian and Bangali food.");
        System.out.println("So go on and order away!");

        for(int i = 0; i<110; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.println();

        System.out.println("1. Bangali food");
        System.out.println("2. Indian food");
        System.out.println("3. Fast food");
        System.out.println("4. Exit Ramseys Kitchen App");

        System.out.println();

        System.out.print("Choose an operation : ");
        int choice;
        int  SIZE = 4;
        int itemNum;
        


       
        choice = keyboard.nextInt();
            
           

        while (choice>4 || choice<1 ){
            System.out.print("Choose an operation : ");
            keyboard = new Scanner(System.in);
            choice = keyboard.nextInt();
        }




        if(choice == 4){
            System.out.println("Thank You For Using RAMSEYS KITCHEN APP");
            System.exit(0);
        }else if(choice == 1){
            
            for(int i=0; i<SIZE; i++){
                int count = i + 1;
                System.out.println("Item " + count + " :");
                bfood.elementAt(i).displayDetails();
                System.out.println();

            } 

        }else if(choice == 2){
    

            for(int i=0; i<SIZE; i++){
                int count = i + 1;
                System.out.println("Item " + count + " :");
                ifood.elementAt(i).displayDetails();
                System.out.println();

            } 
        }

        else if(choice == 3){


            for(int i=0; i<SIZE; i++){
                int count = i + 1;
                System.out.println("Item " + count + " :");
                ffood.elementAt(i).displayDetails();
                System.out.println();

            } 

        }

////////////////////////////////////////////////////////// PAGE 2- ITEM SELECTION // TAKING CUSTOMER INFORMATION

        System.out.print("Choose an operation : ");
        itemNum = keyboard.nextInt();

        while (itemNum>4 || itemNum<1 ){
            System.out.print("Choose an operation : ");
            keyboard = new Scanner(System.in);
            itemNum = keyboard.nextInt();
        }

        if((itemNum == 1 || itemNum == 2 ||  itemNum == 3 || itemNum == 4) && choice == 1){     //BANGLADESHI FOOD ORDERED
            String name;
            String gmail;
            String phoneNumber;
            String address = "";
            String coupon;
            boolean couponValidation;
            int quantity;

            System.out.print("Enter your name : "); 
            
            keyboard.nextLine();
            name = keyboard.nextLine();
            c.setName(name);
            System.out.println();

            System.out.print("Enter your gmail : ");
  
            gmail = keyboard.nextLine();
            c.setGmail(gmail);
            System.out.println();

            System.out.print("Enter your phone number : ");

            phoneNumber = keyboard.nextLine();
            c.setPhoneNumber(phoneNumber);
            System.out.println();


            System.out.print("Enter your address : ");

            address = keyboard.nextLine();
            c.setAddress(address);
            System.out.println();


            System.out.print("Do have a discount coupon? (Leave empty if no): ");

            coupon = keyboard.nextLine();

            if(itemNum == 1)
            {   f= b1;
                if(coupon.compareTo(b1.getDiscountCoupon()) == 0){
                couponValidation = true;
            }else{
                couponValidation = false;
            }

            b1.IsDiscountApplied(couponValidation);
            System.out.println();
            }

            else if(itemNum == 2){
                f = b2;
                if(coupon.compareTo(b2.getDiscountCoupon()) == 0){
                    couponValidation = true;
                }else{
                    couponValidation = false;
                }
    
                b2.IsDiscountApplied(couponValidation);
                System.out.println();
                
            }

            else if(itemNum == 3){
                f = b3;
                if(coupon.compareTo(b3.getDiscountCoupon()) == 0){
                    couponValidation = true;
                }else{
                    couponValidation = false;
                }
    
                b3.IsDiscountApplied(couponValidation);
                System.out.println();
                

            }
            else if(itemNum == 4){
                f = b4;
                if(coupon.compareTo(b4.getDiscountCoupon()) == 0){
                    couponValidation = true;
                }else{
                    couponValidation = false;
                }
    
                b4.IsDiscountApplied(couponValidation);
                System.out.println();
            }

           


            System.out.print("How many of this item do you want? ");

            quantity = keyboard.nextInt();

          
            f.setQuantity(quantity); //////////////////////////POLYMORPHISM APPLIED
            System.out.println();
            

        }

        else if((itemNum == 1 || itemNum == 2 ||  itemNum == 3 || itemNum == 4) && choice == 2){               //INDIAN FOOD ORDERED
            String name;
            String gmail;
            String phoneNumber;
            String address = "";
            String coupon;
            boolean couponValidation;
            int quantity;
            int spiceLevel;

            System.out.print("Enter your name : ");

            keyboard.nextLine();
            name = keyboard.nextLine();
            c.setName(name);
            System.out.println();

            System.out.print("Enter your gmail : ");

            gmail = keyboard.nextLine();
            c.setGmail(gmail);
            System.out.println();

            System.out.print("Enter your phone number : ");

            phoneNumber = keyboard.nextLine();
            c.setPhoneNumber(phoneNumber);
            System.out.println();

            System.out.print("Enter your address : ");

            address = keyboard.nextLine();
            c.setAddress(address);
            System.out.println();




            System.out.print("Do have a discount coupon? (Leave empty if no): ");

            coupon = keyboard.nextLine();

            if(itemNum == 1)
            {  f = i1; 
                if(coupon.compareTo(i1.getDiscountCoupon()) == 0){
                couponValidation = true;
            }else{
                couponValidation = false;
            }

            i1.IsDiscountApplied(couponValidation);
            System.out.println();
            }

            else if(itemNum == 2){
                f = i2;
                if(coupon.compareTo(i2.getDiscountCoupon()) == 0){
                    couponValidation = true;
                }else{
                    couponValidation = false;
                }
    
                i2.IsDiscountApplied(couponValidation);
                System.out.println();
                
            }

            else if(itemNum == 3){
                f = i3;
                if(coupon.compareTo(i3.getDiscountCoupon()) == 0){
                    couponValidation = true;
                }else{
                    couponValidation = false;
                }
    
                i3.IsDiscountApplied(couponValidation);
                System.out.println();
                

            }
            else if(itemNum == 4){
                f = i4;
                if(coupon.compareTo(i4.getDiscountCoupon()) == 0){
                    couponValidation = true;
                }else{
                    couponValidation = false;
                }
    
                i4.IsDiscountApplied(couponValidation);
                System.out.println();
            }

           


            System.out.print("How many of this item do you want? ");

            quantity = keyboard.nextInt();

            f.setQuantity(quantity); //////////////////////////POLYMORPHISM APPLIED


            System.out.print("What is the spice level you want in your food item (out of 10):  ");

            spiceLevel = keyboard.nextInt();

            while(spiceLevel>10 || spiceLevel<0){
            System.out.print("What is the spice level you want in your food item (out of 10):  ");
            keyboard = new Scanner(System.in);
            spiceLevel = keyboard.nextInt();
            }


            
            if(itemNum == 1)
            {i1.setSpiceLevel(spiceLevel);
                System.out.println();
            }

            else if(itemNum == 2){
                i2.setSpiceLevel(spiceLevel);
                System.out.println();
            }

            else if(itemNum == 3){
                i3.setSpiceLevel(spiceLevel);
                System.out.println();
            }

            else if(itemNum == 4){
                i4.setSpiceLevel(spiceLevel);
                System.out.println();
            }











        }


        else if((itemNum == 1 || itemNum == 2 ||  itemNum == 3 || itemNum == 4) && choice == 3){     ////////////////////FAST FOOD ORDERED
            String name= "";
            String gmail;
            String phoneNumber;
            String address = "";
            String ch;
            int quantity;        


            
            System.out.print("Enter your name : ");
            keyboard.nextLine();
            name = keyboard.nextLine();
            c.setName(name);
            System.out.println();

            System.out.print("Enter your gmail : ");

            gmail = keyboard.nextLine();
            c.setGmail(gmail);
            System.out.println();

            System.out.print("Enter your phone number : ");

            phoneNumber = keyboard.nextLine();
            c.setPhoneNumber(phoneNumber);
            System.out.println();

            System.out.print("Enter your address : ");

            address = keyboard.nextLine();
            c.setAddress(address);
            System.out.println();


            System.out.print("How many of this item do you want? ");

            quantity = keyboard.nextInt();

            if(itemNum == 1)
            {   f = f1;
                f.setQuantity(quantity);  //////////////////////////POLYMORPHISM APPLIED
                System.out.println();
            }

            else if(itemNum == 2){
                f = f2;
                f.setQuantity(quantity);  //////////////////////////POLYMORPHISM APPLIED
                System.out.println();
            }

            else if(itemNum == 3){
                f = f3;
                f.setQuantity(quantity);  //////////////////////////POLYMORPHISM APPLIED
                System.out.println();
            }

            else if(itemNum == 4){
                f = f4;
                f.setQuantity(quantity);  //////////////////////////POLYMORPHISM APPLIED
                System.out.println();
            }


            keyboard.nextLine();
  
          

            do{
                System.out.print("Do you want extra cheese on your item?(Y/N) (costs extra RM 5) ");
                ch = keyboard.nextLine();

            }while(!(ch.equalsIgnoreCase("y")) && !(ch.equalsIgnoreCase("n")));


             if(itemNum == 1)
            {
                if(ch.equalsIgnoreCase("y")){
                    double extra;
                    f1.addExtraCheese();
                    extra = f.getPrice() + 5;
                    f.setPrice(extra);  //////////////////////////  POLYMORPHISM APPLIED
                }
            }

            else if(itemNum == 2){
                if(ch.equalsIgnoreCase("y")){
                    double extra;
                    f2.addExtraCheese();
                    extra = f.getPrice() + 5;
                    f.setPrice(extra);  //////////////////////////POLYMORPHISM APPLIED
                }

            }

            else if(itemNum == 3){
                if(ch.equalsIgnoreCase("y")){
                    double extra;
                    f3.addExtraCheese();
                    extra = f.getPrice() + 5;
                    f.setPrice(extra);  //////////////////////////POLYMORPHISM APPLIED
                }
            }

            else if(itemNum == 4){
                if(ch.equalsIgnoreCase("y")){
                    double extra;
                    f4.addExtraCheese();
                    extra = f.getPrice() + 5;
                    f.setPrice(extra);  //////////////////////////POLYMORPHISM APPLIED
                }
            }













                
            System.out.print("Do you want extra sauce on your item?(Y/N) (costs extra RM 2) ");
            ch = keyboard.nextLine();
  
            while(!(ch.equalsIgnoreCase("y")) && !(ch.equalsIgnoreCase("n"))){
                System.out.print("Do you want extra sauce on your item?(Y/N) (costs extra RM 2) ");
                ch = keyboard.nextLine();

            }

             if(itemNum == 1)
            {
                if(ch.equalsIgnoreCase("y")){
                    double extra;
                    f1.addExtraSauce();
                    extra = f.getPrice() + 2;
                    f.setPrice(extra);  //////////////////////////POLYMORPHISM APPLIED
                }
            }

            else if(itemNum == 2){
                if(ch.equalsIgnoreCase("y")){
                    double extra;
                    f2.addExtraSauce();
                    extra = f.getPrice() + 2;
                    f.setPrice(extra);  //////////////////////////POLYMORPHISM APPLIED
                }

            }

            else if(itemNum == 3){
                if(ch.equalsIgnoreCase("y")){
                    double extra;
                    f3.addExtraSauce();
                    extra = f.getPrice() + 2;
                    f.setPrice(extra);  //////////////////////////POLYMORPHISM APPLIED
                }
            }

            else if(itemNum == 4){
                if(ch.equalsIgnoreCase("y")){
                    double extra;
                    f4.addExtraSauce();
                    extra = f.getPrice() + 2;
                    f.setPrice(extra);  //////////////////////////POLYMORPHISM APPLIED
                }

            }

  

        }



















    


//////////////// DISPLAY RECEIPT ///////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println();
System.out.println("Order confirmed");
c.customerInfo();
System.out.println();
f.displayReceipt();  /// POLYMORPHISM APPLIED

System.out.println("Delivery Status : Cooking");
System.out.println("Minimum wait time : 1 hour");
System.out.println();
System.out.println();

///////////////////////////////////////////////////////////////////////////  END /////////////////////////////////////////////////////








keyboard.close(); 
}
}


