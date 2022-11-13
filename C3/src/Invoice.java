public class Invoice {

    private String partNumber;
    private String partDescription;
    private int partQuantity;
    private double partPrice;

    public Invoice(){}

    public Invoice(String partNumber, String partDescription, int partQuantity, double partPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.partQuantity = partQuantity;
        this.partPrice = partPrice;
    }



}
