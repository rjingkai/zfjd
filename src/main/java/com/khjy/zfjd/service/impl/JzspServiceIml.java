package com.khjy.zfjd.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.khjy.zfjd.mapper.JzspMapper;
import com.khjy.zfjd.mapper.PersonMapper;
import com.khjy.zfjd.model.FzyspGlfkb;
import com.khjy.zfjd.model.PersonsInvoled;
import com.khjy.zfjd.service.JzspService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class JzspServiceIml implements JzspService {


    @Autowired
    private JzspMapper jzspMapper;


    @Autowired
    private PersonMapper personMapper;


    @Override
    public Page<FzyspGlfkb> getSp(Integer pageNo, Integer pageSize, String kssj, String jssj) {
        Page<FzyspGlfkb> page = new Page<>(pageNo,pageSize);
        List<FzyspGlfkb> list = jzspMapper.getSp(kssj,jssj,page);
        return page.setRecords(list);
    }

    @Override
    public Page<PersonsInvoled> getSpbd(Integer pageNo, Integer pageSize, String badw, String kssj, String jssj) {
        Page<PersonsInvoled> page = new Page<>(pageNo,pageSize);

        //得到警综平台已经回传的人员编号
        List<String> jzrybh = jzspMapper.getRybh();


        //得到办案中心所有的人员编号
        List<String> bazxHc = personMapper.getBazxHc();


        /**
         * 比对出未回传的数据
         */
        List<String> rybhlist = new ArrayList<>(bazxHc);

        //筛选出不在警综数据库中的人员编号
        rybhlist.removeAll(jzrybh);

        List<PersonsInvoled> list = personMapper.getSpbd(rybhlist,badw,kssj,jssj,page);

        return page.setRecords(list);
    }
}
