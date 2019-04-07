package com.neusoft.mangerservice.margerserviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.neusoft.bean.po.BaseAttrInfo;
import com.neusoft.bean.po.BaseCatalog1;
import com.neusoft.bean.po.BaseCatalog2;
import com.neusoft.bean.po.BaseCatalog3;
import com.neusoft.interfaces.MangerService;
import com.neusoft.mangerservice.dao.BaseAttrInfoMapper;
import com.neusoft.mangerservice.dao.BaseCatalog1Mapper;
import com.neusoft.mangerservice.dao.BaseCatalog2Mapper;
import com.neusoft.mangerservice.dao.BaseCatalog3Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class MangerServiceImpl implements MangerService {
    @Autowired
    BaseAttrInfoMapper baseAttrInfoMapper;
    @Autowired
    BaseCatalog1Mapper baseCatalog1Mapper;
    @Autowired
    BaseCatalog2Mapper baseCatalog2Mapper;
    @Autowired
    BaseCatalog3Mapper baseCatalog3Mapper;
    @Override
    public List<BaseCatalog1> getCatalog1() {
        return baseCatalog1Mapper.selectAll();
    }

    @Override
    public List<BaseCatalog2> getCatalog2(String catalog1Id) {
        BaseCatalog2 baseCatalog2 = new BaseCatalog2();
        baseCatalog2.setCatalog1Id(Long.parseLong(catalog1Id));
        return baseCatalog2Mapper.select(baseCatalog2);
    }

    @Override
    public List<BaseCatalog3> getCatalog3(String catalog2Id) {
        BaseCatalog3 baseCatalog3 = new BaseCatalog3();
        baseCatalog3.setCatalog2Id(Long.parseLong(catalog2Id));
        return baseCatalog3Mapper.select(baseCatalog3);
    }

    @Override
    public List<BaseAttrInfo> getAttrInfo(String catalog3Id) {
        BaseAttrInfo baseAttrInfo = new BaseAttrInfo();
        baseAttrInfo.setCatalog3Id(Long.parseLong(catalog3Id));
        return baseAttrInfoMapper.select(baseAttrInfo);
    }
}
