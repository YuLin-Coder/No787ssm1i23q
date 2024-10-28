package com.entity.view;

import com.entity.YiqingzixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫情资讯
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
@TableName("yiqingzixun")
public class YiqingzixunView  extends YiqingzixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YiqingzixunView(){
	}
 
 	public YiqingzixunView(YiqingzixunEntity yiqingzixunEntity){
 	try {
			BeanUtils.copyProperties(this, yiqingzixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
