import com.config.TestConfig;
import com.study.bean.TestBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author xueshiqi
 * @since 2020/1/9
 * SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework的功能
 * @ContextConfiguration 用来加载配置ApplicationContext，其中classes属性用来加载配置类
 * @ActiveProfiles用来声明活动的profile
 * 可以使用普通@Autowired来注入Bean
 * 测试代码是否与预期的一致，通过JUnit的Assert来校验结果是否和预期一致
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;

    @Test
    public void prodbeanShouldInject(){
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
