package project.restaurant.RestaurantBackEnd.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private Long id ;
    private String Name;
    private String lastName;
    private String email;
    private String password;
    private String picture;


}
