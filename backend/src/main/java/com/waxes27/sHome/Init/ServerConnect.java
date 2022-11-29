package com.waxes27.sHome.Init;


import java.io.File;
import java.io.IOException;

public class ServerConnect {
    public String ip = "102.221.36.216";
    public String username = "root";
    public String port = "2027";

    private final StringBuffer sb = new StringBuffer("ssh -R ");

    public ServerConnect(){
        this.sb.append(this.port)
                .append(":127.0.0.1:")
                .append("80")
                .append(" ")
                .append(this.username)
                .append("@")
                .append(this.ip)
                .append(" &");
    }

    public void connect() throws IOException {
        System.out.println(this.sb);
        ProcessBuilder processBuilder = new ProcessBuilder(
                "sh","-c",
                this.sb.toString()
        );
//        processBuilder.redirectOutput(new File(
//                "/home/waxes27/.config/Server.out"
//        )).start();
        System.out.println("Connection Successful");
    }
}
