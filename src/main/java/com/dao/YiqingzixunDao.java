package com.dao;

import com.entity.YiqingzixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingzixunVO;
import com.entity.view.YiqingzixunView;


/**
 * 疫情资讯
 * 
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface YiqingzixunDao extends BaseMapper<YiqingzixunEntity> {
	
	List<YiqingzixunVO> selectListVO(@Param("ew") Wrapper<YiqingzixunEntity> wrapper);
	
	YiqingzixunVO selectVO(@Param("ew") Wrapper<YiqingzixunEntity> wrapper);
	
	List<YiqingzixunView> selectListView(@Param("ew") Wrapper<YiqingzixunEntity> wrapper);

	List<YiqingzixunView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingzixunEntity> wrapper);
	
	YiqingzixunView selectView(@Param("ew") Wrapper<YiqingzixunEntity> wrapper);
	
}
