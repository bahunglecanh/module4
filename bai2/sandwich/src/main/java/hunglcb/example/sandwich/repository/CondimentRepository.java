package hunglcb.example.sandwich.repository;

import hunglcb.example.sandwich.entity.Condiment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CondimentRepository implements ICondimentRepository{
    private static final List<Condiment> condiments = new ArrayList<>();

    static {
        condiments.add(new Condiment(1, "Lettuce"));
        condiments.add(new Condiment(2, "Tomato"));
        condiments.add(new Condiment(3, "Mustard"));
        condiments.add(new Condiment(4, "Sprouts"));
    }
    @Override
    public List<Condiment> findAll() {
        return condiments;
    }

    @Override
    public Condiment findById(int id) {
        return condiments.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
