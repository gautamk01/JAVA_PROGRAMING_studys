package Lab_6;

public class invoice implements payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    //getter and setter
    public String getPartNumber(){return partNumber;}
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public String getPartDescription(){return  partDescription;}
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }
    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getPricePerItem(){return  pricePerItem;}
    public void setPricePerItem(double pricePerItem){
        this.pricePerItem=pricePerItem;
    }
    public double getPaymentAmount() {
    return  quantity*pricePerItem;
    }

    public void display(){
        System.out.println("INVOICE");
        System.out.println("PartNumber : "+getPartNumber());
        System.out.println("Part Description :"+getPartDescription());
        System.out.println("Quantity : "+ getQuantity());
        System.out.println("PricePer item : "+ getPricePerItem());
        System.out.println("Payment Amount : "+getPaymentAmount());
    }


}
