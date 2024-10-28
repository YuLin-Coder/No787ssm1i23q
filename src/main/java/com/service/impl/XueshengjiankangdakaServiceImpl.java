package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XueshengjiankangdakaDao;
import com.entity.XueshengjiankangdakaEntity;
import com.service.XueshengjiankangdakaService;
import com.entity.vo.XueshengjiankangdakaVO;
import com.entity.view.XueshengjiankangdakaView;

@Service("xueshengjiankangdakaService")
public class XueshengjiankangdakaServiceImpl extends ServiceImpl<XueshengjiankangdakaDao, XueshengjiankangdakaEntity> implements XueshengjiankangdakaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjiankangdakaEntity> page = this.selectPage(
                new Query<XueshengjiankangdakaEntity>(params).getPage(),
                new EntityWrapper<XueshengjiankangdakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjiankangdakaEntity> wrapper) {
		  Page<XueshengjiankangdakaView> page =new Query<XueshengjiankangdakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjiankangdakaVO> selectListVO(Wrapper<XueshengjiankangdakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjiankangdakaVO selectVO(Wrapper<XueshengjiankangdakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjiankangdakaView> selectListView(Wrapper<XueshengjiankangdakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjiankangdakaView selectView(Wrapper<XueshengjiankangdakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
