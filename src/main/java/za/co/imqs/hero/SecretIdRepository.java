package za.co.imqs.hero;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.repository.annotation.RestResource;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/07/19
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
@RestResource(path = "secret", rel ="secret")
public interface SecretIdRepository extends PagingAndSortingRepository<SecretIdentity, Long> {
}
