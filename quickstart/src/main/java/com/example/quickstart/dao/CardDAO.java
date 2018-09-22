package com.example.quickstart.dao;

import com.example.quickstart.entity.Card;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class CardDAO {
    public List<Card> getCards() {
        Card[] cards = {
                new Card("1.jpg","张舟","3天前","如何学习Spring Boot","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑","2.jpg",66666,88),
                new Card("2.jpg","张小舟","4天前","工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？","3.png",666,88),
                new Card("5.jpg","张大舟","5天前","Chrome 在 10 周年之际发布了新版，除了好看还更安全","Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。","6.jpg",0,0),
                new Card("7.jpg","张三舟","1天前","Mac 上最好用的系统清理工具大更新，现在你还可以用它更新应用：CleanMyMac X","CleanMyMac X 率先在 Setapp 平台上推出，大版本更新不但带来了全新设计的应用界面，还新增了许多实用的工具，满足了 Mac 使用者清理系统的日常需求。","8.jpg",77,33),
                new Card("9.jpg","张四舟","三小时前","一顿饭钱能买到哪些好用的包月服务？","自从苹果在 2016 年调整了订阅模式下的开发者分成比例，越来越多的开发者尝试将自己的产品更改成了付费订阅制。不过今天，让我们抛开订阅制本身的孰是孰非，来看一下有哪些订阅服务是「物美价廉」的。","10.jpg",66,222),
                new Card("11.jpg","张五舟","6小时前","除了拨打 110，这些保障人身安全的方法希望你也能了解一下","除了大家熟知的 110 报警电话，各地公安机关也推出了短信报警、微信报警等多种报警方案，在危险发生的时保持冷静并采取措施并非易事，不过我们还是希望能尽量为大家提供更多选择","12.jpg",44,2),
                new Card("13.jpg","张舟舟","刚刚","把网页文章变成电子书装进 Kindle：Doocer","Doocer 是一款将网页文章批量抓取并推送到 Kindle 的实用工具，它允许用户提交网址、RSS 订阅源和 Pocket 稍后读的文章，批量制作成 ePub、MOBI 电子书。","14.jpg",44,22),
        };
        List<Card> cardList = Arrays.asList(cards);
        return cardList;
    }
}

