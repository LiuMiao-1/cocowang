package com.cocowang.service.controller;

import com.cocowang.service.model.ArticleDetail;
import com.cocowang.service.model.ArticleModel;
import com.cocowang.service.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("detail")
public class DetailController {

    @Autowired
    ArticleService articleService;

    @RequestMapping("/article")
    public ArticleDetail getArticleDetail(int id){
        ArticleDetail detail = new ArticleDetail();
//        detail.setTitle("Spring");
//        detail.setContent("你可能正在想“Spring不过是另外一个的framework”(英语释义:框架，骨架；结构，构架)。当已经有许多开放源代码（和专有）J2EEframework时，我们为什么还需要Spring Framework？\n" +
//                "Spring是独特的，因为若干个原因：\n" +
//                "它定位的领域是许多其他流行的framework没有的。Spring致力于提供一种方法管理你的业务对象。\n" +
//                "Spring是全面的和模块化的。Spring有分层的体系结构，这意味着你能选择使用它孤立的任何部分，它的架构仍然是内在稳定的。因此从你的学习中，你可得到最大的价值。例如，你可能选择仅仅使用Spring来简单化JDBC的使用，或用来管理所有的业务对象。\n" +
//                "它的设计从底部帮助你编写易于测试的代码。Spring是用于测试驱动工程的理想的framework。\n" +
//                "Spring对你的工程来说，它不需要一个以上的framework。Spring是潜在地一站式解决方案，定位于与典型应用相关的大部分基础结构。它也涉及到其他framework没有考虑到的内容。");
        detail =articleService.getArticleModel(id);
        return detail;
    }

    public Boolean saveArticle(ArticleModel model){
         return true;
    }
}
