package za.co.imqs.hero;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.repository.annotation.RestResource;

/**
 * Created with IntelliJ IDEA.
 * User: GerhardvW
 * Date: 2013/07/19
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */
@RestResource(path = "hero", rel ="hero")
public interface SuperHeroRepository extends PagingAndSortingRepository<SuperHero, Long> {

    /**
     * Search for a SuperHero by a his/hers superhero name
     * @param name
     * @return
     */
    @Query("select hero from SuperHero hero where hero.heroName = :name")
    public SuperHero search(@Param("name") String name);
}
