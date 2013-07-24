package za.co.imqs.hero;

import za.co.imqs.webserver.DefaultApplication;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/07/19
 * Time: 1:47 PM
 * Application to create a Hero when you need one.
 */
public class INeedAHeroApp extends DefaultApplication {

    public static void main(String... anArgs) throws Exception{
        new INeedAHeroApp(anArgs).start();
    }

    public INeedAHeroApp(String... config) throws URISyntaxException, MalformedURLException {
        super(config);
    }
}
