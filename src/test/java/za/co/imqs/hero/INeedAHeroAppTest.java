package za.co.imqs.hero;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import za.co.imqs.ContextUtils;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/07/19
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
public class INeedAHeroAppTest {

    private Boolean RUN_FOR_EVER = false;

    @Before
    public void setup() throws FileNotFoundException, MalformedURLException {
        ContextUtils.setup();
    }

    @Test
    public void start_application() throws Exception {

        final INeedAHeroApp application = new INeedAHeroApp(System.getProperty("imqs.configuration.file"));

        if(!RUN_FOR_EVER)
            shutdownHook(application);

        application.start();


    }

    /**
     * Shut the application down
     * @param application
     */
    private void shutdownHook(final INeedAHeroApp application) {
        new Thread( new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5500);
                } catch (InterruptedException e) {
                    log.error("thread rudely awaken",e );
                }finally {
                    log.debug("SHUT DOWN NOW");
                    while(application.getState().equals("STARTING")){
                        try {
                            log.debug("Wait a bit more still starting up...");
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            log.error("Rudely Awaken...%@#", e);
                        }
                    }
                    application.showdown();
                }

            }
        }).start();
    }
}
