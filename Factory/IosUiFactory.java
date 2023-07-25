package Factory;

import Factory.Components.*;

public class IosUiFactory implements UIFactory{

    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}

