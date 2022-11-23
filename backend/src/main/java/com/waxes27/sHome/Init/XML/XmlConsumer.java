package com.waxes27.sHome.Init.XML;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.waxes27.sHome.Init.Network.NetworkConnect;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class XmlConsumer {
    File file = new ClassPathResource("static/network.xml").getFile();
    XmlMapper mapper = new XmlMapper();

    public XmlConsumer() throws IOException {
    }

    public void setupNetwork() throws IOException {
        mapper.readValue(this.file, NetworkConnect.class).connect();
    }

}
