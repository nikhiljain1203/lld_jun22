package Factory;

public class Flutter {
    public void setTheme() {

    }

    public void setRefreshRate() {

    }

    UIFactory createUiFactory(SupportedPlatform platform) {
        return UiFactoryCreator.getUIFactoryForPlatform(platform);
    }

}
