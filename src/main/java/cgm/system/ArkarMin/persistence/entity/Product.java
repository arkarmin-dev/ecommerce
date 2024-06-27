package cgm.system.ArkarMin.persistence.entity;


import cgm.system.ArkarMin.web.form.ProductList;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Columns;

import java.util.Date;


@Entity
@Data
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_price")
    private double productPrice;

    public Product (ProductList productList) {
        this.productName = productList.getProductName();
        this.productPrice = productList.getProductPrice();
    }
}


