package br.com.microservices.orchestrated.inventoryservice.core.utils;

import br.com.microservices.orchestrated.inventoryservice.core.dto.Event;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;


@Component
public class JsonUtil {

    private final ObjectMapper objectMapper;

    public JsonUtil(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String toJson(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (Exception e){
            return "";
        }
    }

    public Event toEvent(String json) {
        try {
            return objectMapper.readValue(json, Event.class);
        } catch (Exception ex){
            return null;
        }
    }
}
