package com.waxes27.sHome.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/wifi")
public class WifiController {

    @GetMapping(path = "/connect")
    public String connectToWifi(){

        return "Connected to Waxes27";
    }
}
