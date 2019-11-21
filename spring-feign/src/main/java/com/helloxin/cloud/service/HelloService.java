package com.helloxin.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "baidu", url = "https://www.baidu.com")
public interface HelloService {

    @GetMapping("/")
    String consumer();

}
