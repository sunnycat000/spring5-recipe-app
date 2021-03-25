package yan.spring5recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import yan.spring5recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
