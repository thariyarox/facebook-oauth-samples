package com.tharindu.oauth.facebookapp.data;

import java.util.HashMap;
import java.util.Map;

public class ResourceDataHolder {

    private static volatile Map<String, String> resourceMap;
    private static ResourceDataHolder resourceDataHolder;

    private ResourceDataHolder() {

        resourceMap = new HashMap<String, String>();
    }

    public static ResourceDataHolder getInstance() {

        if(resourceDataHolder == null){

            synchronized (ResourceDataHolder.class) {
                if(resourceDataHolder == null) {
                    resourceDataHolder = new ResourceDataHolder();
                }
            }
        }

        return resourceDataHolder;
    }

    public void addResource(String key, String value){
        resourceMap.put(key, value);
    }

    public String getResource(String key){
        return resourceMap.get(key);
    }

}
