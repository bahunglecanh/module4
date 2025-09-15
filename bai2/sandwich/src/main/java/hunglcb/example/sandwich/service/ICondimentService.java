package hunglcb.example.sandwich.service;

import hunglcb.example.sandwich.entity.Condiment;

import java.util.List;

public interface ICondimentService {
    List<Condiment> getAll();
    Condiment getById(int id);
}
