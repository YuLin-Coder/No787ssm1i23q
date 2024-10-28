package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjujiaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjujiaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjujiaxinxiView;


/**
 * 学生居家信息
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface XueshengjujiaxinxiService extends IService<XueshengjujiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjujiaxinxiVO> selectListVO(Wrapper<XueshengjujiaxinxiEntity> wrapper);
   	
   	XueshengjujiaxinxiVO selectVO(@Param("ew") Wrapper<XueshengjujiaxinxiEntity> wrapper);
   	
   	List<XueshengjujiaxinxiView> selectListView(Wrapper<XueshengjujiaxinxiEntity> wrapper);
   	
   	XueshengjujiaxinxiView selectView(@Param("ew") Wrapper<XueshengjujiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjujiaxinxiEntity> wrapper);
   	
}

