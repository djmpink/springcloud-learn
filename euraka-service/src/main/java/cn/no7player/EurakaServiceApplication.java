package cn.no7player;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurakaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaServiceApplication.class, args);
	}
}
