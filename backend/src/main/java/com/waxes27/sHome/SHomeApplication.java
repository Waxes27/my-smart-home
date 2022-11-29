package com.waxes27.sHome;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.waxes27.sHome.Init.Network.NetworkConnect;
import com.waxes27.sHome.Init.ServerConnect;
import com.waxes27.sHome.Init.XML.XmlConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SHomeApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		XmlConsumer consumer = new XmlConsumer();


		SpringApplication.run(SHomeApplication.class, args);

//		consumer.setupNetwork();
		consumer.setupPublicServerConnection();
	}

}
