package im.haugsdal.playground.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class Index {

    // inject via application.properties
    //@Value("${welcome.message:test}")
    private String message = "Hallo Camilla!";

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("message", this.message);
        return "index";
    }
}