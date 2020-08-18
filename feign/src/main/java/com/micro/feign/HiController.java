package com.micro.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author laicheng
 * @date 2020/8/18 6:04 下午
 */
@RestController
public class HiController {
    @Autowired
    IService iService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return iService.sayHi(name);
    }
}
