package project.restaurant.RestaurantBackEnd.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.restaurant.RestaurantBackEnd.Model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Product findProductByProductName(String productName);
    Product findProductById(Long id);

}
