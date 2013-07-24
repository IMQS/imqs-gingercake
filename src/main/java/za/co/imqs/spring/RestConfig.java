package za.co.imqs.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.repository.context.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/06/18
 * Time: 3:29 PM
 * Creates a REST controller for the Repositories
 */
@Configuration
public class RestConfig extends RepositoryRestMvcConfiguration {

//    @Override protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//        config.addResourceMappingForDomainType(SecretIdentity.class)
//                .addResourceMappingFor("secret");
//
//        config.addResourceMappingForDomainType(SuperHero.class)
//                .addResourceMappingFor("hero");
//    }

    @Override protected void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener listener) {
        listener.addValidator("beforeSave", new NotNullValidator());
    }
}
