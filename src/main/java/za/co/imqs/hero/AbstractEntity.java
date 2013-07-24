package za.co.imqs.hero;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.hateoas.Identifiable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/07/19
 * Time: 1:33 PM
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AbstractEntity<ID extends Serializable> implements Identifiable<ID> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private final ID id;

    protected AbstractEntity() {
        this.id = null;
    }
}