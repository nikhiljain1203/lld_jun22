import java.util.HashMap;
import java.util.Map;

public class ObjectContainer {
    Map<String, Object> objectMap;

    public ObjectContainer() {
        this.objectMap = new HashMap<>();
    }

    public void register(String key, Object object) {
        objectMap.put(key, object);
    }

    public Object get(String key) {
        return objectMap.get(key);
    }
}
