package za.co.imqs.iam;

import org.springframework.security.config.annotation.authentication.ProviderManagerBuilder;
import org.springframework.security.provisioning.UserDetailsManager;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/08/06
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserDetailsManagerConfigurer<B extends ProviderManagerBuilder<B>> extends
        org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer {

    protected UserDetailsManagerConfigurer(UserDetailsManager userDetailsManager) {
        super(userDetailsManager);
    }
}
