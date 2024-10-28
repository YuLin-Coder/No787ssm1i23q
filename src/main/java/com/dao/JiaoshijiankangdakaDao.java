package com.dao;

import com.entity.JiaoshijiankangdakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshijiankangdakaVO;
import com.entity.view.JiaoshijiankangdakaView;


/**
 * 教师健康打卡
 * 
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface JiaoshijiankangdakaDao extends BaseMapper<JiaoshijiankangdakaEntity> {
	
	List<JiaoshijiankangdakaVO> selectListVO(@Param("ew") Wrapper<JiaoshijiankangdakaEntity> wrapper);
	
	JiaoshijiankangdakaVO selectVO(@Param("ew") Wrapper<JiaoshijiankangdakaEntity> wrapper);
	
	List<JiaoshijiankangdakaView> selectListView(@Param("ew") Wrapper<JiaoshijiankangdakaEntity> wrapper);

	List<JiaoshijiankangdakaView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshijiankangdakaEntity> wrapper);
	
	JiaoshijiankangdakaView selectView(@Param("ew") Wrapper<JiaoshijiankangdakaEntity> wrapper);
	
}
