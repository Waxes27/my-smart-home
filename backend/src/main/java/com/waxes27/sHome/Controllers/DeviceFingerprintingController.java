package com.waxes27.sHome.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/device")
public class DeviceFingerprintingController{


    @GetMapping
    public String getDevice(){
        return "";
    }
}
