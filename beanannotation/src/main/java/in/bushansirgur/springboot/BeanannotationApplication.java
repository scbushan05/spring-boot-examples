package in.bushansirgur.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.bushansirgur.springboot.service.UserService;


@SpringBootApplication
public class BeanannotationApplication{

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanannotationApplication.class);
		//By its type
		//UserService uService = ctx.getBean(UserService.class);
		//by its alias name
		UserService uService = (UserService)ctx.getBean("myBean");
		System.out.println("Printing user service::"+uService.getList());
		
	}
}
