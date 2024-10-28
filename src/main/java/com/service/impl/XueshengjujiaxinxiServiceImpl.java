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


import com.dao.XueshengjujiaxinxiDao;
import com.entity.XueshengjujiaxinxiEntity;
import com.service.XueshengjujiaxinxiService;
import com.entity.vo.XueshengjujiaxinxiVO;
import com.entity.view.XueshengjujiaxinxiView;

@Service("xueshengjujiaxinxiService")
public class XueshengjujiaxinxiServiceImpl extends ServiceImpl<XueshengjujiaxinxiDao, XueshengjujiaxinxiEntity> implements XueshengjujiaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjujiaxinxiEntity> page = this.selectPage(
                new Query<XueshengjujiaxinxiEntity>(params).getPage(),
                new EntityWrapper<XueshengjujiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjujiaxinxiEntity> wrapper) {
		  Page<XueshengjujiaxinxiView> page =new Query<XueshengjujiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjujiaxinxiVO> selectListVO(Wrapper<XueshengjujiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjujiaxinxiVO selectVO(Wrapper<XueshengjujiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjujiaxinxiView> selectListView(Wrapper<XueshengjujiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjujiaxinxiView selectView(Wrapper<XueshengjujiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
