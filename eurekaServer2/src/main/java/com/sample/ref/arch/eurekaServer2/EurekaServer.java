package com.sample.ref.arch.eurekaServer2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
	
	public static void main(String args []){
		new SpringApplicationBuilder(EurekaServer.class).web(true).run(args);
	}

}
