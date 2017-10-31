package io.github.furuewl.springboot.sell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello
 *
 * @author weilai
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    /**
     * sayHello
     *
     * @return 结果
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "HelloSpring";
    }

}
