package com.waxes27.sHome.Init.XML;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.waxes27.sHome.Init.Network.NetworkConnect;

import com.waxes27.sHome.Init.ServerConnect;
import org.springframework.core.io.ClassPathResource;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class XmlConsumer {

    public void setupNetwork() throws IOException {
        XmlMapper mapper = new XmlMapper();
        File file = new ClassPathResource("network.xml").getFile();
        mapper.readValue(file, NetworkConnect.class).connect();
    }

    public void setupPublicServerConnection() throws IOException {
        XmlMapper mapper = new XmlMapper();
        System.out.println("Connecting to server");
        File file = new ClassPathResource("server.xml").getFile();
        mapper.readValue(file, ServerConnect.class).connect();
    }

}
