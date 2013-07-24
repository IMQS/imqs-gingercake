package za.co.imqs.hero;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/07/19
 * Time: 1:28 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
public class SuperHero extends AbstractEntity<Long> {

    private String heroName;

    //Which application created this hero
    private String who;

    //What is the id of the hero's identity
    private String idid;
}
