package project.restaurant.RestaurantBackEnd.Service.productServiceImplement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import project.restaurant.RestaurantBackEnd.Model.Product;
import project.restaurant.RestaurantBackEnd.Repository.ProductRepo;
import project.restaurant.RestaurantBackEnd.Service.productService;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductServiceImplement implements productService {
    private  final ProductRepo productRepo;
    @Override
    public Product createProduct(Product product) {

        return productRepo.save(product);
    }

    @Override
    public List<Product> listProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public Product findProductByName(String productName) {
        return productRepo.findProductByProductName(productName);

    }

    @Override
    public void deleteProduct(Long id) {
         productRepo.deleteById(id);
    }
}
