package com.waxes27.sHome.Controllers;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/wifi")
public class WifiController {

    @GetMapping
    public String getWifi(){
        return new JSONObject(
                "{" +
                        "\"ssid\" : \"waxes27\", " +
                        "\"password\" : \"password\"}"
        ).toString();
    }
}
