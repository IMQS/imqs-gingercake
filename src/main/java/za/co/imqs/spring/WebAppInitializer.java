package za.co.imqs.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;


@Slf4j  //Will create SLF4J logger called log
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    /*
 * (non-Javadoc)
 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
 */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { };
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
     */
    @Override
    protected Class<?>[]  getServletConfigClasses() {
        WebAppInitializer.log.info("WebMVC Configuration {}", WebConfig.class.getName() );
        return new Class<?>[] { WebConfig.class};
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletFilters()
     */
    @Override
    protected javax.servlet.Filter[] getServletFilters() {
        DelegatingFilterProxy proxy = new DelegatingFilterProxy("springSecurityFilterChain");
        proxy.setContextAttribute("");
        return new javax.servlet.Filter[] { };
    }


    @Override
	public void onStartup(ServletContext servletContext) throws ServletException
	{
        super.onStartup(servletContext);
        WebAppInitializer.log.info("Web Application Started");
	}



}
