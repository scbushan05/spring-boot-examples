package in.bushansirgur.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.bushansirgur.springboot.service.UserService;

@Configuration
public class MyConfig {
	
	@Bean(name={"myBean", "mySecondBean"})
    public UserService getUser() {
        return new UserService();
    }
}
