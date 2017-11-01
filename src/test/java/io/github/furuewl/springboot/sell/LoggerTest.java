package io.github.furuewl.springboot.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 日志测试类
 *
 * @author weilai
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1() {
        String name = "imooc";
        String password = "123456";
        log.debug("debug....");
        log.info("info....");
        log.info("name: " + name + " ,password: " + password);
        log.info("name:{}, password:{}", name, password);
        log.error("error....");
    }

}
