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


import com.dao.YiqingzixunDao;
import com.entity.YiqingzixunEntity;
import com.service.YiqingzixunService;
import com.entity.vo.YiqingzixunVO;
import com.entity.view.YiqingzixunView;

@Service("yiqingzixunService")
public class YiqingzixunServiceImpl extends ServiceImpl<YiqingzixunDao, YiqingzixunEntity> implements YiqingzixunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingzixunEntity> page = this.selectPage(
                new Query<YiqingzixunEntity>(params).getPage(),
                new EntityWrapper<YiqingzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingzixunEntity> wrapper) {
		  Page<YiqingzixunView> page =new Query<YiqingzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingzixunVO> selectListVO(Wrapper<YiqingzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingzixunVO selectVO(Wrapper<YiqingzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingzixunView> selectListView(Wrapper<YiqingzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingzixunView selectView(Wrapper<YiqingzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
