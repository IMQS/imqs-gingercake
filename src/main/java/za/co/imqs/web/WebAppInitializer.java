package za.co.imqs.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import za.co.imqs.spring.RepositoryRestMvcExtConfiguration;
import za.co.imqs.spring.SecurityConfiguration;
import za.co.imqs.spring.ServiceConfiguration;
import za.co.imqs.spring.WebMvcConfiguration;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * This Java class replaces the web.xml
 */

@Slf4j  //Will create SLF4J logger called log
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    /*
 * (non-Javadoc)
 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
 */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { ServiceConfiguration.class};
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
     */
    @Override
    protected Class<?>[]  getServletConfigClasses() {
        WebAppInitializer.log.info("WebMVC Configuration {}", WebMvcConfiguration.class.getName() );
        return new Class<?>[] { RepositoryRestMvcExtConfiguration.class, WebMvcConfiguration.class, SecurityConfiguration.class};
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
        return new Filter[] {};
    }


    @Override
	public void onStartup(ServletContext servletContext) throws ServletException
	{
        super.onStartup(servletContext);
        WebAppInitializer.log.info("Web Application Started");
	}



}
