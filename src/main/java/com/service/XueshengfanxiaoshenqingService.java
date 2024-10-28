package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengfanxiaoshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengfanxiaoshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengfanxiaoshenqingView;


/**
 * 学生返校申请
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface XueshengfanxiaoshenqingService extends IService<XueshengfanxiaoshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengfanxiaoshenqingVO> selectListVO(Wrapper<XueshengfanxiaoshenqingEntity> wrapper);
   	
   	XueshengfanxiaoshenqingVO selectVO(@Param("ew") Wrapper<XueshengfanxiaoshenqingEntity> wrapper);
   	
   	List<XueshengfanxiaoshenqingView> selectListView(Wrapper<XueshengfanxiaoshenqingEntity> wrapper);
   	
   	XueshengfanxiaoshenqingView selectView(@Param("ew") Wrapper<XueshengfanxiaoshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengfanxiaoshenqingEntity> wrapper);
   	
}

