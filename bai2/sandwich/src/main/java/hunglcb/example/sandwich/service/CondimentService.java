package hunglcb.example.sandwich.service;

import hunglcb.example.sandwich.entity.Condiment;
import hunglcb.example.sandwich.repository.ICondimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CondimentService implements ICondimentService{
    @Autowired
    private ICondimentRepository repository;

    @Override
    public List<Condiment> getAll() {
        return repository.findAll();
    }

    @Override
    public Condiment getById(int id) {
        return repository.findById(id);
    }
}
