package za.co.imqs.spring;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/07/19
 * Time: 3:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class NotNullValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void validate(Object target, Errors errors) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
