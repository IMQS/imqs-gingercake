package za.co.imqs.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/08/06
 * Time: 11:41 AM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServiceConfiguration.class,  RepositoryRestMvcExtConfiguration.class, WebMvcConfiguration.class, SecurityConfiguration.class})
@WebAppConfiguration
public class RestSpringContextTest {

    @Test
    public void test_run_context(){
        Assert.assertTrue(true);
    }
}
