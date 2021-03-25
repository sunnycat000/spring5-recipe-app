package yan.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import yan.spring5recipeapp.domain.Category;
import yan.spring5recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
