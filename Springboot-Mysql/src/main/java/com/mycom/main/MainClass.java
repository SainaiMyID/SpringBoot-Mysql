package com.mycom.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.mycom"})
@EnableJpaRepositories("com.mycom.repository")
@EntityScan( basePackages = {"com.mycom.pojo"} )
@EnableAutoConfiguration
public class MainClass {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}
	
//	@Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            int count=0;
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//                count++;
//            }
//            System.out.println("count.."+count);
//        };
//    }

}
