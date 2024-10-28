package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjiankangdakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjiankangdakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjiankangdakaView;


/**
 * 学生健康打卡
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface XueshengjiankangdakaService extends IService<XueshengjiankangdakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjiankangdakaVO> selectListVO(Wrapper<XueshengjiankangdakaEntity> wrapper);
   	
   	XueshengjiankangdakaVO selectVO(@Param("ew") Wrapper<XueshengjiankangdakaEntity> wrapper);
   	
   	List<XueshengjiankangdakaView> selectListView(Wrapper<XueshengjiankangdakaEntity> wrapper);
   	
   	XueshengjiankangdakaView selectView(@Param("ew") Wrapper<XueshengjiankangdakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjiankangdakaEntity> wrapper);
   	
}

