package project.restaurant.RestaurantBackEnd.productController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.restaurant.RestaurantBackEnd.Model.Product;
import project.restaurant.RestaurantBackEnd.Service.productServiceImplement.ProductServiceImplement;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class productController {
    private final ProductServiceImplement productServiceImplement;

        @PostMapping("/addProduct")
        public ResponseEntity<Product> addProduct(@RequestBody Product product){
            Product newProduct = productServiceImplement.createProduct(product);
            return new ResponseEntity<>(newProduct,HttpStatus.CREATED);
        }


        @GetMapping("/listProducts")
        public ResponseEntity<List<Product>> getProducts(){
            List<Product> products = productServiceImplement.listProduct();
            return new ResponseEntity<>(products, HttpStatus.OK);
        }

        @GetMapping("/find/{name}")
    public  ResponseEntity<Product> getProductById(@PathVariable("name") String name){
            Product product = productServiceImplement.findProductByName(name);
            return new ResponseEntity<>(product , HttpStatus.OK);
        }

}
