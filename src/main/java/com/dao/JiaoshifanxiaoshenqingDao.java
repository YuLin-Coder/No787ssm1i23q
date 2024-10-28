package com.dao;

import com.entity.JiaoshifanxiaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshifanxiaoshenqingVO;
import com.entity.view.JiaoshifanxiaoshenqingView;


/**
 * 教师返校申请
 * 
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface JiaoshifanxiaoshenqingDao extends BaseMapper<JiaoshifanxiaoshenqingEntity> {
	
	List<JiaoshifanxiaoshenqingVO> selectListVO(@Param("ew") Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);
	
	JiaoshifanxiaoshenqingVO selectVO(@Param("ew") Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);
	
	List<JiaoshifanxiaoshenqingView> selectListView(@Param("ew") Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);

	List<JiaoshifanxiaoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);
	
	JiaoshifanxiaoshenqingView selectView(@Param("ew") Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);
	
}
