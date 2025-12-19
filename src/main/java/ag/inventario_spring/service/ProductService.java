package ag.inventario_spring.service;

import ag.inventario_spring.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listProducts();

    public Product getProducBySku(Integer sku);

    public void saveProduct(Product product);

    public void deleteProduct(Product product);
}
