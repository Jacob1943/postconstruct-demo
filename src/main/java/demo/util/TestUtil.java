package demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import demo.service.TestService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Jacob Yeh
 * @date 2020/6/16
 */
@Component
public class TestUtil {

    @Autowired
    private TestService testService;

    private static TestUtil testUtil;

    @PostConstruct
    public void init() {
        testUtil = this;
    }

    public static void test() {
        testUtil.testService.test();
    }
}
