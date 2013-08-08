package za.co.imqs.iam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/08/06
 * Time: 11:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class HttpUserDetailsManagerTest {

    private UserDetailsManagerImpl userDetailsManagerImpl;

    @Before
    public void setup(){
        userDetailsManagerImpl = new UserDetailsManagerImpl();
    }

    @Test
    public void user_exists(){
        boolean result = userDetailsManagerImpl.userExists("imqs");
        Assert.assertTrue("Expected the user to exits" ,result);
    }
}
