package com.aliware.edas.service.fallback;

import com.aliware.edas.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String rest(String str) {
        return "OK";
    }
}