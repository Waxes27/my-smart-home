package com.waxes27.sHome.Init.Network;

import java.io.IOException;

public class NetworkConnect {
    public String ssid;
    public String password;

    public NetworkConnect(String ssid, String passwd){
        this.ssid = ssid;
        this.password = passwd;
    }

    public NetworkConnect(){}

    public boolean connect() throws IOException {
        System.out.println("Starting connection to "+this.ssid);
        ProcessBuilder processBuilder = new ProcessBuilder("sh","-c",
                "nmcli d wifi connect "+this.ssid+" password "+this.password+"\n");
        Process process = processBuilder.start();
        while (true) {
            if (!process.isAlive()) {
                if (process.exitValue() == 0){
                    System.out.println("Connected...");
                }
                else {
                    System.out.println("Error connecting to "+this.ssid);
                }
                break;
            }
        }
        return false;
    }
}
