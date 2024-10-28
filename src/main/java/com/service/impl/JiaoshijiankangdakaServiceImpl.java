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


import com.dao.JiaoshijiankangdakaDao;
import com.entity.JiaoshijiankangdakaEntity;
import com.service.JiaoshijiankangdakaService;
import com.entity.vo.JiaoshijiankangdakaVO;
import com.entity.view.JiaoshijiankangdakaView;

@Service("jiaoshijiankangdakaService")
public class JiaoshijiankangdakaServiceImpl extends ServiceImpl<JiaoshijiankangdakaDao, JiaoshijiankangdakaEntity> implements JiaoshijiankangdakaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshijiankangdakaEntity> page = this.selectPage(
                new Query<JiaoshijiankangdakaEntity>(params).getPage(),
                new EntityWrapper<JiaoshijiankangdakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshijiankangdakaEntity> wrapper) {
		  Page<JiaoshijiankangdakaView> page =new Query<JiaoshijiankangdakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshijiankangdakaVO> selectListVO(Wrapper<JiaoshijiankangdakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshijiankangdakaVO selectVO(Wrapper<JiaoshijiankangdakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshijiankangdakaView> selectListView(Wrapper<JiaoshijiankangdakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshijiankangdakaView selectView(Wrapper<JiaoshijiankangdakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
