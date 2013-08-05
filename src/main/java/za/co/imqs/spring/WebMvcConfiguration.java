package za.co.imqs.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/07/19
 * Time: 12:42 PM
 * Extend The Default MVC Configuration.
 */
@Slf4j
@Configuration
@EnableJpaRepositories(basePackages = "za.co.imqs.hero")
@EnableTransactionManagement
public class WebMvcConfiguration extends WebMvcConfigurationSupport {

}
