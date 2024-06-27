package cgm.system.ArkarMin.bl.service;

import cgm.system.ArkarMin.persistence.dao.ProductDAO;
import cgm.system.ArkarMin.persistence.entity.Product;
import cgm.system.ArkarMin.web.form.ProductList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;

    @Override
    public void doSaveProduct(ProductList productList) {
        Product product = new Product(productList);
        this.productDAO.save(product);
    }

    @Override
    public void showProduct(){

    }
//    @Override
//    public void updateProduct(Product product, Long productId) {
//        Product selproduct = productDAO.findById(productId).get();
//        selproduct.setProductName(
//                product.getProductName()
//        );
//        selproduct.setProductPrice(
//                product.getProductPrice()
//        );
//
//        productDAO.save(selproduct);
//    }

}
