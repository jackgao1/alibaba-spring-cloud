package com.aliware.edas.service;

import com.aliware.edas.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "tset", fallback = EchoServiceFallback.class)
public interface EchoService {

    @GetMapping(value = "/echo/{str}")
    String rest(@PathVariable String str);

}
