package Factory;

import Factory.Components.Button;

public class Client {
    public static void main(String[] args) {
        Flutter f = new Flutter();
        UIFactory ui = f.createUiFactory(SupportedPlatform.IOS);

        Button b = ui.createButton();
        System.out.println("Debug");
    }
}
