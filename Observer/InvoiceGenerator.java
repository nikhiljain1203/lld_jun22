package Observer;

public class InvoiceGenerator implements OrderPlacerSub {

    InvoiceGenerator(Flipkart flipkart) {
        flipkart.register(this);
    }
    @Override
    public void announceOrderPlaced() {
        invoiceGenerator();
    }

    private void invoiceGenerator() {
        System.out.println("generating invoice");
    }
}
