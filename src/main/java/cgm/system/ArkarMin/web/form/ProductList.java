package cgm.system.ArkarMin.web.form;

import cgm.system.ArkarMin.persistence.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductList {
    private String productName;
    private double productPrice;

    public ProductList (Product product) {
        this.productName = product.getProductName();
        this.productPrice = product.getProductPrice();
    }
}


