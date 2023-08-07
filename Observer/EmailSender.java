package Observer;

public class EmailSender implements OrderPlacerSub, OrderCancelledSub{
    EmailSender(Flipkart flipkart) {
        flipkart.register(this);
        flipkart.registerCancel(this);

    }
    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Email Sent");
    }

    @Override
    public void announceCancel() {
        sendEmail();
    }
}
