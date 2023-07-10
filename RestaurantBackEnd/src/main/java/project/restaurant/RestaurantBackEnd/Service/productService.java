package project.restaurant.RestaurantBackEnd.Service;

import project.restaurant.RestaurantBackEnd.Model.Product;

import java.util.Collection;
import java.util.List;

public interface productService {
  Product createProduct(Product product);
  List<Product> listProduct();
  Product updateProduct(Product product);

  Product findProductByName(String productName);

  void deleteProduct(Long id);


}
