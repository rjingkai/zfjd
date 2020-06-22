package com.khjy.zfjd.mapper;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.khjy.zfjd.model.Code;
import com.khjy.zfjd.model.PersonsInvoled;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


/**
 * 办案中心数据查询
 * @author renjingkai
 */
@DS("bazx")
@Mapper
public interface PersonMapper {

//    /**
//     * 得到办案中心的数据
//     * @return
//     */
//    public List<Data> getPerson(@Param("badw") String badw);
//
    /**
     * 得到办案单位信息
     * @param
     * @return
     */
    public List<Code> getBadw();


    /**
     * 根据组织机构no查ID
     * @return
     */
    public String getBadwid(@Param("orgno") String orgno);


    /**
     * 查询办案中心所有的人员编号，用于比对未上传的视频信息
     * @return
     */
    public  List<String> getBazxHc();


    /**
     * 查询未上传视频的数据
     * @param badw
     * @param kssj
     * @param jssj
     * @param page
     * @return
     */
    public List<PersonsInvoled> getSpbd(@Param("rybhlist") List<String> rybh, @Param("badw") String badw, @Param("kssj") String kssj, @Param("jssj") String jssj, Page<PersonsInvoled> page);

}
