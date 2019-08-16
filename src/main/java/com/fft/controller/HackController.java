package com.fft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 2019/8/16.
 */
@RestController
@RequestMapping("hack")
public class HackController {

    @GetMapping("getScript")
    public String getScript() {
        return "script";
    }
}
