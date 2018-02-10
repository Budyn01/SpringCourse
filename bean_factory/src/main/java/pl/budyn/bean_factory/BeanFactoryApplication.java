package pl.budyn.bean_factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.budyn.bean_factory.services.GreetingService;

@SpringBootApplication
public class BeanFactoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BeanFactoryApplication.class, args);

		System.out.println(ctx.getBean(GreetingService.class).sayGreetings());

	}
}
