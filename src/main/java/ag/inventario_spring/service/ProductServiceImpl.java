package ag.inventario_spring.service;

import ag.inventario_spring.model.Product;
import ag.inventario_spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> listProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Product getProducBySku(Integer sku) {
        Product product = productRepository.findById(sku).orElse(null);
        return product;
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }
}
