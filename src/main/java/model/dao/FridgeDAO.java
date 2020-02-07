package model.dao;

import model.entity.Fridge;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lombok.Getter;

/**
 *
 * @author johanericsson
 */
@Stateless
public class FridgeDAO extends AbstractDAO<Fridge> {
    @Getter @PersistenceContext(unitName = "ifridge")
    private EntityManager entityManager;
    
    public FridgeDAO(){
            super(Fridge.class);
    }
    public List<Fridge> findFridgesMatchingName(){
        throw new UnsupportedOperationException("Not yet implemented");
    }
}




