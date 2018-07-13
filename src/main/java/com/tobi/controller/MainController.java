package com.tobi.controller;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import java.awt.*;
import java.net.URI;
import java.rmi.server.ExportException;

/**
 * Created by 13560 on 2018-5-22.
 */
@Controller
public class MainController {
    @RequestMapping(value = "" )
    public String main(){
        return "main/index";
    }

    @RequestMapping(value = "blog" )
    public String blog(){
        return "main/blog";
    }
    @RequestMapping(value = "about" )
    public String about(){
        return "main/about";
    }
    @RequestMapping(value = "contact" )
    public String contact(){
        return "main/contact";
    }

    @RequestMapping(value = "rainyDay" )
    public String rainyDay(){

        return "rainy/rainyDay";
    }

    @RequestMapping(value = "fan" )
    public String fan(){

        return "fan/fan";
    }

    @RequestMapping(value = "nca" )
    public String nca(){

        return "nca/index";
    }

    @RequestMapping(value = "video" )
    public String video(){
        return "video/video";
    }
}
