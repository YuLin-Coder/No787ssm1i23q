package com.dao;

import com.entity.XueshengjujiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjujiaxinxiVO;
import com.entity.view.XueshengjujiaxinxiView;


/**
 * 学生居家信息
 * 
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface XueshengjujiaxinxiDao extends BaseMapper<XueshengjujiaxinxiEntity> {
	
	List<XueshengjujiaxinxiVO> selectListVO(@Param("ew") Wrapper<XueshengjujiaxinxiEntity> wrapper);
	
	XueshengjujiaxinxiVO selectVO(@Param("ew") Wrapper<XueshengjujiaxinxiEntity> wrapper);
	
	List<XueshengjujiaxinxiView> selectListView(@Param("ew") Wrapper<XueshengjujiaxinxiEntity> wrapper);

	List<XueshengjujiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjujiaxinxiEntity> wrapper);
	
	XueshengjujiaxinxiView selectView(@Param("ew") Wrapper<XueshengjujiaxinxiEntity> wrapper);
	
}
