package com.euroceramica.dashboard;

import com.euroceramica.dashboard.mqtt.MqttClientUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
		new MqttClientUtil();
	}

}
