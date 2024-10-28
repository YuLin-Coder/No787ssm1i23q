package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingzixunView;


/**
 * 疫情资讯
 *
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public interface YiqingzixunService extends IService<YiqingzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingzixunVO> selectListVO(Wrapper<YiqingzixunEntity> wrapper);
   	
   	YiqingzixunVO selectVO(@Param("ew") Wrapper<YiqingzixunEntity> wrapper);
   	
   	List<YiqingzixunView> selectListView(Wrapper<YiqingzixunEntity> wrapper);
   	
   	YiqingzixunView selectView(@Param("ew") Wrapper<YiqingzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingzixunEntity> wrapper);
   	
}

