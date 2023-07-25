package Factory;

public class UiFactoryCreator {
    public static UIFactory getUIFactoryForPlatform(SupportedPlatform platform) {
        if(platform == SupportedPlatform.ANDROID) {
            return new AndroidUiFactory();
        } else {
            return new IosUiFactory();
        }
    }
}

