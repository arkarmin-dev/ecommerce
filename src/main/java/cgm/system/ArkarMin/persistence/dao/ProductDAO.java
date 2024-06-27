package cgm.system.ArkarMin.persistence.dao;


import cgm.system.ArkarMin.persistence.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAO extends JpaRepository<Product, Long> {

    void updateProduct(Long productId);
}
