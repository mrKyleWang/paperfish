package top.paperfish.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 页面控制
 * author：KyleWang
 * version：1.0
 * date：2018年10月19日
 */
@RestController
public class PageController {

    @RequestMapping("/")
    public String indexPage(){
        return "访问成功！";
    }
}
