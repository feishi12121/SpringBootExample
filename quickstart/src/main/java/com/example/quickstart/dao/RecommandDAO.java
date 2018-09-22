package com.example.quickstart.dao;

import com.example.quickstart.entity.Recommand;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class RecommandDAO {
    public List<Recommand> getRecommands() {
        Recommand[] recommands ={
                new Recommand("1.jpg","跑步好搭档"),
                new Recommand("2.jpg","给现代人的护眼小技巧"),
                new Recommand("6.jpg","青年居家生活指南"),
                new Recommand("7.jpg","PPT技巧"),
                new Recommand("10.jpg","健康生活"),
                new Recommand("5.jpg","青年大学习"),
                new Recommand("11.jpg","王宁你好骚啊")
        };
        List<Recommand> recommandList = Arrays.asList(recommands);
        return recommandList;
    }
}

