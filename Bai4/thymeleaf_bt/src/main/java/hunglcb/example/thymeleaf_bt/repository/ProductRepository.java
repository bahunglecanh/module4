package hunglcb.example.thymeleaf_bt.repository;

import hunglcb.example.thymeleaf_bt.entity.Product;
import hunglcb.example.thymeleaf_bt.utils.ConnectionUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class ProductRepository implements IProductRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        List<Product> productList=new ArrayList<>();
        TypedQuery<Product> query=entityManager.createQuery("from Product ",Product.class);
        productList=query.getResultList();
        return productList;
    }

    @Override
    public Product findById(Long id) {
        Product product=entityManager.find(Product.class,id);
        return product;
    }
    @Transactional
    @Override
    public void save(Product product) {
        try{
            entityManager.persist(product);
        }catch (Exception e){
            System.out.println("error");
        }
    }

    @Override
    public void update(Long id, Product product) {
        Product old = findById(id);
        if (old != null) {
            old.setName(product.getName());
            old.setPrice(product.getPrice());
            old.setDescription(product.getDescription());
            old.setManufacturer(product.getManufacturer());
        }
    }

}
