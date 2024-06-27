package cgm.system.ArkarMin.bl.service;


import cgm.system.ArkarMin.persistence.entity.Product;
import cgm.system.ArkarMin.web.form.ProductList;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    public void doSaveProduct(ProductList productList);
//    public void updateProduct(Product product, Long productId);
}
