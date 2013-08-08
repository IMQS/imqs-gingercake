package za.co.imqs.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler;
import org.springframework.web.client.RestTemplate;
import za.co.imqs.configuration.client.ClientConfigurationFactory;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/08/06
 * Time: 11:57 AM
 * Configuration to integrate with other systems.
 * This is mostly to do with the infrastructure adaptors
 */
@Configuration
public class IntegrationConfiguration {

    private static final String IMQS_CONFIGURATION_FILE = "imqs.configuration.file";

    @Bean
    public HttpRequestExecutingMessageHandler httpOutBoundGateway() throws IOException {
        String url = (String) integrationConfig().getProperty("authentication.url");
        HttpRequestExecutingMessageHandler httpRequestExecutingMessageHandler = new HttpRequestExecutingMessageHandler(url, restTemplate());

        return httpRequestExecutingMessageHandler;
    }

    /**
     * @return a {@link java.util.Map} for the config to use for this Application
     * @throws {@link java.io.IOException} If there is a problem reading the config file
     */
    @Bean
    public static ClientConfigurationFactory integrationConfig() throws IOException {
        return new ClientConfigurationFactory(System.getProperty(IMQS_CONFIGURATION_FILE));
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public MessageChannel responseChannel(){
//       return new MessageChannel(){
//
//            @Override
//            public boolean send(Message<?> message) {
//                return false;  //To change body of implemented methods use File | Settings | File Templates.
//            }
//
//            @Override
//            public boolean send(Message<?> message, long timeout) {
//                return false;  //To change body of implemented methods use File | Settings | File Templates.
//            }
//        };
//    }
//
//
//    @Bean
//    public UserDetailsManager userDetailsManager(){
//        UserDetailsManager manager = new UserDetailsManagerImpl();
//        manager.setOutBound
//        return manager;
//    }




}
