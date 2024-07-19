package com.hmall.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: hmall
 * @description:
 * @author: ljl
 * @create: 2024-07-19 18:03
 **/

@FeignClient("user-service")
public interface UserClient {
    @PutMapping("/money/deduct")
    void deductMoney(@RequestParam("pw") String pw, @RequestParam("amount") Integer amount);
}