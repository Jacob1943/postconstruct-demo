package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import demo.util.TestUtil;

/**
 * @author Jacob Yeh
 * @date 2020/6/16
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestPostContruct {

    @Test
    public void test() {
        TestUtil.test();
    }
}
