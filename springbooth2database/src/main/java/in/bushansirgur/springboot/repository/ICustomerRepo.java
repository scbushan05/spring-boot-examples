package in.bushansirgur.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springboot.entity.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}
