package com.moneda.utils;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseEntityCustom {
    public static ResponseEntity<Map<String, Object>> builderResponse(String message, Object data, Integer status){
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        response.put("data", data);
        return ResponseEntity.status(status).body(response);
    }
}
