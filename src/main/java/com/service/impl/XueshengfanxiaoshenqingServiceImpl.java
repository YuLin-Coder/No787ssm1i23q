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


import com.dao.XueshengfanxiaoshenqingDao;
import com.entity.XueshengfanxiaoshenqingEntity;
import com.service.XueshengfanxiaoshenqingService;
import com.entity.vo.XueshengfanxiaoshenqingVO;
import com.entity.view.XueshengfanxiaoshenqingView;

@Service("xueshengfanxiaoshenqingService")
public class XueshengfanxiaoshenqingServiceImpl extends ServiceImpl<XueshengfanxiaoshenqingDao, XueshengfanxiaoshenqingEntity> implements XueshengfanxiaoshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengfanxiaoshenqingEntity> page = this.selectPage(
                new Query<XueshengfanxiaoshenqingEntity>(params).getPage(),
                new EntityWrapper<XueshengfanxiaoshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengfanxiaoshenqingEntity> wrapper) {
		  Page<XueshengfanxiaoshenqingView> page =new Query<XueshengfanxiaoshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengfanxiaoshenqingVO> selectListVO(Wrapper<XueshengfanxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengfanxiaoshenqingVO selectVO(Wrapper<XueshengfanxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengfanxiaoshenqingView> selectListView(Wrapper<XueshengfanxiaoshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengfanxiaoshenqingView selectView(Wrapper<XueshengfanxiaoshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
