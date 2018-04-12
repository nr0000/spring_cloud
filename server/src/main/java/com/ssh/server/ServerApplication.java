package com.ssh.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {

	/**
	 * spring cloud学习代码
	 * https://blog.csdn.net/forezp/article/details/70148833
	 *
	 * eureka集群学习：https://blog.csdn.net/tianyaleixiaowu/article/details/78184793
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}
}
