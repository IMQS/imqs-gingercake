package za.co.imqs;

import org.junit.Assert;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/06/18
 * Time: 1:30 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class ContextUtils {

    public static void setup() throws FileNotFoundException {

        File file = ResourceUtils.getFile("classpath:super-hero-config.json")  ;
        Assert.assertTrue(file.exists());
        String url = file.toURI().toString();
        System.setProperty("imqs.configuration.file", url);

    }
}
