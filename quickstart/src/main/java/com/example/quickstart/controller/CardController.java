package com.example.quickstart.controller;

import com.example.quickstart.dao.CardDAO;
import com.example.quickstart.dao.RecommandDAO;
import com.example.quickstart.entity.Card;
import com.example.quickstart.entity.Recommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CardController {
    @Resource
    private CardDAO cardDAO;

    @Resource
    private RecommandDAO recommandDAO;

    @GetMapping("card")
    public String getAll(ModelMap map) {
        List<Card> cardList = cardDAO.getCards();
        List<Recommand> recommandList = recommandDAO.getRecommands();
        map.addAttribute("cardList",cardList);
        map.addAttribute("recommandList",recommandList);
        return "tuijian";
    }
}

