package com.nhooo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController
{
    @Autowired
    private IProductService productService;
    //将getProduct()方法映射到/product
    @GetMapping(value = "/product")
    public List<Product> getProduct() {
        //查找所有产品
        List<Product> products = productService.findAll();
        //返回产品列表
        return products;
    }
}
