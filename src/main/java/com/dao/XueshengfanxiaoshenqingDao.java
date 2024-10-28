package com.dao;

import com.entity.XueshengfanxiaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengfanxiaoshenqingVO;
import com.entity.view.XueshengfanxiaoshenqingView;


/**
 * 学生返校申请
 * 
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface XueshengfanxiaoshenqingDao extends BaseMapper<XueshengfanxiaoshenqingEntity> {
	
	List<XueshengfanxiaoshenqingVO> selectListVO(@Param("ew") Wrapper<XueshengfanxiaoshenqingEntity> wrapper);
	
	XueshengfanxiaoshenqingVO selectVO(@Param("ew") Wrapper<XueshengfanxiaoshenqingEntity> wrapper);
	
	List<XueshengfanxiaoshenqingView> selectListView(@Param("ew") Wrapper<XueshengfanxiaoshenqingEntity> wrapper);

	List<XueshengfanxiaoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengfanxiaoshenqingEntity> wrapper);
	
	XueshengfanxiaoshenqingView selectView(@Param("ew") Wrapper<XueshengfanxiaoshenqingEntity> wrapper);
	
}
