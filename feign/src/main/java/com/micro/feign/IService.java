package com.micro.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author laicheng
 * @date 2020/8/18 6:03 下午
 */
@FeignClient(value = "eureka-client")
public interface IService {
    @RequestMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name") String name);
}
