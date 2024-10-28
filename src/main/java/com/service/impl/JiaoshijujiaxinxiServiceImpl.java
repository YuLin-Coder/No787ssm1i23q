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


import com.dao.JiaoshijujiaxinxiDao;
import com.entity.JiaoshijujiaxinxiEntity;
import com.service.JiaoshijujiaxinxiService;
import com.entity.vo.JiaoshijujiaxinxiVO;
import com.entity.view.JiaoshijujiaxinxiView;

@Service("jiaoshijujiaxinxiService")
public class JiaoshijujiaxinxiServiceImpl extends ServiceImpl<JiaoshijujiaxinxiDao, JiaoshijujiaxinxiEntity> implements JiaoshijujiaxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshijujiaxinxiEntity> page = this.selectPage(
                new Query<JiaoshijujiaxinxiEntity>(params).getPage(),
                new EntityWrapper<JiaoshijujiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshijujiaxinxiEntity> wrapper) {
		  Page<JiaoshijujiaxinxiView> page =new Query<JiaoshijujiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshijujiaxinxiVO> selectListVO(Wrapper<JiaoshijujiaxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshijujiaxinxiVO selectVO(Wrapper<JiaoshijujiaxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshijujiaxinxiView> selectListView(Wrapper<JiaoshijujiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshijujiaxinxiView selectView(Wrapper<JiaoshijujiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
