package com.waxes27.sHome;

import com.waxes27.sHome.Init.Network.NetworkConnect;
import com.waxes27.sHome.Init.XML.XmlConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SHomeApplication {

	public static void main(String[] args) throws IOException {
		XmlConsumer consumer = new XmlConsumer();

		SpringApplication.run(SHomeApplication.class, args);
		consumer.setupNetwork();
	}

}
