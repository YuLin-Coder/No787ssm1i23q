package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshijiankangdakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshijiankangdakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshijiankangdakaView;


/**
 * 教师健康打卡
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface JiaoshijiankangdakaService extends IService<JiaoshijiankangdakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshijiankangdakaVO> selectListVO(Wrapper<JiaoshijiankangdakaEntity> wrapper);
   	
   	JiaoshijiankangdakaVO selectVO(@Param("ew") Wrapper<JiaoshijiankangdakaEntity> wrapper);
   	
   	List<JiaoshijiankangdakaView> selectListView(Wrapper<JiaoshijiankangdakaEntity> wrapper);
   	
   	JiaoshijiankangdakaView selectView(@Param("ew") Wrapper<JiaoshijiankangdakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshijiankangdakaEntity> wrapper);
   	
}

