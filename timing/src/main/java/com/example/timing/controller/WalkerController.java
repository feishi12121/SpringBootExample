package com.example.timing.controller;

import com.example.timing.entity.Walker;
import com.example.timing.service.WalkerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller

@RequestMapping(value = "/sporter")
public class WalkerController {

    @Resource
    private WalkerService walkerService;


    @GetMapping()
    public String test() {
        return "login";
    }

    @GetMapping(value = "/list")
    public String list(String account, String password, ModelMap map) {
        map.addAttribute("person",walkerService.findByAccountAndPassword(account,password));
        map.addAttribute("list",walkerService.getAll());
        return "list";
    }
}
