public class Customer{
    private String name;
    private String gmail;
    private String phoneNumber;
    private String address;

    Customer(String name, String gmail, String phoneNumber, String address){
        this.name = name;
        this.gmail = gmail;
        this.address= address;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String _name){
        name = _name;
    }

    public void setGmail(String _gmaii){
        gmail = _gmaii;
    }

    public void setPhoneNumber(String _phoneNumber){
        phoneNumber = _phoneNumber;
    }

    public void setAddress(String _address){
        address = _address;
    }

    public void customerInfo(){
        System.out.println("Customer name : " + name);
        System.out.println("Customer Address : " + address);
        System.out.println("Customer phone :  " + phoneNumber);
        System.out.println("Customer email : " + gmail);


    }
}