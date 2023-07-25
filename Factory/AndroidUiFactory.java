package Factory;

import Factory.Components.AndroidButton;
import Factory.Components.AndroidMenu;

public class AndroidUiFactory implements UIFactory{

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
