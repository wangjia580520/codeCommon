package com.forezp.listener;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 具体实现监听方法 注意需要注解 @Component
 */
@Component
public class ListenerImpl implements ApplicationListener<EventEntity> {
    @Override
    public void onApplicationEvent(EventEntity eventEntity) {
        System.out.println(JSONObject.toJSONString(eventEntity));
        System.out.println(eventEntity.getSource());
    }
}
