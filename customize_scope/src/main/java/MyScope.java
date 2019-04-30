import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class MyScope implements Scope {

    Map<String, Object> map1 = new ConcurrentHashMap<String, Object>();
    Map<String, Object> map2 = new ConcurrentHashMap<String, Object>();

    public Object get(String name, ObjectFactory<?> objectFactory) {
        if(!map1.containsKey(name)){
            Object o = objectFactory.getObject();
            map1.put(name, o);
            return o;
        } if(!map2.containsKey(name)){
            Object o = objectFactory.getObject();
            map2.put(name, o);
            return o;
        }
        int i = new Random().nextInt();
        if (i == 0) {
            return map1.get(name);
        }else {
            return map2.get(name);
        }
    }

    public Object remove(String name) {
        if(map2.containsKey(name)){
            Object o = map2.get(name);
            map2.remove(name);
            return o;
        } if(map1.containsKey(name)){
            Object o = map1.get(name);
            map1.remove(name);
            return o;
        }
        return null;
    }

    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    public Object resolveContextualObject(String s) {
        return null;
    }

    public String getConversationId() {
        return null;
    }
}
