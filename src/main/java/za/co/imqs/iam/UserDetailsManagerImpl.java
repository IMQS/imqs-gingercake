package za.co.imqs.iam;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/08/06
 * Time: 11:28 AM
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
public class UserDetailsManagerImpl implements UserDetailsManager {



    @Override
    public void createUser(UserDetails user) {
        UserDetailsManagerImpl.log.warn("Creation of a user is not supported");
    }

    @Override
    public void updateUser(UserDetails user) {
        UserDetailsManagerImpl.log.warn("Update of user a is not supported");
    }

    @Override
    public void deleteUser(String username) {
        UserDetailsManagerImpl.log.warn("Deletion of a user is not supported");
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        UserDetailsManagerImpl.log.warn("Update of a user is not supported");
    }

    @Override
    public boolean userExists(String username) {

        //TODO http client

        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
