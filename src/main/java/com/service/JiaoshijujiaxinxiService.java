package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshijujiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshijujiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshijujiaxinxiView;


/**
 * 教师居家信息
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface JiaoshijujiaxinxiService extends IService<JiaoshijujiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshijujiaxinxiVO> selectListVO(Wrapper<JiaoshijujiaxinxiEntity> wrapper);
   	
   	JiaoshijujiaxinxiVO selectVO(@Param("ew") Wrapper<JiaoshijujiaxinxiEntity> wrapper);
   	
   	List<JiaoshijujiaxinxiView> selectListView(Wrapper<JiaoshijujiaxinxiEntity> wrapper);
   	
   	JiaoshijujiaxinxiView selectView(@Param("ew") Wrapper<JiaoshijujiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshijujiaxinxiEntity> wrapper);
   	
}

