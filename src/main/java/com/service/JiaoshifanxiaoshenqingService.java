package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshifanxiaoshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshifanxiaoshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshifanxiaoshenqingView;


/**
 * 教师返校申请
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface JiaoshifanxiaoshenqingService extends IService<JiaoshifanxiaoshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshifanxiaoshenqingVO> selectListVO(Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);
   	
   	JiaoshifanxiaoshenqingVO selectVO(@Param("ew") Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);
   	
   	List<JiaoshifanxiaoshenqingView> selectListView(Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);
   	
   	JiaoshifanxiaoshenqingView selectView(@Param("ew") Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshifanxiaoshenqingEntity> wrapper);
   	
}

