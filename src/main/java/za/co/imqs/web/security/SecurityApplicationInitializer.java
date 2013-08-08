package za.co.imqs.web.security;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.ServletContext;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/08/02
 * Time: 3:45 PM
 */
/**
 * In conjunction with {@link za.co.imqs.web.RestApplicationInitializer}, this configuration class sets up Spring Security and Spring
 * Security OAuth.
 *
 * @author Rob Winch
 * @see za.co.imqs.web.RestApplicationInitializer
 */
public class SecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    /**
     * Instruct Spring Security to use the {@link org.springframework.web.servlet.DispatcherServlet}'s {@link org.springframework.web.context.WebApplicationContext} to find the
     * springSecurityFilterChain.
     */
    @Override
    protected String getDispatcherWebApplicationContextSuffix() {
        return AbstractDispatcherServletInitializer.DEFAULT_SERVLET_NAME;
    }

    /** Insert the following filters before Spring Security. Be careful when inserting filters before Spring Security! */
    @Override
    protected void afterSpringSecurityFilterChain(ServletContext servletContext) {
        insertFilters(servletContext, new HiddenHttpMethodFilter(), new OpenEntityManagerInViewFilter());
    }

    /** Register the {@link org.springframework.security.web.session.HttpSessionEventPublisher} */
    @Override
    protected boolean enableHttpSessionEventPublisher() {
        return true;
    }
}