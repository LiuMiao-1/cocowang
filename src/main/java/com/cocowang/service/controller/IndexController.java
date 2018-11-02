package com.cocowang.service.controller;

import com.cocowang.service.model.BannerModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String Index(){
        return "cocowang";
    }

    @RequestMapping("/getBanner")
    public List<BannerModel> getBanner(){
        List<BannerModel> list = new ArrayList<>();
        for (int i=0;i<3;i++){
            BannerModel model = new BannerModel();
            model.setSort(i);
            model.setTitle("图片"+i);
            model.setUrl("http://www.baidu.com");
            list.add(model);
        }
        return list;
    }


}
