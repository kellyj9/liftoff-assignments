package org.launchcode.VetConnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VetConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetConnectApplication.class, args);
	}

}