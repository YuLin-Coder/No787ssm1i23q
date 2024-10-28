package com.dao;

import com.entity.XueshengjiankangdakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjiankangdakaVO;
import com.entity.view.XueshengjiankangdakaView;


/**
 * 学生健康打卡
 * 
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface XueshengjiankangdakaDao extends BaseMapper<XueshengjiankangdakaEntity> {
	
	List<XueshengjiankangdakaVO> selectListVO(@Param("ew") Wrapper<XueshengjiankangdakaEntity> wrapper);
	
	XueshengjiankangdakaVO selectVO(@Param("ew") Wrapper<XueshengjiankangdakaEntity> wrapper);
	
	List<XueshengjiankangdakaView> selectListView(@Param("ew") Wrapper<XueshengjiankangdakaEntity> wrapper);

	List<XueshengjiankangdakaView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjiankangdakaEntity> wrapper);
	
	XueshengjiankangdakaView selectView(@Param("ew") Wrapper<XueshengjiankangdakaEntity> wrapper);
	
}
