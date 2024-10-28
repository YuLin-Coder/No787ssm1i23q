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


import com.dao.JiaoshifanxiaoshenqingDao;
import com.entity.JiaoshifanxiaoshenqingEntity;
import com.service.JiaoshifanxiaoshenqingService;
import com.entity.vo.JiaoshifanxiaoshenqingVO;
import com.entity.view.JiaoshifanxiaoshenqingView;

@Service("jiaoshifanxiaoshenqingService")
public class JiaoshifanxiaoshenqingServiceImpl extends ServiceImpl<JiaoshifanxiaoshenqingDao, JiaoshifanxiaoshenqingEntity> implements JiaoshifanxiaoshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshifanxiaoshenqingEntity> page = this.selectPage(
                new Query<JiaoshifanxiaoshenqingEntity>(params).getPage(),
                new EntityWrapper<JiaoshifanxiaoshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshifanxiaoshenqingEntity> wrapper) {
		  Page<JiaoshifanxiaoshenqingView> page =new Query<JiaoshifanxiaoshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshifanxiaoshenqingVO> selectListVO(Wrapper<JiaoshifanxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshifanxiaoshenqingVO selectVO(Wrapper<JiaoshifanxiaoshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshifanxiaoshenqingView> selectListView(Wrapper<JiaoshifanxiaoshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshifanxiaoshenqingView selectView(Wrapper<JiaoshifanxiaoshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
