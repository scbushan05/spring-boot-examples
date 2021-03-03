package in.bushansirgur.springboot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.bushansirgur.springboot.entity.Product;
import in.bushansirgur.springboot.repo.ProductRepo;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class SpringbootjunitApplicationTests {
	
	@Autowired
	ProductRepo pRepo;
	
	@Test
	@Order(1)
	public void testCreate () {
		Product p = new Product();
		p.setId(1L);
		p.setName("Sony head phone");
		p.setDescription("good");
		p.setPrice(200.00);
		pRepo.save(p);
		assertNotNull(pRepo.findById(1L).get());
	}
	
	@Test
	@Order(2)
	public void testReadAll () {
		List<Product> list = pRepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testSingleProduct () {
		Product product = pRepo.findById(1L).get();
		assertEquals(200.00, product.getPrice());
	}
	
	@Test
	@Order(4)
	public void testUpdate() {
		Product p = pRepo.findById(1L).get();
		p.setPrice(100.00);
		pRepo.save(p);
		assertNotEquals(200.00, pRepo.findById(1L).get().getPrice());
	}
	
	@Test
	@Order(5)
	public void testDelete () {
		pRepo.deleteById(1L);
		assertThat(pRepo.existsById(1L)).isFalse();
	}

}



















