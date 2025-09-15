package hunglcb.example.calculate.repository;

import hunglcb.example.calculate.entity.Operation;

import java.util.List;

public interface IOperationRepository {
    List<Operation> findAll();
    Operation findBySymbol(String symbol);
}
