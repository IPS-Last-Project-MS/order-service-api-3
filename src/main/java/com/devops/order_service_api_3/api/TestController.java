package com.devops.order_service_api_3.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-service/api/v1/tests")
public class TestController {

    @GetMapping
    public String test(){
        return "Order Service running on port (8003)";
    }

}
