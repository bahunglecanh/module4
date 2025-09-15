package hunglcb.example.sandwich.repository;

import hunglcb.example.sandwich.entity.Condiment;

import java.util.List;

public interface ICondimentRepository {
    List<Condiment> findAll();
    Condiment findById(int id);
}
