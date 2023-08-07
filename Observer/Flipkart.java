package Observer;

import java.util.LinkedList;
import java.util.List;

public class Flipkart {
    private List<OrderPlacerSub> subList = new LinkedList<>();
    private List<OrderCancelledSub> subListCancel = new LinkedList<>();
    public void register(OrderPlacerSub orderPlacerSub) {
        subList.add(orderPlacerSub);
    }

    public void unRegister(OrderPlacerSub orderPlacerSub) {
        subList.remove(orderPlacerSub);
    }

    public void registerCancel(OrderCancelledSub orderCancelledSub) {
        subListCancel.add(orderCancelledSub);
    }

    public void unRegisterCancel(OrderCancelledSub orderCancelledSub) {
        subListCancel.remove(orderCancelledSub);
    }
    public void onOrderPlaced() {
        for(OrderPlacerSub sub: subList) {
            sub.announceOrderPlaced();
        }
    }

    public void OnOrderCancel() {
        for(OrderCancelledSub sub: subListCancel) {
            sub.announceCancel();
        }

    }
}
