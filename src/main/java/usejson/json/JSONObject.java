package usejson.json;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LiZhengxian on 2016/12/24 0024.
 */
public class JSONObject {
    private Map<String,Object> map;


    public JSONObject() {
        new JSONObject(16);
    }

    public JSONObject(int initialCapacity) {
        this.map = new HashMap<>(initialCapacity);
    }

    public void put(String key, Object value){
        map.put(key,value);
    }

    // get some value here;
}
