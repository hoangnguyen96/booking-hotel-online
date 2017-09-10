package spring.hotel.booking.repository;

import org.springframework.data.repository.CrudRepository;
import spring.hotel.booking.entities.UserEntity;

/**
 * Created by PC on 09/10/17.
 */
public interface UserRepository extends CrudRepository<UserEntity, String> {
}
