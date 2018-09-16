package com.ahmedkhaled.kemai;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class KListReader {

    private Map<String, Object> map;
    private String key;

    public KListReader() {
    }

    public KListReader(Map<String, Object> map, String key) {
        this.map = map;
        this.key = key;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void editInMap(){
        editInMap(this.map, this.key);
    }

    public void editInMap(Map<String, Object> map, String key){
        List<Object> list = Collections.singletonList(map.get(key));
        String listString = convertListToString(list);

        if (listString.charAt(0) != '[') {
            map.put(key, list);
        }
        this.map =  map;
    }

    private String convertListToString(List<Object> list) {
        StringBuilder sb = new StringBuilder();
        list.forEach(sb::append);
        return sb.toString();
    }
}
