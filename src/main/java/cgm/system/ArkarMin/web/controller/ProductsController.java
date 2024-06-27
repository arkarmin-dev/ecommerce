package cgm.system.ArkarMin.web.controller;

import cgm.system.ArkarMin.bl.service.ProductService;
import cgm.system.ArkarMin.persistence.dao.ProductDAO;
import cgm.system.ArkarMin.web.form.ProductList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import cgm.system.ArkarMin.persistence.entity.Product;
import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    private ProductService productService;

    @Autowired
    public ProductDAO productDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToHomePage() { return "home"; }

    @RequestMapping(value = "/addProduct", method = RequestMethod.GET)
    public ModelAndView goToAddProductPage() {
        ProductList productList = new ProductList();
        ModelAndView model = new ModelAndView();
        model.setViewName("addProduct");
        model.addObject("productList", productList);
        return model;
    }

    @PostMapping(value = "/success")
    public String goToSuccessPage(@ModelAttribute("productList") ProductList productList) {
        this.productService.doSaveProduct(productList);
        return "success";
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ModelAndView showProducts() {
        ModelAndView model = new ModelAndView();
        List <Product> productList = productDAO.findAll();
        model.setViewName("products");
        model.addObject("product", productList);
        return model;
    }

//    @PutMapping(value = "/update")
//    public void updateProduct(Product product, Long productId) {
//        productService.updateProduct(Product product, Long productId);
//    }

}
