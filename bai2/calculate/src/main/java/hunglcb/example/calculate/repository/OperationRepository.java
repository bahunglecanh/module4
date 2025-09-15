package hunglcb.example.calculate.repository;

import hunglcb.example.calculate.entity.Operation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class OperationRepository implements IOperationRepository{
    private static final List<Operation> operations = new ArrayList<>();

    static {
        operations.add(new Operation("+", "Addition"));
        operations.add(new Operation("-", "Subtraction"));
        operations.add(new Operation("*", "Multiplication"));
        operations.add(new Operation("/", "Division"));
    }
    @Override
    public List<Operation> findAll() {
        return operations;
    }

    @Override
    public Operation findBySymbol(String symbol) {
        return operations.stream()
                .filter(op -> op.getSymbol().equals(symbol))
                .findFirst()
                .orElse(null);
    }
}
