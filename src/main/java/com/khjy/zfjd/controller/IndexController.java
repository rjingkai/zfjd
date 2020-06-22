package com.khjy.zfjd.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * 首页控制器
 * @author renjingkai
 */

@Controller
@RequestMapping("/")
public class IndexController {


    /**
     * 跳转比对数据页面
     * @return
     */
    @RequestMapping("/zfbabd")
    public String zfbabd(){
        return "zfba/"+"zfbabd";
    }


    /**
     * 跳转派出所在押人员信息的页面
     * @return
     */
    @RequestMapping("/pcszy")
    public String pcszy(){
        return "pcs/"+"pcszy";
    }


    /**
     * 跳转派出所在押预警信息的页面
     * @return
     */
    @RequestMapping("/pcsyj")
    public String pcsyj(){
        return "pcs/"+"pcsyj";
    }


    @RequestMapping("/")
    public String index(){
        return "bazx";
    }


    /**
     * 数据回传跳转页
     * @return
     */
    @RequestMapping("/sjhc")
    public String sjhc(){
        return "sjhc/"+"sjhc";
    }

    /**
     * 物品跳转页
     * @return
     */
    @RequestMapping("/ckwp")
    public String ckwp(String rybh, Model model){
        model.addAttribute("rybh",rybh);
        return "sjhc/"+"ckwp";
    }

    /**
     * 轨迹跳转页
     * @return
     */
    @RequestMapping("/ckgj")
    public String ckgj(String rybh,Model model){
        model.addAttribute("rybh",rybh);
        return "sjhc/"+"ckgj";
    }

    /**
     * 跳转综合查询的页面
     * @return
     */
    @RequestMapping("/cxxx")
    public String cxxx(){
        return "zfba/"+"cxxx";
    }


    /**
     * 跳转查看警综视频已回传的页面
     * @return
     */
    @RequestMapping("/jzspcx")
    public String jzspcx(){
        return "jzsp/jzspcx";
    }


    /**
     * 跳转警综视频比对的页面
     * @return
     */
    @RequestMapping("/jzspbd")
    public String jzspbd(){
        return "jzsp/jzspbd";
    }


}
