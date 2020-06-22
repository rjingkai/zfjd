package com.khjy.zfjd.service.impl;

import com.khjy.zfjd.mapper.PersonMapper;
import com.khjy.zfjd.model.Code;
import com.khjy.zfjd.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * 办案中心人员的业务实现
 * @author renjignkai
 */
@Service
@CacheConfig(cacheNames = {"badwCache"})
public class PersonServiceImpl implements PersonService {


    @Autowired
    private PersonMapper personMapper;


    @Cacheable(key = "#root.method.name" ,value = "badwCache")
    @Override
    public List<Code> getBadw() {
        return personMapper.getBadw();
    }
}
