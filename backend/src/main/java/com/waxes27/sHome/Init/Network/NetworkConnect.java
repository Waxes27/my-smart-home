package com.waxes27.sHome.Init.Network;

import java.io.IOException;

public class NetworkConnect {
    public String ssid;
    public String password;

    public NetworkConnect() throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder(
                "sh","-c","echo 'kali' | sudo -S systemctl restart NetworkManager"
        );
        System.out.println("Restarting NetworkManager...");
        processBuilder.start();
        Thread.sleep(10000);

    }

    public boolean connect() throws IOException {
        System.out.println("Starting connection to "+this.ssid);
        ProcessBuilder processBuilder = new ProcessBuilder("sh","-c",
                "nmcli d wifi connect '"+this.ssid+"' password "+this.password+"\n");
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
