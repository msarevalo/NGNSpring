package co.edu.uelbosque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="co.edu.uelbosque.persistencia")
public class NazaretApplication {

	public static void main(String[] args) {
		SpringApplication.run(NazaretApplication.class, args);
	}
}
