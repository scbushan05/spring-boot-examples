package in.bushansirgur.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bushansirgur.springboot.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
