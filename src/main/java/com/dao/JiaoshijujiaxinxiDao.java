package com.dao;

import com.entity.JiaoshijujiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshijujiaxinxiVO;
import com.entity.view.JiaoshijujiaxinxiView;


/**
 * 教师居家信息
 * 
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface JiaoshijujiaxinxiDao extends BaseMapper<JiaoshijujiaxinxiEntity> {
	
	List<JiaoshijujiaxinxiVO> selectListVO(@Param("ew") Wrapper<JiaoshijujiaxinxiEntity> wrapper);
	
	JiaoshijujiaxinxiVO selectVO(@Param("ew") Wrapper<JiaoshijujiaxinxiEntity> wrapper);
	
	List<JiaoshijujiaxinxiView> selectListView(@Param("ew") Wrapper<JiaoshijujiaxinxiEntity> wrapper);

	List<JiaoshijujiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshijujiaxinxiEntity> wrapper);
	
	JiaoshijujiaxinxiView selectView(@Param("ew") Wrapper<JiaoshijujiaxinxiEntity> wrapper);
	
}
