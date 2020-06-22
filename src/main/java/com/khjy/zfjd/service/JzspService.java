package com.khjy.zfjd.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.khjy.zfjd.model.FzyspGlfkb;
import com.khjy.zfjd.model.PersonsInvoled;
import com.khjy.zfjd.model.Ryxx;


public interface JzspService {


    public Page<FzyspGlfkb> getSp(Integer pageNo,Integer pageSize,String kssj, String jssj) ;

    public Page<PersonsInvoled> getSpbd(Integer pageNo, Integer pageSize, String badw, String kssj, String jssj);

}
